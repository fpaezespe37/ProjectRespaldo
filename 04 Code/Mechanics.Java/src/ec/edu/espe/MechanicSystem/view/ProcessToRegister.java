/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.MechanicSystem.view;


import ec.edu.espe.MechanicSystem.model.NewUser;
import java.util.ArrayList;

/**
 *
 * @author Inforlan
 */
public class ProcessToRegister {
    private ArrayList<Object> a =new ArrayList<Object>();
    
    public ProcessToRegister(){}
    
    public ProcesstoRegistertoRegister(ArrayList<Object> a){
    this.a =a;
    }
    public void agregarRegistrotoRegister(NewUser newuser){
        this.a.add(newuser);
    }
    public void modificarRegistrotoRegister(int i,NewUser newuser){
        this.a.set(i,newuser);
    }
    public void eliminarRegistrotoRegister(int i){
        this.a.remove(i);
    }
    public NewUser obtenerRegistrotoRegister(int i){
        return(newuser)a.get(i);
    }
    public int cantidadRegistrotoRegister(){
        return this.a.size();
    }
    /*public int buscaPlaca(int placa){
        for(int i = 0; i < cantidadRegistrotoRegister();i++){
            if(placa==obtenerRegistrotoRegister(i).getPlaca())return i;
        } return -1;
    }
    
}
