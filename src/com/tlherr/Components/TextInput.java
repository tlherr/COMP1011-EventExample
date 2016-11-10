package com.tlherr.Components;

import javax.swing.*;
import java.awt.*;

public class TextInput extends JPanel {


    private JTextField userInput;

    public JTextField getInputField() {
        return userInput;
    }

    public TextInput() {
        userInput = new JTextField("Sample Text");
        userInput.setColumns(ALLBITS);
        userInput.setHorizontalAlignment(JTextField.CENTER);
        add(userInput);
    }


}
