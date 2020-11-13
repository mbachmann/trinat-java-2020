package ch.trinat.edu.etutorial.p03.oo6.SelbstangigeArbeit;

/*
 * In dieser Klasse werden die Buttons und die Dropdown-Liste erzeugt.
 */

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kontrolle extends JPanel {

    private Eingabe eingabe;
    private final Adressbuch adressbuch;
    private final JTextArea text;

    public Kontrolle (final Adressbuch a, final JTextArea t, final Class[] classes, final JFrame fr) {

        adressbuch = a;
        text = t;
        eingabe = new Eingabe();
        
        Choice types = new Choice();
        for (int i=0; i<classes.length; i++) {
            types.add(classes[i].getSimpleName());
        }
        add(types);
        types.addItemListener(new ItemListener() {
            public void itemStateChanged (ItemEvent e) {
                int ind = ((Choice)e.getSource()).getSelectedIndex();
                eingabe.reset();
                eingabe.setType(classes[ind]);
                eingabe.zeigeAn();
                ((JSplitPane)(fr.getContentPane().getComponent(0))).setLeftComponent(eingabe);
            }
        });

       
        JButton doIt = new JButton("Person eintragen");
        add(doIt);
        doIt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {  
                try {  
                    eingabe.makePerson(adressbuch);
                    text.append("Person eingetragen.\n");
                    eingabe.resetFields();
                } catch (Exception ex) {
                    text.append("Fehlerhafte Eingabe\n");
                }
            }
        });

        JButton print = new JButton("Adressbuch drucken");
        add(print);
        print.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {  
                text.append("\n" + adressbuch.printAll()+ "\n");
            }
        });
        
        JButton del = new JButton("Eintr�ge l�schen");
        add(del);
        del.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {  
                text.append("\n Alle Eintr�ge gel�scht.\n");
                adressbuch.deleteAll();
            }
        });
        
        JButton exit = new JButton("Exit");
        add(exit);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        

    }

    /**
     * @return the eingabe
     */
    public Eingabe getEingabe() {
        return eingabe;
    }





}
