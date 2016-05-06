/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.blackjack.vista;

import java.util.Scanner;

/**
 *
 * @author dapelle
 */
public class VistaConsola extends Vista {
    private Scanner s;
    private Object crupier;

    public VistaConsola() {
        s = new Scanner(System.in);
    }

    @Override
    public void pedirApuesta() {
        double cant;

        do {
            System.out.println(getControlador().dameNombre() + " introduce apuesta: ");
            cant = s.nextDouble();
            if (getControlador().apuesta(cant)) {
                break;
            } else {
                System.out.println("No puede apostar mas que su saldo");
            }
        } while (true);
    }

    @Override
    public void arranca() {
        do {
            getControlador().iniciarPartida();
            // Apuesta del jugador
            pedirApuesta();            
            // Cartas iniciales
            getControlador().pedirCartaJugador();
            getControlador().pedirCartaCrupier(); 
            // Mostrar mano
            System.out.println(getControlador().mostrarManoJugador()); 
            // Cartas del crupier
            getControlador().pedirCartaCrupier(); 
            
            System.out.println(getControlador().mostrarManoCrupier()); // Mostar mano crupier
            // Entregar cartas hasta plantarse
            while (jugadorSePlanta()) {
                getControlador().pedirCartaJugador();
                System.out.println(getControlador().mostrarManoJugador()); // Mostrar mano
            }
            // Juega el crupier hasta > 16
            while (!getControlador().crupierSePlanta()) {
                getControlador().pedirCartaCrupier();
                System.out.println(getControlador().mostrarManoCrupier()); // Mostrar mano crupier
            }
            // Comprobación ganador
            if (getControlador().puntuacionJugador()  > getControlador().puntuacionCrupier()) {
                // Gana jugador
                System.out.println("Gana jugador");
                getControlador().aumentarSaldoJugador();                
                System.out.println("Saldo jugador: " + getControlador().mostrarSaldoJugador());
            } else if (getControlador().puntuacionJugador() < getControlador().puntuacionCrupier()) {
                // Gana crupier
                System.out.println("Gana la banca");
                getControlador().disminuyeSaldoJugador();                
                System.out.println("Saldo jugador: " + getControlador().mostrarSaldoJugador());
            } else {
                // Empate      
                System.out.println("Empate");
                System.out.println("Saldo jugador: " + getControlador().mostrarSaldoJugador());
            }
        } while (otraPartida());
    }

    @Override
    public boolean jugadorSePlanta() {         
        char aux;
        do {
            System.out.println("¿Desea plantarse " + getControlador().dameNombre() + " (S/N)?");
            aux = s.next().charAt(0);
            if (aux=='S')
                return true;
            else if (aux=='N')
                return false;
            
        } while (true);    
    }

    @Override
    public boolean otraPartida() {         
        char aux;
        do {
            System.out.println("¿Otra partida " + getControlador().dameNombre() + "(S/N)?");
            aux = s.next().charAt(0);
            if (aux=='S') {                
                return true;
            } else if (aux=='N')
                return false;
            
        } while (true);
    
    }

   
}
