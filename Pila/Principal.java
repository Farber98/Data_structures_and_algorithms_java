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
public class Principal 
{
    
    public static void main(String[] args) 
    {
       
        Pila pila1 = new Pila();
    
        Item i0 = new Item(0);
        Item i1 = new Item(1);
        Item i2 = new Item(2);
        Item i3 = new Item(3);
        Item i4 = new Item(4);
        Item i5 = new Item(5);
        Item i6 = new Item(1);
        Item i7 = new Item(1);
        Item i8 = new Item(1);
        Item i9 = new Item(1);
    
        if(pila1.esVacia())
            System.out.println("La pila esta vacia");
        else
            System.out.println("La pila posee elementos");
            
        
        pila1.push(i0);
        pila1.push(i1);
        pila1.push(i2);
        pila1.push(i3);
        pila1.push(i4);
        pila1.push(i5);
        
        
        if(pila1.esVacia())
            System.out.println("La pila esta vacia");
        else
            System.out.println("La pila posee elementos");
            
        
        pila1.verPila();        //Pila completa
        
        pila1.pop();
        System.out.println("Se borro un elemento");
        pila1.pop();
        System.out.println("Se borro un elemento");
        
        pila1.verPila();        //Sacamos dos elementos.
        
        System.out.println("El primer item de la pila es: " + pila1.top().getDato());      //Ver que hacer cuand esta vacia.
        
        System.out.println("El ultimo item de la pila es: " + pila1.bottom().getDato());
        
        pila1.verPila();
        pila1.push(i6);
        pila1.push(i7);
        pila1.verPila();
        
        System.out.println("Reemplazamos todos los 1 por 5 con el metodo reemplazar: ");
        pila1.reemplazar(1, 5);     // El primero es el dato que busca y el segundo el que reemplaza.    
    
        pila1.verPila();
        
        System.out.println("-------------- COINCIDENCIAS ---------------------- \n\n");
        Pila pila3 = new Pila();
        Pila pila2 = new Pila();
        
        pila3.push(i1);
        pila3.push(i2);
        pila3.push(i3);
        pila3.push(i4);
        
        System.out.println("Vemos la pila 3: ");
        pila3.verPila();
        
        pila2.push(i1);
        pila2.push(i2);
        pila2.push(i3);
        pila2.push(i4);
        pila2.push(i5);
        pila2.push(i6);
        
        System.out.println("Vemos la pila 2: ");
        pila2.verPila();
        
        if(estaContenida(pila2, pila3))
            System.out.println("Pila 3 SI esta contenida en pila 2.");      //Debe dar que si
        else
            System.out.println("Pila 3 NO esta contenida en pila 2.");
    }
    
    
    //HICE COMO SI FUERAN IGUALES NO COMO SI ESTUVIERAN CONTENIDAS.
    public static boolean estaContenida(Pila unaPila, Pila otraPila)        //Otra pila contenida en pila?.
    {
        int coincidencias = 0;
        while(!unaPila.esVacia())
        {
            while(!otraPila.esVacia())
            {   
                if(unaPila.inicio.getDato() == otraPila.inicio.getDato() )
                    coincidencias++;
                otraPila.inicio = otraPila.inicio.getSiguiente();
            }
            unaPila.inicio = unaPila.inicio.getSiguiente();
        }
        if(coincidencias == otraPila.cantidad)
            return true;
        return false;
    }
}
