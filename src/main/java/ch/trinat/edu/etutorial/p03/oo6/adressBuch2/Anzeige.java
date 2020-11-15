package ch.trinat.edu.etutorial.p03.oo6.adressBuch2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Anzeige {

	public Anzeige(JFrame frame, Class[] classes) {
		JSplitPane splitpane1;
		JSplitPane splitpane2;
		JTextArea text;
		JScrollPane scrollpane;

		Kontrolle kontrolle;
		Adressbuch adressbuch;

		text = new JTextArea();
		text.append("Wählen Sie 'Person' oder einen Subtyp von 'Person' aus, um die Eingabemaske anzuzeigen.");
		adressbuch = new Adressbuch();

		kontrolle = new Kontrolle(adressbuch, text, classes, frame);

		scrollpane = new JScrollPane(text);
		scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		splitpane1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, kontrolle, scrollpane);
		splitpane2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, kontrolle.getEingabe(), splitpane1);

		frame.getContentPane().add(splitpane2, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(1080, 720);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Adressbuch");
		
		Class[] classes = { Person.class, Schwimmer.class, Renner.class, Radfahrer.class };
		Anzeige anzeige = new Anzeige(frame, classes);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

}
