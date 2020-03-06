/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramon.holamundoejb;

import javax.ejb.Remote;

/**
 *
 * @author rperez
 */
@Remote
public interface HolaMundoEJBRemote {
    
    public int sumar(int a, int b);
}
