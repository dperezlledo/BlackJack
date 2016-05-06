/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.blackjack.modelo;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author dapelle
 */
public class Mano {
    private LinkedHashSet <Carta> mano;

    public Mano() {
        mano = new LinkedHashSet();        
    }
    
    public boolean añadirCarta(Carta carta) {
        return mano.add(carta);            
    }
    
    public int damePuntuacion() {
        Iterator it = mano.iterator();
        int aux=0;
        Carta cartaAux;
        
        while(it.hasNext()) {
            cartaAux = (Carta) it.next();
            aux = aux + cartaAux.getValor();
        }
        return aux;
    }

    @Override
    public String toString() {
        Iterator it = mano.iterator();
        StringBuilder sb = new StringBuilder("");
        Carta cartaAux;
        
        while(it.hasNext()) {
            cartaAux = (Carta) it.next();
            sb.append(cartaAux + "\n");
        }
        return sb.toString();
        
    }
 
    public void inicializarMano() {
        mano.clear();
    }
    
}
