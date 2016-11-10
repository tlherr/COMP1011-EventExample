package com.tlherr.Event;

import javax.swing.*;
import javax.swing.event.EventListenerList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The purpose of this class is to abstract button event handling
 * Each time a button in this group is clicked
 * A group listener event will be fired so an outside class only has to add one listener for all button events
 */
public class EventAwareButtonGroup extends ButtonGroup {
    private ActionListener listener = new EventAwareButtonGroupListener();
    private EventListenerList listenerList = new EventListenerList();

    @Override
    public void add(AbstractButton b) {
        super.add(b);
        b.addActionListener(listener);
    }

    public void addActionListener(ActionListener listener) {
        listenerList.add(ActionListener.class, listener);
    }

    public void removeActionListener(ActionListener listener) {
        listenerList.remove(ActionListener.class, listener);
    }

    protected void notifyListeners(ActionEvent event) {
        //Get all listeners
        Object[] listeners = listenerList.getListenerList();

        for(int i = 0; i<listeners.length; i++) {
            //Check if the listener is waiting for this type of event
            if(listeners[i] instanceof ActionListener) {
                ((ActionListener)listeners[i]).actionPerformed(event);

                System.out.println("Listener Notified");
            }
        }
    }


    private class EventAwareButtonGroupListener implements ActionListener {

        //Will Fire each time a button is clicked
        @Override
        public void actionPerformed(ActionEvent e) {
            notifyListeners(e);
            System.out.println("Action Performed");
        }
    }


}
