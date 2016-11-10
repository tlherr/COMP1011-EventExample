package com.tlherr.Components;

import javax.swing.*;

public class TextInput extends JPanel {


    private JTextField userInput;

    public TextInput() {
        userInput = new JTextField("Sample Text");
        userInput.setColumns(ALLBITS);

        add(userInput);
    }


}
