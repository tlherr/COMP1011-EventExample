package com.tlherr.Components;


import com.tlherr.Event.EventAwareButtonGroup;

import javax.swing.*;

public class FontStyle extends JPanel {
    private EventAwareButtonGroup cbg;

    public EventAwareButtonGroup getCbg() {
        return cbg;
    }

    public FontStyle() {
        cbg = new EventAwareButtonGroup();

        JCheckBox chkBold = new JCheckBox("Bold");
        JCheckBox chkItalics = new JCheckBox("Italics");
        JCheckBox chkAriel = new JCheckBox("Ariel");
        JRadioButton chkSerif = new JRadioButton("Serif");

        cbg.add(chkBold);
        cbg.add(chkItalics);
        cbg.add(chkAriel);
        cbg.add(chkSerif);

        add(chkBold);
        add(chkItalics);
        add(chkAriel);
        add(chkSerif);
    }


}
