/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.MechanicSystem.model;

import ec.edu.espe.MechanicSystem.view.frmLogin;
import ec.edu.espe.MechanicSystem.view.frmMenuPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author Inforlan
 */
public class Security {
        String ans;
    frmLogin login = new frmLogin();
    
    public void validLogin(String users[], String user, String password,int tries){
        boolean found = false;
        
        for(int i=0;i<users.length;i++){
            if ((users[i].equalsIgnoreCase(user)&& users[i+1].equals(password))){
                ans= "Welcome to the System: "+ user;
                found = true;
                JOptionPane.showMessageDialog(null,ans,"LOGIN SUCCESFULL",JOptionPane.INFORMATION_MESSAGE);
                tries=0;
                login.setTries(tries);
                frmMenuPrincipal frmmenuprincipal = new frmMenuPrincipal();
                frmmenuprincipal.setVisible(true);
                break;
                
                
            }
        }//finish FOR
        if (found == false){
            ans = "the password or user is not correct "+ tries+" fail attempts";
            JOptionPane.showMessageDialog(null,ans,"IT WAS NOT POSIBLE LOGIN",JOptionPane.ERROR_MESSAGE);
        }
        if (tries >2){
            JOptionPane.showMessageDialog(null,ans,"3 fail attempts,it will close ",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    
    }
}
