/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.MechanicSystem.controller;

import ec.edu.espe.MechanicSystem.view.frmRegisterNewCar;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Inforlan
 */
public class Lpanel_txt {
    public void limpiar_texto(frmRegisterNewCar panel){
        for(int i=0;panel.getComponents().length>i;i++){
            if(panel.getComponents()[i] instanceof JTextField){
                ((JTextField)panel.getComponents()[i]).setText("");
            }
            else if(panel.getComponents()[i] instanceof JPasswordField){
                ((JPasswordField)panel.getComponents()[i]).setText("");
            }
        }
    }
            
    
}
