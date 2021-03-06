package GUI;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickEvent extends Frame implements ActionListener
{
	Button btn;
	TextArea text;
	int count = 0;

	public ClickEvent(String frame) 
	{
		super( frame ); 
		this.setSize(300, 300);
		this.setLocation(50, 100);
		this.setLayout( new GridLayout(2, 1, 11, 5));
		
		btn = new Button("Text eintragen");
		btn.addActionListener(this);
		
		text = new TextArea("", 3, 4, TextArea.SCROLLBARS_NONE);
		this.add( btn );
		this.add( text );
		this.setVisible( true );
	}
	

	@Override
	public void actionPerformed(ActionEvent e) 
	{ 
		//pour identifier_le bouton_de maniere_exacte !
		if ( e.getActionCommand().equals("Text eintragen") ) {
			text.setText(" der Text wurde ausgegeben !  : -->  " + ++count );
		}
	}

	public static void main(String[] args) {
		new ClickEvent("Schaltefläche mit Nachrichten");
	}
}
