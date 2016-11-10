/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tlherr;

import javax.swing.*;

/**
 *
 * @author tom
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TextEditFrame textControlGroupGui = new TextEditFrame();
        textControlGroupGui.setSize(400, 200);
        textControlGroupGui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        textControlGroupGui.setVisible(true);
        
    }
    
}
