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
public interface IFila 
{
    public boolean esVacia();
    
    public void enfila(Item unItem);
    
    public void defila();
    
    public Item frente();
    
    
    public Item ultimo();
    
    public int cantidad();
    
    public void verFila();
}
