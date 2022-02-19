/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.fila;

/**
 *
 * @author juan
 */
public class Fila implements IFila
{
    private Item primero;
    private Item ultimo;
    private int cantidad = 0;

    public Fila() 
    {
        this.primero = null;
        this.ultimo = null;
    }
    
    

    @Override
    public boolean esVacia() 
    {
        if(primero==null && ultimo==null)
            return true;
        else
            return false;
    }

    @Override
    public void enfila(Item unItem) 
    {
        if(esVacia())
        {
            unItem.setSiguiente(this.primero);
            this.primero = this.ultimo = unItem;
        }
        else
        {
            this.ultimo.setSiguiente(unItem);
            this.ultimo = unItem;
        }
        cantidad++;
    }

    @Override
    public void defila() 
    {
        if(!esVacia())
        {
            if(this.primero.getSiguiente()==null)   //Caso que solo haya uno.
                this.primero = this.ultimo =null;
            else
            {
                Item auxiliar = this.primero;       //los demas
                auxiliar = auxiliar.getSiguiente();
                this.primero = auxiliar;
            }
            cantidad--;
        }
    }

    @Override
    public Item frente() 
    {
        return this.primero;
    }


    @Override
    public Item ultimo() 
    {
        return this.ultimo;
    }

    @Override
    public int cantidad() 
    {
        return cantidad;
    }

    @Override
    public void verFila() 
    {
        Item auxiliar = this.primero;
        while(auxiliar != null)
        {
            System.out.print("["+auxiliar.getDato()+"] " + "-->");
            auxiliar = auxiliar.getSiguiente();
        }
        System.out.println("");
    }
    
    
}
