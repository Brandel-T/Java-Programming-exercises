package GUI_Koor;

//import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
//toutes les classes ayant ** J ** au debut de leur nom derive du packet **** java.swing *****
import javax.swing.JPanel;
import javax.swing.JRadioButton;
//import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MyWindow extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	public MyWindow() {
		super("my first swing application");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //permet de fermer la fenetre lors du clic de fermeture
		this.setSize(600, 400);
		//this.setLocation(100, 100);
		//avec ceci nous serons toujours obligé de definir la position en calculant
		//mais avec ++ " this.setLocationRelativeTo(...); " ++ on aura la fenetre toujours centée en fonction d'une autre
		/**
		 *  "this" renvoit sur l'objet courant (pour ce cas c'est notre fenetre (window))
		 */
		this.setLocationRelativeTo(null); //****** toujours donner la dimension de la fenetre (setSize) avant d'utiliser SetLocationRelativeTo(...)
		
		JPanel contentPane = (JPanel) this.getContentPane(); //contenu de la fenetre excepté le menu et la bordure
//		contentPane.setLayout( new FlowLayout(FlowLayout.CENTER, 12, 12) );
		contentPane.setLayout(new GridLayout(2, 2, 15 /*width gap*/, 15 /*height gap*/));
		contentPane.add(new JButton("push me"));
		contentPane.add(new JCheckBox("push me") );
		contentPane.add(new JRadioButton("push me") );
		contentPane.add(new JTextField("hello world"));
//		contentPane.add(new JTextArea(/*null, "hello world",*/ 22, 44) );
		
		
	}

	public static void main(String[] args) 
	{
		MyWindow myWindow = new MyWindow();
		myWindow.setVisible(true);

	}

}
