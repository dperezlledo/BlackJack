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
public class Carta {
    private char palo;
    private int valor;

    public Carta(char palo, int valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public char getPalo() {
        return palo;
    }

    public void setPalo(char palo) {
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.palo;
        hash = 67 * hash + this.valor;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (this.palo != other.palo) {
            return false;
        }
        if (this.valor != other.valor) {
            return false;
        }
        return true;
    }

    
    
    
    
    
    
}
