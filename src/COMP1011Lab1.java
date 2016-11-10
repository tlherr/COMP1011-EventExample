/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1011.lab1;

import javax.swing.JFrame;

/**
 *
 * @author tom
 */
public class COMP1011Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Checkboxes checkboxesGui = new Checkboxes();
        checkboxesGui.setSize(400, 200);
        checkboxesGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checkboxesGui.setVisible(true);
        
    }
    
}
