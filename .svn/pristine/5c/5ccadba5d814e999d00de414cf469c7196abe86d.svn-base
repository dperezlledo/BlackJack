package com.iescomercio.blackjack.vista;

import com.iescomercio.blackjack.controlador.Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dapelle
 */
public abstract class Vista {
    private Controlador c;

    public void setControlador(Controlador controlador) {
        c = controlador;
    }

    public Controlador getControlador() {
        return c;
    }
    
    public abstract void arranca(); 
    public abstract void pedirApuesta();
    public abstract boolean jugadorSePlanta();
    public abstract boolean otraPartida();
}
