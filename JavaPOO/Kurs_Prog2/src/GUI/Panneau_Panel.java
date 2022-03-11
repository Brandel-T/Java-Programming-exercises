package GUI;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Panneau_Panel
{
	public static void main(String[] args) {
		/**
		 * ne contient pas de :
		 * --> barre de titre
		 * --> barre de menu
		 * 
		 * peut par contre contenir :
		 * --> des zones de texte 
		 * --> des boutons
		 * 
		 */
		
		Panel panneau = new Panel();
		panneau.setBounds(300, 300, 400, 300); //les bornes (x, y, largeur, longueur)
		panneau.setBackground(Color.yellow); //couleur de fond
		panneau.setVisible(true); //rendre visible
		
		//mettons y un bouton à l'intérieur
		Button btn = new Button("OK");
		
		//ajoutons le au panneau
		panneau.add(btn);
		
		//cadre principal qui contiendra tous les autres
		Frame cadre = new Frame("Cadre principal");
		cadre.setSize(200, 200);
		cadre.setLocation(200, 200);
		cadre.add(panneau);
		cadre.setVisible(true);
		
	}

}
