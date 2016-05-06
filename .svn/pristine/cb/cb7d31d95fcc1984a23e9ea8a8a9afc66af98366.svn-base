/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.blackjack.modelo;

import com.iescomercio.utilidades.Aleatorio;
import java.util.ArrayList;


/**
 *
 * @author dapelle
 */
public class Baraja {
    private ArrayList<Carta> baraja;

    public Baraja() {
        baraja = new ArrayList();
        barajar();
    }
    
    public Carta dameCarta() {
        // Generamos un numero aleatorio entre 1 y length
        Aleatorio a = new Aleatorio(baraja.size()-1, 0);
        int numeroAleatorio = a.nextAleatorio();
        Carta aux = baraja.get(numeroAleatorio);
        baraja.remove(numeroAleatorio);
        return aux;
    }

    private void barajar() {               
        // Ponemos todos las cartas sobre la baraja
        for (int i = 1; i <= 52; i++) {
            if (i<=13) { // Corazones
                baraja.add(new Carta('\u2665', i));
            } else if (i>=14 && i<=26) { // Pica
                baraja.add(new Carta('\u2660', i-13));
            } else if (i>=27 && i<=39) { // Diamantes
                baraja.add(new Carta('\u2666', i-26));
            } else { // Treboles
                baraja.add(new Carta('\u2663', i-39));
            }                    
        }
        
    }
    
}
