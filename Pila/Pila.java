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
public class Pila 
{

    Item inicio;
    int cantidad = 0;
    
    public Pila() 
    {
        this.inicio = null;
    }
    
    public void push( Item unItem)
    {
        unItem.setSiguiente(this.inicio);
        this.inicio = unItem;
        cantidad++;
    }
    
    public void pop()
    {
            inicio = inicio.getSiguiente();
            cantidad--;
    }
    
    public boolean esVacia()
    {
        if(inicio == null)
            return true;
        return false;
    }
    
    public Item top()
    {
        return inicio;
    }
    
    public void verPila()
    {
        Item auxiliar = this.inicio;
        System.out.println("Items en nuestra pila: ");
        while (auxiliar!= null)
        {
            System.out.print("->" + "[" +auxiliar.getDato()+ "]");
            auxiliar = auxiliar.getSiguiente();
        }       
        System.out.println("");

    }
    
    public Item bottom()
    {
        Item auxiliar = this.inicio;
        while(auxiliar.getSiguiente() != null)
            auxiliar = auxiliar.getSiguiente();
        return auxiliar;
    }
    
    public void reemplazar(int dato, int otroDato)
    {
        Item auxiliar = this.inicio;
        while(auxiliar.getSiguiente() != null)
        {
            if(auxiliar.getDato() == dato)
                auxiliar.setDato(otroDato);
            auxiliar = auxiliar.getSiguiente();
        }
        
    }
    
}
