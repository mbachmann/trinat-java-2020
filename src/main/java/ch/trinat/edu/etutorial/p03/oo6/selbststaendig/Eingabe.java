/*
 * Diese Klasse erzeugt die Eingabefelder im Graphikfenster.
 */

package ch.trinat.edu.etutorial.p03.oo6.selbststaendig;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Eingabe extends JPanel {

    JTextField[] fields;
    Class type;

   
    public void zeigeAn() {

        try {
            String[] anzeige = (String[])(type.getField("anzeige").get(null));

            //Layout f�r Eingabefelder
            GridBagLayout gridbag=new GridBagLayout();
            GridBagConstraints c = new GridBagConstraints();
            setLayout(gridbag);

            c.fill = GridBagConstraints.HORIZONTAL;// fill
            c.anchor = GridBagConstraints.WEST; // left align.
            c.weightx = 1.0;
            c.weighty = 0.5;
            // c.gridx = 0;

            JLabel l;
            fields = new JTextField[anzeige.length];
            l = new JLabel("Personalien und Adresse");
            c.gridwidth = GridBagConstraints.REMAINDER;
            //c.gridy = 0;
            gridbag.setConstraints(l,c);
            add(l);


            l = new JLabel(" ");
            //c.gridy++;
            gridbag.setConstraints(l,c);
            add(l);

            for (int i=0; i<anzeige.length; i++) {
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridwidth = GridBagConstraints.RELATIVE;
                l = new JLabel(anzeige[i] + ":  ");
                gridbag.setConstraints(l,c);
                add(l);

                c.fill = GridBagConstraints.NONE;
                c.gridwidth = GridBagConstraints.REMAINDER;
                fields[i] = new JTextField("",10);
                gridbag.setConstraints(fields[i],c);
                add(fields[i]);
            }
        } catch (Exception e) {
            System.out.println("Fehler in der Klasse! Kein Feld \"anzeige\" definiert.");
        }
      

    }


    public void makePerson (Adressbuch a) throws Exception {

        String[] input = new String[fields.length];
        for (int i=0; i<fields.length; i++) {
            input[i] = fields[i].getText();
        }
        Class[] paramTypes = {String[].class};
        Object[] initargs = {input};
        a.addPerson((Person)(type.getConstructor(paramTypes).newInstance(initargs)));
    }

    public void resetFields () {
        for (int i=0; i<fields.length; i++) {
            fields[i].setText("");
        }

    }
    
    public void reset () {
        removeAll();
    }


    /**
     * @param type the type to set
     */
    public void setType(Class type) {
        this.type = type;
    }


}
