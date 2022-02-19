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
public interface ILinea 
{
    public void agregarAlInicio(Char unChar);   //Este es el que hay que implementar
    
    public void agregarAlFinal(Char unChar);
    
    public void borrarAlInicio();
    
    public void borrar(Char unChar);
    
    public void borrarDeterminado(Char unChar);
    
    public void borrarAlFinal();
    
    public boolean esVacia();
    
    public boolean pertenece(Char unChar);
    
    public int cantidad();
    
    public Char verUltimo();
    
    public Char verPrimero();
    
    public void verLinea();
}
