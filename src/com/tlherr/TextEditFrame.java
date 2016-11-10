/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tlherr;

import com.tlherr.Components.FontSize;
import com.tlherr.Components.FontStyle;
import com.tlherr.Components.TextInput;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;


public class TextEditFrame extends JFrame {

    public TextEditFrame() {
        super("Edit Text");
        setLayout(new GridLayout(3,1));

        TextInput userInput = new TextInput();
        add(userInput);

        FontStyle styleOptions = new FontStyle();

        styleOptions.getCbg().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Action Command is: " + e.getActionCommand());

                switch(e.getActionCommand()) {
                    case "Bold":
                        userInput.getInputField().setFont(new Font(userInput.getFont().getName(), Font.BOLD, userInput.getFont().getSize()));
                        break;

                    case "Ariel":
                        userInput.getInputField().setFont(new Font("Ariel", Font.PLAIN, userInput.getFont().getSize()));
                        break;

                    case "Italics":
                        userInput.getInputField().setFont(new Font(userInput.getFont().getName(), Font.ITALIC, userInput.getFont().getSize()));
                        break;

                    case "Serif":
                        userInput.getInputField().setFont(new Font(Font.SERIF, Font.PLAIN, userInput.getFont().getSize()));
                        break;
                }
            }
        });

        add(styleOptions);

        FontSize sizeOptions = new FontSize();



        sizeOptions.addActionListener(new ComboBoxItemSelectedListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    Object item = e.getItem();
                    userInput.getInputField().setFont(new Font(userInput.getFont().getName(), userInput.getFont().getStyle(), Integer.parseInt(item.toString())));
                }
            }
        });



        add(sizeOptions);
    }


    private class ComboBoxItemSelectedListener implements ItemListener {

        /**
         * Invoked when an item has been selected or deselected by the user.
         * The code written for this method performs the operations
         * that need to occur when an item is selected (or deselected).
         *
         * @param e
         */
        @Override
        public void itemStateChanged(ItemEvent e) {

        }
    }
    
    
    
}
