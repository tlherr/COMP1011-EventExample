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

                Font font = new Font("Times New Roman", Font.PLAIN, userInput.getFont().getSize());
                switch(e.getActionCommand()) {
                    case "Bold":
                        font = new Font(userInput.getFont().getName(), Font.BOLD, userInput.getFont().getSize());
                        break;

                    case "Ariel":
                        font = new Font("Ariel", Font.PLAIN, userInput.getFont().getSize());
                        break;

                    case "Italics":
                        font = new Font(userInput.getFont().getName(), Font.ITALIC, userInput.getFont().getSize());
                        break;

                    case "Serif":
                        font = new Font(Font.SERIF, Font.PLAIN, userInput.getFont().getSize());
                        break;
                }

                userInput.setFont(font);
                revalidate();
            }
        });

        add(styleOptions);

        FontSize sizeOptions = new FontSize();
        add(sizeOptions);
    }
    
    
    
}
