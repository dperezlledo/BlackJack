/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.blackjack.controlador;

import com.iescomercio.blackjack.modelo.Baraja;
import com.iescomercio.blackjack.modelo.Crupier;
import com.iescomercio.blackjack.modelo.Jugador;
import com.iescomercio.blackjack.vista.Vista;

/**
 *
 * @author dapelle
 */
public class Controlador {

    private Vista vista;
    // Clases del modelo
    private Baraja baraja;
    private Crupier crupier;
    private Jugador jugador;

    public Controlador(Vista v) {
        vista = v;
        baraja = new Baraja();
        crupier = new Crupier("Evaristo", baraja);
        jugador = new Jugador("David", 2000.0);

    }

//    public void actionPerformed(ActionEvent evento) {
//double cantidad = vista.getCantidad();
//if ( evento.getActionCommand().equals(InterfazVista.AEUROS) ) {
//vista.escribeCambio( cantidad + " pesetas son: “
//+ modelo.pesetasAeuros(cantidad) + " euros" );
//}
//else if ( evento.getActionCommand().equals(InterfazVista.APESETAS)) {
//vista.escribeCambio( cantidad + " euros son: “
//+ modelo.eurosApesetas(cantidad) + " pesetas" );
//}
//else
//vista.escribeCambio( "ERROR" );
//}
    public void gameLoop() {

    }

    public String dameNombre() {
        return jugador.getNombre();
    }

    public boolean apuesta(double apuesta) {
        return jugador.apuesta(apuesta);
    }

    public void iniciarPartida() {
        // Inicializamos mano
        jugador.getMano().inicializarMano();
        crupier.getMano().inicializarMano();
    }

    public void pedirCartaJugador() {
        jugador.getMano().añadirCarta(baraja.dameCarta());        
    }

    public void pedirCartaCrupier() {
        crupier.getMano().añadirCarta(baraja.dameCarta());        
    }

    public String mostrarManoJugador() {
        return jugador.getMano().toString();
    }

    public String mostrarManoCrupier() {
        return crupier.getMano().toString();
    }

  
    public boolean crupierSePlanta() {
        return crupier.plantarse();
    }

    public int puntuacionJugador() {
        return jugador.getMano().damePuntuacion();
    }

    public int puntuacionCrupier() {
        return crupier.getMano().damePuntuacion();
    }

    public void aumentarSaldoJugador() {
        jugador.setSaldo(jugador.getSaldo() + jugador.getApuesta());
    }

    public double mostrarSaldoJugador() {
        return jugador.getSaldo();
    }

    public void disminuyeSaldoJugador() {
        jugador.setSaldo(jugador.getSaldo() - jugador.getApuesta());
    }

  

}
