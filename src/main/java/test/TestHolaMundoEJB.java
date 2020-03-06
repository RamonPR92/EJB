/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.ramon.holamundoejb.HolaMundoEJBRemote;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
  * Un EJB es un Bean pero con varios servicios o caracteristicas incluidas 
  * solo añadiendo una anotacion, puede ser remoto o local, si es remoto se debe ubicar 
  * por medio del JNI Java Namming Interface, para esto el EJB deberá estar desplegado en el servidor de aplicaciones
  * la principal funcionalidad es la implementacion de sistemas distribuidos
  * @author rperez
  * */

public class TestHolaMundoEJB {
    public static void main(String[] args) {
        System.out.println("Inicia llamada al EJB desde el cliente");
        try {
            Context jndi = new InitialContext();
            HolaMundoEJBRemote holaMundoEJB = (HolaMundoEJBRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEJBImpl!com.ramon.holamundoejb.HolaMundoEJBRemote");
            int resultado = holaMundoEJB.sumar(5, 3);
            System.out.println("El resultado del EJB 5 + 3 = " + resultado);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
