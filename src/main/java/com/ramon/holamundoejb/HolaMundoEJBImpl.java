/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramon.holamundoejb;

import javax.ejb.Stateless;

/**
 *
 * @author rperez
 */
@Stateless
public class HolaMundoEJBImpl implements HolaMundoEJBRemote{

    @Override
    public int sumar(int a, int b) {
        System.out.println("Ejecutando metodo sumar en el servidor");
        return a + b;
    }
   
}
