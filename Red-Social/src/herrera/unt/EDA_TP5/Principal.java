/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herrera.unt.EDA_TP5;

/**
 *
 * @author juan
 */
public class Principal 
{
    public static void main(String[] args)
    {
        System.out.println("-------------- Red social 1 -------------------\n");
        
        Usuario user0 = new Usuario(0);
        Usuario user1 = new Usuario(1);
        Usuario user2 = new Usuario(2);
        Usuario user3 = new Usuario(3);
        Usuario user4 = new Usuario(4);
        Usuario user5 = new Usuario(5);
        Usuario user6 = new Usuario(6);
        Usuario user7 = new Usuario(7);
        Usuario user8 = new Usuario(8);
        Usuario user9 = new Usuario(9);
        Usuario user10 = new Usuario(10);
       
        RedSocial RedSocial1 = new RedSocial();
        RedSocial1.registrar(user0);
        RedSocial1.registrar(user1);
        RedSocial1.registrar(user2);
        RedSocial1.registrar(user3);
        RedSocial1.registrar(user4);
        RedSocial1.registrar(user5);
        
        if(RedSocial1.esVacia())
            System.out.println("Red vacia");
        else
            System.out.println("Red con usuarios registrados");     //No esta vacia.
        
        if(RedSocial1.estaUsuario(user0))
            System.out.println("El usuario " +user0.getUser()+ " se encuentra en la red");        //Se encuentra en la red
        else
            System.out.println("El usuario " +user0.getUser()+ " no se encuentra en la red");
        
        if(RedSocial1.estaUsuario(user6))
            System.out.println("El usuario " +user6.getUser()+ " se encuentra en la red");
        else
            System.out.println("El usuario " +user6.getUser()+ " no se encuentra en la red");     //No se encuentra en la red
        
        RedSocial1.verUsuarios();       //Vemos antes de borrar
        
        RedSocial1.echar(RedSocial1,user0);
        System.out.println("Se borro al usuario " + user0.getUser());
        RedSocial1.verUsuarios();       //Vemos despues de borrar.
        
        System.out.println("El ultimo usuario registrado: " + RedSocial1.ultimoUsuario().getUser());
        
        System.out.println("Cantidad de usuarios en red: " + RedSocial1.cantidadUsuarios());
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("-------------- Red social 2 -------------------\n");
        
        RedSocial RedSocial2 = new RedSocial();
        RedSocial2.registrar(user6);
        RedSocial2.registrar(user7);
        RedSocial2.registrar(user8);
        RedSocial2.registrar(user9);
        RedSocial2.registrar(user10);
        
        if(RedSocial2.esVacia())
            System.out.println("Red vacia");
        else
            System.out.println("Red con usuarios registrados");     //Tiene usuarios
        
        if(RedSocial2.estaUsuario(user0))
            System.out.println("El usuario "+ user0.getUser()+ " se encuentra en la red");
        else
            System.out.println("El usuario " +user0.getUser()+ " no se encuentra en la red");       //No se encuentra
        
        if(RedSocial2.estaUsuario(user8))
            System.out.println("El usuario " +user8.getUser()+ " se encuentra en la red");     //Si se encuentra
        else
            System.out.println("El usuario no " +user8.getUser()+ " se encuentra en la red");
        
        RedSocial2.verUsuarios();       //Vemos antes de borrar
//        
        RedSocial2.echar(RedSocial2 , user7);     //VER ERROR ACA.
        System.out.println("Se borro al usuario " + user7.getUser());
        RedSocial2.verUsuarios();       //Vemos despues de borrar
        
        System.out.println("El ultimo usuario registrado: " + RedSocial2.ultimoUsuario().getUser());
        
        System.out.println("Cantidad de usuarios en red: " + RedSocial2.cantidadUsuarios());
        
        System.out.println("");
        System.out.println("");
        
        
        System.out.println("-------------- Red social 3 -------------------\n");
        
        RedSocial RedSocialVacia = new RedSocial();
        
        if(RedSocialVacia.esVacia())
            System.out.println("Red vacia");
        else
            System.out.println("Red con usuarios registrados");

        System.out.println("----------------- UNION REDES --------------------");
        union(RedSocial1,RedSocial2).verUsuarios();
    }
    
    public static RedSocial union(RedSocial unaRed, RedSocial otraRed)      // ME ACUERDO QUE DEBIAMOS DESTRUIR LAS ANTERIORES PERO COMO.
    {
        Usuario auxiliar = unaRed.inicio;
        Usuario auxiliar2 = otraRed.inicio;
        while(auxiliar.getSiguiente() != null)
        {
            auxiliar = auxiliar.getSiguiente();
        }
        auxiliar.setSiguiente(auxiliar2);
        
        return unaRed;
    }
    
    
    

}
