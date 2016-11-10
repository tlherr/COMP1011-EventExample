/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1011.lab1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author tom
 */
public class Checkboxes extends JFrame {
    
    private JTextField input;
    private ButtonGroup cbg;

    
    public Checkboxes() {
        super("Java Checkboxes");
        setLayout(new FlowLayout());
        
        input = new JTextField("Sample Text");
        input.setColumns(ALLBITS);
        
        cbg = new ButtonGroup();
        
        JCheckBox chkBold = new JCheckBox("Bold");
        JCheckBox chkItalics = new JCheckBox("Italics");
        JCheckBox chkAriel = new JCheckBox("Ariel");
        JCheckBox chkSerif = new JCheckBox("Serif");
        
        cbg.add(chkBold);
        cbg.add(chkItalics);
        cbg.add(chkAriel);
        cbg.add(chkSerif);
        
        add(input);
        add(chkBold);
        add(chkItalics);
        add(chkAriel);
        add(chkSerif);
       
        
    }
    
    
    
}
