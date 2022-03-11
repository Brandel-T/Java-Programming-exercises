package GUI;

import java.awt.Button;
import java.awt.Frame;

public class ButtonFenster
{
	public static void main(String[] args)
	{
		Frame buttonFenster = new Frame("Ein Fenster für die Schaltfläche(pour le bouton)");
		buttonFenster.setSize(300, 100);
		
		Button eineSchaltflaeche = new Button("Das ist die Beispielschaltfläche");
	
		
		buttonFenster.add(eineSchaltflaeche);
		buttonFenster.setLocation(600, 600);
		buttonFenster.setVisible(true);
	}

}
