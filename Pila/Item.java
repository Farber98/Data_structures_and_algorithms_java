/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.TP5_EDA;

/**
 *
 * @author juan
 */
public class Item 
{
    private int dato;
    private Item siguiente;

    public Item(int dato) 
    {
        this.dato = dato;
    }

    
    
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Item getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Item siguiente) {
        this.siguiente = siguiente;
    }
    
}
