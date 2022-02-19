/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herrera.unt.EDA_TP5;

import java.util.Objects;

/**
 *
 * @author juan
 */
public class RedSocial 
{

    Usuario inicio;
    int cantidadUsuarios = 0;
    
    public RedSocial() 
    {
        this.inicio = null;
        
    }
    
    
    
    public void registrar(Usuario user)
    {
        user.setSiguiente(this.inicio);
        this.inicio = user;
        cantidadUsuarios++;
    }
    
    public boolean esVacia()
    {
        if(this.inicio == null)
            return true;
        else
            return false;
    }
    
    public void verUsuarios()
    {
        Usuario auxiliar = this.inicio;
        System.out.println("Usuarios en nuestra red social: ");
        while (auxiliar!= null)
        {
            System.out.print("->" + "[" +auxiliar.getUser() + "]");
            auxiliar = auxiliar.getSiguiente();
        }       
        System.out.println("");
    }
    
    public boolean estaUsuario(Usuario user)
    {
       return esta(user, this.inicio);
        
    }
    
    private boolean esta(Usuario user, Usuario actual)
    {
        if(actual == null)
            return false;
        
        if(actual.equals(user))
            return true;
        
        return esta(user, actual.getSiguiente());
    }
    
    public void echar(RedSocial unaRedSocial, Usuario user)
    {
        Usuario auxiliar = this.inicio;
        if (unaRedSocial.esVacia())
        {
            System.out.println("Red social vacia");
        }   
        else
        {
            while(auxiliar != null)
            {
                if(auxiliar.getSiguiente().getUser() == user.getUser())
                {
                    auxiliar.setSiguiente(auxiliar.getSiguiente().getSiguiente());
                    cantidadUsuarios--;
                    break;          //IMPORTANTE
                }
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }
 
    public Usuario ultimoUsuario()
    {
        Usuario auxiliar = this.inicio;
        while(auxiliar.getSiguiente()!= null)
        {
            auxiliar = auxiliar.getSiguiente();
        }
        return auxiliar;
    }
    
    public int cantidadUsuarios()
    {
        return cantidadUsuarios;
    }
    
}
