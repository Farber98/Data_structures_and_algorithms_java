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
public class Principal 
{
    public static void main(String[] args) {
    Fila fila1 = new Fila();
    
        Item item1 = new Item(1);
        Item item2 = new Item(2);
        Item item3 = new Item(3);
        Item item4 = new Item(4);
        Item item5 = new Item(5);
        Item item6 = new Item(6);
        Item item7 = new Item(5);
        Item item8 = new Item(5);
        Item item9 = new Item(5);
        Item item10 = new Item(5);
    
        System.out.println(":::::::::: FILA 1 ::::::::::");
        if(fila1.esVacia())
            System.out.println("fila vacia");
        else
            System.out.println("fila no esta vacia");
         System.out.println("Cantidad de items en nuestra fila: " + fila1.cantidad());
        System.out.println("Agregarmos objetos a nuestra fila: ");
        fila1.enfila(item1);
        fila1.enfila(item2);
        System.out.println("Cantidad de items en nuestra fila: " + fila1.cantidad());
        fila1.verFila();
        if(fila1.esVacia())
            System.out.println("fila vacia");
        else
            System.out.println("fila no esta vacia");
        fila1.defila();
        fila1.verFila();
        if(fila1.esVacia())
            System.out.println("fila vacia");
        else
            System.out.println("fila no esta vacia");
        fila1.defila();
        System.out.println("Cantidad de items en nuestra fila: " + fila1.cantidad());
        if(fila1.esVacia())
            System.out.println("fila vacia");
        else
            System.out.println("fila no esta vacia");
        fila1.verFila();
        fila1.enfila(item3);
        fila1.enfila(item4);
        fila1.enfila(item5);
        fila1.enfila(item6);
        System.out.println("Cantidad de items en nuestra fila: " + fila1.cantidad());
        fila1.verFila();
        System.out.println("El primer item es: " +fila1.frente().getDato());
        System.out.println("El ultimo item es: " +fila1.ultimo().getDato());
}
}