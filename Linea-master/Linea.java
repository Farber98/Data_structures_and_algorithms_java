/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.linea_parcial;

/**
 *
 * @author juan
 */
public class Linea 
{

    int cantidad =0;
    Char inicio;
    public Linea() 
    {
        this.inicio = null;     //Linea vacia.
    }

  
    public void agregarAlInicio(Char unChar) 
    {
        unChar.setSiguiente(this.inicio);
        this.inicio = unChar;
        cantidad++;
    }

    
    public void agregarAlFinal(Char unChar) 
    {
        Char auxiliar = this.inicio;
        while(auxiliar.getSiguiente() != null)
        {
            auxiliar = auxiliar.getSiguiente();
        }
        auxiliar.setSiguiente(unChar);
        unChar.setSiguiente(null);
    }

//    @Override
    public void borrarAlInicio() 
    {
        if(esVacia())
            System.out.println("La lista no tiene elementos");
        Char auxiliar = this.inicio;
        this.inicio = auxiliar.getSiguiente();
        cantidad--;
    }
//
  
    public void borrarAlFinal() 
    {
        if(esVacia())
            System.out.println("La lista no tiene elementos");
        Char auxiliar = this.inicio;
        while(auxiliar.getSiguiente().getSiguiente() != null)
        {
            auxiliar = auxiliar.getSiguiente();
        }
        auxiliar.setSiguiente(null); 
        cantidad--;
    }
//
//    @Override
    public boolean esVacia() 
    {
        if(this.inicio == null)
            return true;
        else
            return false;
    }
//
//    @Override
    public boolean pertenece(Char unChar) 
    {
        if(esVacia())
            return false;
        Char auxiliar = this.inicio;
        while(auxiliar.getSiguiente() != null)
        {
            if(auxiliar.getDato() == unChar.getDato())
                return true;
            auxiliar = auxiliar.getSiguiente();
        }
        return false;
    }
//
//    @Override
    public int cantidad() 
    {
        return cantidad;
    }
//
//    @Override
    public Char verUltimo() 
    {
        Char auxiliar = this.inicio;
        while(auxiliar.getSiguiente() != null)
        {
            auxiliar = auxiliar.getSiguiente();
        }
        return auxiliar;
    }
//
//    @Override
    public Char verPrimero() 
    {
        Char auxiliar = this.inicio;
        return auxiliar;
    }
//
//    @Override
    public void verLinea() 
    {
        Char auxiliar = this.inicio;
        while(auxiliar != null)
        {
            System.out.print("["+auxiliar.getDato()+"] " + "-->");
            auxiliar = auxiliar.getSiguiente();
        }
        System.out.println("");
    }
    
}
