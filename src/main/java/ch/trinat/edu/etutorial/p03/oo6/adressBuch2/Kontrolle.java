package ch.trinat.edu.etutorial.p03.oo6.adressBuch2;

/*
 * In dieser Klasse werden die Buttons und die Dropdown-Liste erzeugt.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Kontrolle extends JPanel {

    private Eingabe eingabe;
    private final Adressbuch adressbuch;
    private final JTextArea text;

    public Kontrolle(final Adressbuch a, final JTextArea t, final Class[] classes, final JFrame fr) {

        adressbuch = a;
        text = t;
        eingabe = new Eingabe();

        Choice types = new Choice();
        for (Class aClass : classes) {
            types.add(aClass.getSimpleName());
        }
        add(types);
        types.addItemListener(e -> {
            int ind = ((Choice) e.getSource()).getSelectedIndex();
            eingabe.reset();
            eingabe.setType(classes[ind]);
            eingabe.zeigeAn();
            ((JSplitPane) (fr.getContentPane().getComponent(0))).setLeftComponent(eingabe);
        });

        JButton doIt = new JButton("Person eintragen");
        add(doIt);
        doIt.addActionListener(e -> {
            try {
                eingabe.makePerson(adressbuch);
                text.append("Person eingetragen.\n");
                eingabe.resetFields();
            } catch (Exception ex) {
                text.append("Fehlerhafte Eingabe\n");
            }
        });

        JButton print = new JButton("Adressbuch drucken");
        add(print);
        print.addActionListener(e -> text.append("\n" + adressbuch.printAll() + "\n"));

        JButton del = new JButton("Einträge löschen");
        add(del);
        del.addActionListener(e -> {
            text.append("\n Alle Einträge gelöscht.\n");
            adressbuch.deleteAll();
        });

        JButton exit = new JButton("Exit");
        add(exit);
        exit.addActionListener(e -> System.exit(0));

    }

    /**
     * @return the eingabe
     */
    public Eingabe getEingabe() {
        return eingabe;
    }

}
