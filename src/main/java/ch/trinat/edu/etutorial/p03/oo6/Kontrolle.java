package ch.trinat.edu.etutorial.p03.oo6;

/*
 * Created on 19.06.2007
 */
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Kontrolle {
    
    public Kontrolle (JFrame frame, Haushaltsgeraet[] geraete) {
        JSplitPane  bottomSplitPane;
        JTextArea   text;
        JScrollPane scrollpane;
        Anzeige anzeige;
        
        text = new JTextArea();
        
        anzeige = new Anzeige(geraete, text);
        anzeige.setMinimumSize(new Dimension(600,300));
        
        int an = 0;
        for (int i=0; i<geraete.length; i++) {
            if (!geraete[i].hatFehler()) {
                an++;
            }
        }
        String text1 = an + " Geräte sind bereit oder laufen normal.\n";
        String text2 = (geraete.length-an) + " Geräte haben eine Störung.\n";
        if (an==1) { text1 = an + " Gerät ist bereit oder läuft normal.\n"; }
        if ((geraete.length-an)==1) { text2 = "1 Gerät hat eine Störung.\n"; }
        text.append(text1);
        text.append(text2);
        
        scrollpane = new JScrollPane(text);
        scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollpane.setMinimumSize(new Dimension(600,50));
        
        bottomSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                anzeige,scrollpane);
        
        frame.getContentPane().add(bottomSplitPane,BorderLayout.CENTER);
        frame.setMinimumSize(new Dimension(600,400));
        frame.setMaximumSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
     
           
    }
    
    private class Anzeige extends JPanel {
        
        private JTextArea text;
        
        JLabel l;
        GridBagLayout gridbag=new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        
        
        public Anzeige (Haushaltsgeraet[] geraete, JTextArea t) {
            this.text = t;
            
            setLayout(gridbag);
            
            c.fill = GridBagConstraints.HORIZONTAL;
            c.anchor = GridBagConstraints.WEST;
            c.weightx = 0.5;
            
            c.gridx = 0;
            l = new JLabel("Gerät");
            c.gridy = 0;
            gridbag.setConstraints(l,c);
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
            
                        
            for (int i=0; i<geraete.length; i++) {
                c.gridx = 0;
                l = new JLabel(geraete[i].getTyp());
                c.gridy = i+1;
                gridbag.setConstraints(l,c);
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
                l = new JLabel("�");
                l.setFont((l.getFont()).deriveFont(30f));
                if (!geraete[i].hatFehler()) {
                    l.setForeground(Color.GREEN);
                } else {
                    l.setForeground(Color.RED);
                    text.append(geraete[i].getName() + ": " + geraete[i].getFehlermeldung()+ "\n");
                }
                gridbag.setConstraints(l, c);
                add(l);
                
            }

        }
        
    }
    

    public static void main(String[] args) {
        
    
       Mikrowelle m = new Mikrowelle ("Mikro 1 " , "Küche");
    	Backofen b = new Backofen ("ofen 1 " , "Küche");
    	Mikrowelle n = new Mikrowelle("Mikro 2 " , "Wohnzimmer");
    	Waschmaschine w = new Waschmaschine ("Waschmaschine 1", "Waaschküche ");
       
       w.start("wolle 30°C", 7);
       n.start(600, 1.5);
       b.start(200,  "Unter- und Oberhitze");
       Haushaltsgeraet [] geraete = {m, b, n , w};
       
         
    	
      
        
        JFrame  frame = new JFrame("Ger�te�berwachung");
        Kontrolle kontrolle = new Kontrolle(frame, geraete);
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
          System.exit(0);
        }
          });
            
    }
    

}



