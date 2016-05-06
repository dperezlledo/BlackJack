/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.blackjack.modelo;

import java.util.Scanner;

/**
 *
 * @author dapelle
 */
public class Jugador extends Persona{    
    private double saldo;
    private double apuesta;    
    private Mano mano;
    private Scanner s;
    
    public Jugador(String nombre, double saldo) {
        s = new Scanner(System.in);
        setNombre(nombre);
        this.saldo = saldo;
        mano = new Mano();
    }

    public void setApuesta(double apuesta) {
        this.apuesta = apuesta;
    }
    
    public boolean apuesta(double cantidad) { 
        if (cantidad > this.getSaldo()) {
            return false;        
        }else  {
            setApuesta(cantidad);
            return true;
        }
            
    }

    public Mano getMano() {
        return mano;
    }   

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getApuesta() {
        return this.apuesta;
    }

    public double getSaldo() {
        return this.saldo;
    }

   
    
}
