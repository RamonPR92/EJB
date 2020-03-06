/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import domain.Persona;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import service.PersonaServiceRemote;

/**
 *
 * @author rperez
 */
public class Cliente {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente");
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaServiceRemote = (PersonaServiceRemote) jndi.lookup("java:global/HolaMundoEJB/PersonaServiceImpl!service.PersonaServiceRemote");
            List<Persona> personas = personaServiceRemote.listarPersonas();
            personas.forEach(System.out::println);
        } catch (NamingException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
