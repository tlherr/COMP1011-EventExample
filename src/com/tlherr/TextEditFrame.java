/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tlherr;

import com.tlherr.Components.FontSize;
import com.tlherr.Components.TextInput;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.*;
import javax.swing.*;


public class TextEditFrame extends JFrame {

    public TextEditFrame() {
        super("Edit Text");
        setLayout(new GridLayout(3,1));

        final TextInput userInput = new TextInput();
        add(userInput);

        JPanel fontStyle = new JPanel();
        final java.util.List<JCheckBox> checkBoxList = new ArrayList<>();

        final JCheckBox chkBold = new JCheckBox("Bold");
        final JCheckBox chkItalics = new JCheckBox("Italics");
        JCheckBox chkAriel = new JCheckBox("Ariel");
        final JRadioButton chkSerif = new JRadioButton("Serif");

        checkBoxList.add(chkBold);
        checkBoxList.add(chkItalics);
        checkBoxList.add(chkAriel);

        ActionListener checkboxListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(chkBold.isSelected() && chkItalics.isSelected()) {
                    userInput.getInputField().setFont(new Font(
                            userInput.getInputField().getFont().getFamily(), Font.BOLD+Font.ITALIC, userInput.getInputField().getFont().getSize()));
                } else if(chkBold.isSelected()) {
                    userInput.getInputField().setFont(new Font(
                            userInput.getInputField().getFont().getFamily(), Font.BOLD, userInput.getInputField().getFont().getSize()));

                } else if(chkItalics.isSelected()) {
                    userInput.getInputField().setFont(new Font(
                            userInput.getInputField().getFont().getFamily(), Font.ITALIC, userInput.getInputField().getFont().getSize()));

                } else {
                    userInput.getInputField().setFont(new Font(
                            userInput.getInputField().getFont().getFamily(), Font.PLAIN, userInput.getInputField().getFont().getSize()));
                }
            }
        };

        chkSerif.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(chkSerif.isSelected()) {
                    userInput.getInputField().setFont(new Font(
                            "Serif", userInput.getInputField().getFont().getStyle(), userInput.getInputField().getFont().getSize()));
                } else {
                    userInput.getInputField().setFont(new Font(
                            "SansSerif", userInput.getInputField().getFont().getStyle(), userInput.getInputField().getFont().getSize()));
                }
            }
        });

        chkBold.addActionListener(checkboxListener);
        chkItalics.addActionListener(checkboxListener);
        chkAriel.addActionListener(checkboxListener);

        fontStyle.add(chkBold);
        fontStyle.add(chkItalics);
        fontStyle.add(chkAriel);
        fontStyle.add(chkSerif);

        add(fontStyle);

        FontSize sizeOptions = new FontSize();

        sizeOptions.addActionListener(new ComboBoxItemSelectedListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    Object item = e.getItem();
                    userInput.getInputField().setFont(new Font(
                            userInput.getInputField().getFont().getFamily(), userInput.getInputField().getFont().getStyle(), Integer.parseInt(item.toString())));
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
