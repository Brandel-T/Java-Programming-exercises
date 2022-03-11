package GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextField;

public class AlleLayouts 
{
	public static void main(String[] args) 
	{
		//Hauptfenster erzeugen
		Frame dasFenster = new Frame("ein eigenes Fenster");
		dasFenster.setSize(650, 400);
		dasFenster.setLocation(10, 10);
		
		//Erste Flaeche mit ___Grid-Layout___
		Panel flaeche = new Panel();
		flaeche.setLayout(new GridLayout(2,2));
		flaeche.setSize(600,  400);
		dasFenster.add(BorderLayout.CENTER, flaeche); ///////***///////
		
		
		// Zweite Flaeche mit ___Flow-Layout___
		Panel a = new Panel(); // en tant que objet de la classe Panel, 'a' aura automatiquement un 'FlowLayout'
		a.setSize(300, 200);
		a.setLayout(new FlowLayout());
		a.setBackground(new Color(150, 150, 150)); // ce sont des valeurs de couleur en RGB 
		a.add(new Button("der Knopf"));
		a.add(new TextField("mein Text"));
		a.add(new Button("noch ein Knopf"));
		a.add(new TextField("zweiter Text"));
		a.add(new Scrollbar());
		
		
		// Dritte Flaeche mit ___Border-Layout___
		Panel b = new Panel();
		b.setSize(300, 200);
		b.setLayout(new BorderLayout());
		b.setBackground(new Color(200, 200, 200));
		b.add(BorderLayout.WEST, new Button("Der Knopf"));
		b.add(BorderLayout.EAST, new TextField("mein Text"));
		b.add(BorderLayout.SOUTH, new Button("noch ein Knopf"));
		b.add(BorderLayout.NORTH, new TextField("Der zweiter Text"));
		b.add(BorderLayout.CENTER, new Scrollbar());
		
		
		// vierte Fläche mit ___Card-Layout___
		Panel c = new Panel();
		c.setSize(300, 200);
		c.setLayout(new CardLayout());
		c.setBackground(new Color(100, 100, 100));
		c.add("eins", new Button("Der Knopf"));
		c.add("zwei", new TextField("mein Text"));
		c.add("drei", new Button("noch ein Knopf"));
		c.add("vier", new TextField("der zweite Text"));
		c.add("fünf", new Scrollbar());
		//((CardLayout)c.getLayout()).next(c);
		
		// Fünfte Fläche mit Grid-Layout
		Panel d = new Panel();
		d.setSize(300, 200);
		d.setLayout(new GridLayout(2,2));
		d.add(new Button("Der Knopf"));
		d.add(new TextField("meinText"));
		d.add(new Button("noch ein Knopf"));
		d.add(new Scrollbar());
		
		// Flächen 2 bis 5 zu Fläche 1 hinzufügen
		flaeche.add(a);
		flaeche.add(b);
		flaeche.add(c);
		flaeche.add(d);
		
		// Hauptfenster anzeigen
		dasFenster.setVisible(true); 	
	} 
}
