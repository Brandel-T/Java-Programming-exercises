package GUI_Koor;
 
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
//toutes les classes ayant ** J ** au debut de leur nom derive du packet **** java.swing *****
import javax.swing.JPanel;
import javax.swing.JRadioButton; 
import javax.swing.JTextField;


public class MyWindowTest extends JFrame implements ActionListener
{

	private static final long serialVersionUID = 1L;
	
	public MyWindowTest() {
		super("my first swing application");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //permet de fermer la fenetre lors du clic de fermeture
		this.setSize(600, 400);
		//this.setLocation(100, 100); 
		this.setLocationRelativeTo(null); //****** toujours donner la dimension de la fenetre (setSize) avant d'utiliser SetLocationRelativeTo(...)
		
		JPanel contentPane = (JPanel) this.getContentPane();  
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER) );
//		contentPane.setLayout(new GridLayout(2, 2, 15 /*width gap*/, 15 /*height gap*/));
		
		JButton btn1 = new JButton("push me");
		btn1.addActionListener(this);
		contentPane.add( btn1 );
		
		JButton btn2 = new JButton("click me");
		btn2.addActionListener(this);
		contentPane.add( btn2 );
		
		JCheckBox btnCheck = new JCheckBox("push me");
		contentPane.add( btnCheck );
		
		JRadioButton radio = new JRadioButton("push me");
		contentPane.add( radio );
		
		JTextField text = new JTextField("hello world");
		contentPane.add( text );
//		contentPane.add(new JTextArea(/*null, "hello world",*/ 22, 44) );		
	}

	public static void main(String[] args) 
	{
		MyWindowTest myWindow = new MyWindowTest();
		myWindow.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// cette methode sera excecutée lorsque un evenement sera generé
		
		System.out.println("vous avez cliqué sur un btn");
		
	}


}
