package ch.trinat.edu.etutorial.p03.oo6.haushaltsGeraete;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Kontrolle {

    public Kontrolle(JFrame frame, Haushaltsgeraet[] geraete) {
        JSplitPane bottomSplitPane;
        JTextArea text;
        JScrollPane scrollpane;
        Anzeige anzeige;

        text = new JTextArea();

        anzeige = new Anzeige(geraete, text);
        anzeige.setMinimumSize(new Dimension(600, 300));

        int an = 0;
        for (Haushaltsgeraet haushaltsgeraet : geraete) {
            if (!haushaltsgeraet.hatFehler()) {
                an++;
            }
        }
        String text1 = an + " Geräte sind bereit oder laufen normal.\n";
        String text2 = (geraete.length - an) + " Geräte haben eine Störung.\n";
        if (an == 1) {
            text1 = an + " Gerät ist bereit oder läuft normal.\n";
        }
        if ((geraete.length - an) == 1) {
            text2 = "1 Gerät hat eine Störung.\n";
        }
        text.append(text1);
        text.append(text2);

        scrollpane = new JScrollPane(text);
        scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollpane.setMinimumSize(new Dimension(600, 50));

        bottomSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, anzeige, scrollpane);

        frame.getContentPane().add(bottomSplitPane, BorderLayout.CENTER);
        frame.setMinimumSize(new Dimension(1280, 720));
        frame.setMaximumSize(new Dimension(1280, 720));
        frame.pack();
        frame.setVisible(true);

    }

    private class Anzeige extends JPanel {

        private JTextArea text;

        JLabel l;
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        public Anzeige(Haushaltsgeraet[] geraete, JTextArea t) {
            this.text = t;

            setLayout(gridbag);

            c.fill = GridBagConstraints.HORIZONTAL;
            c.anchor = GridBagConstraints.WEST;
            c.weightx = 0.5;

            c.gridx = 0;
            l = new JLabel("Gerät");
            c.gridy = 0;
            gridbag.setConstraints(l, c);
            add(l);
            c.gridx++;
            l = new JLabel("Name");
            gridbag.setConstraints(l, c);
            add(l);
            c.gridx++;
            l = new JLabel("Standort");
            gridbag.setConstraints(l, c);
            add(l);
            c.gridx++;
            l = new JLabel("Status");
            gridbag.setConstraints(l, c);
            add(l);

            for (int i = 0; i < geraete.length; i++) {
                c.gridx = 0;
                l = new JLabel(geraete[i].getTyp());
                c.gridy = i + 1;
                gridbag.setConstraints(l, c);
                l.setFont((l.getFont()).deriveFont(Font.PLAIN));
                add(l);
                c.gridx++;
                l = new JLabel(geraete[i].getName());
                gridbag.setConstraints(l, c);
                l.setFont((l.getFont()).deriveFont(Font.PLAIN));
                add(l);
                c.gridx++;
                l = new JLabel(geraete[i].getOrt());
                gridbag.setConstraints(l, c);
                l.setFont((l.getFont()).deriveFont(Font.PLAIN));
                add(l);
                c.gridx++;

                l = new JLabel(geraete[i].getStatus());
                gridbag.setConstraints(l, c);
                l.setFont((l.getFont()).deriveFont(Font.PLAIN));
                add(l);
                c.gridx++;
                l = new JLabel("o");
                l.setFont((l.getFont()).deriveFont(30f));
                if (!geraete[i].hatFehler()) {
                    l.setForeground(Color.GREEN);
                } else {
                    l.setForeground(Color.RED);
                    text.append(geraete[i].getName() + ": " + geraete[i].getFehlermeldung() + "\n");
                }
                gridbag.setConstraints(l, c);
                add(l);

            }

        }

    }

    public static void main(String[] args) {

        Backofen ofen1 = new Backofen("Heisser Pedro", "Küche");
        Mikrowelle mikro1 = new Mikrowelle("Fust funktioniert", "Garage");
        Waschmaschine maschine1 = new Waschmaschine("Zentrifuger", "Keller");
        Waschmaschine maschine2 = new Waschmaschine("Waschmaschine oben", "Küche");
        ofen1.start(200, "Heissluft");
        mikro1.start(600, 3.0);
        maschine1.start("Pflegeleicht", 7);
        maschine2.start("Baumwolle", 6);

        Haushaltsgeraet[] geraete = {ofen1, mikro1, maschine1, maschine2};

        JFrame frame = new JFrame("Geräteüberwachung");
        Kontrolle kontrolle = new Kontrolle(frame, geraete);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

}
