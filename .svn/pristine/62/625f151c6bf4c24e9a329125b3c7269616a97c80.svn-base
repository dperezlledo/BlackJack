/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.blackjack.modelo;

/**
 *
 * @author dapelle
 */
public class Crupier extends Persona{
    private Mano mano;
    private Baraja baraja;

    public Crupier(String nombre, Baraja baraja) {
        setNombre(nombre);
        this.baraja = baraja;
        mano = new Mano();
    }

    public Mano getMano() {
        return this.mano;
    }

    public boolean plantarse() {
        // Calcular puntuacion
        if (mano.damePuntuacion()>16)
            return true;
        else
            return false;
    }
    
}
