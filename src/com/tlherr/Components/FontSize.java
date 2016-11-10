package com.tlherr.Components;


import javax.swing.*;
import javax.swing.event.EventListenerList;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public class FontSize extends JPanel {
    private JComboBox<String> textSizeSelection;
    private EventListenerList listenerList = new EventListenerList();

    public FontSize() {
        String[] sizeOptions = { "10", "11" ,"12" ,"13" ,"14", "15"};
        textSizeSelection = new JComboBox<>(sizeOptions);
        add(textSizeSelection, BorderLayout.AFTER_LINE_ENDS);
    }

    public void addActionListener(ItemListener listener) {
        listenerList.add(ItemListener.class, listener);
        textSizeSelection.addItemListener(listener);
    }

    public void removeActionListener(ItemListener listener) {
        listenerList.remove(ItemListener.class, listener);
        textSizeSelection.addItemListener(listener);
    }




}
