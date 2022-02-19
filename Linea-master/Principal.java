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
public class Principal 
{
    public static void main(String[] args) 
    {
        
    
        Linea linea1 = new Linea();
    
        Char char1 = new Char(1);
        Char char2 = new Char(2);
        Char char3 = new Char(3);
        Char char4 = new Char(4);
        Char char5 = new Char(5);
        Char char6 = new Char(6);
        Char char7 = new Char(5);
        Char char8 = new Char(5);
        Char char9 = new Char(5);
        Char char10 = new Char(5);
    
        System.out.println(":::::::::: LINEA 1 ::::::::::");
        System.out.println("Agregarmos objetos a nuestra linea: ");
        linea1.agregarAlInicio(char1);
        linea1.agregarAlInicio(char2);
        linea1.verLinea();
        System.out.println("Agregarmos objetos a nuestra linea en el otro sentido: ");
        linea1.agregarAlFinal(char5);
        linea1.agregarAlFinal(char6);
        linea1.agregarAlFinal(char7);
        linea1.agregarAlFinal(char8);
        linea1.agregarAlFinal(char9);
        linea1.agregarAlFinal(char3);
        linea1.verLinea();
        System.out.println("Borramos al inicio:");
        linea1.borrarAlInicio();
        linea1.verLinea();
        linea1.verLinea();
        System.out.println("Cantidad:" + linea1.cantidad());
        System.out.println("El primer elemento: " + linea1.verPrimero().getDato());
        System.out.println("El ultimo elemento: " + linea1.verUltimo().getDato());
        System.out.println("El elemento: " + char5.getDato() + " pertenece a la lista?");
        if(linea1.pertenece(char5))
            System.out.println("Si pertenece");
        else
            System.out.println("No pertenece");
        
//        System.out.println("Veamos cuantas veces se repite el char" + char5.getDato() + " en la linea");
//        System.out.println("La cantidad de coincidencias son: " + cantRep(linea1, char5));
        
    }
    
    public static int cantRep(Linea unaLinea, Char unChar)
    {
        int coincidencias =0;
        while(!unaLinea.esVacia())
        {
            if(unaLinea.verPrimero().getDato() == unChar.getDato())
                coincidencias++;
            
            System.out.println("Paso por el while y borro el" + unaLinea.verPrimero().getDato());
            unaLinea.borrarAlInicio();
        }
        return coincidencias;
    }
    
//    public static boolean igualdat(Linea unaLinea, Linea otraLinea)
//    {
//        if(unaLinea.esVacia() && otraLinea.esVacia())
//            return true;
//        if(unaLinea.esVacia() || otraLinea.esVacia())
//            return false;
//        if(unaLinea.pertenece(otraLinea.verPrimero()))
//        {
//            otraLinea.borrarAlInicio();
//            igualdat(unaLinea,otraLinea);
//        }
//            
//            
//    }
}
