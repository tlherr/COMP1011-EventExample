package com.tlherr.Components;


import javax.swing.*;
import java.awt.*;

public class FontSize extends JPanel {
    private JComboBox<String> textSizeSelection;

    public FontSize() {
        String[] sizeOptions = { "10", "11" ,"12" ,"13" ,"14", "15"};
        textSizeSelection = new JComboBox<>(sizeOptions);

        add(textSizeSelection, BorderLayout.AFTER_LINE_ENDS);
    }
}
