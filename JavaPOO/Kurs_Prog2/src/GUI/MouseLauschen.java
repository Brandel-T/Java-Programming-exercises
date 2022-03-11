package GUI;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseLauschen extends Frame implements MouseMotionListener
{
	Canvas cv;
	
	public MouseLauschen (String title) {
		super(title);
		setSize(300, 300);
		setLocation(0,0);
		setLayout(new BorderLayout());
		
		cv = new Canvas();
		cv.setBackground(Color.BLUE); 
		cv.setSize(200, 200);
		
		add( BorderLayout.CENTER, cv);
		cv.addMouseMotionListener(this);
		setVisible(true);
	}
	
	
	@Override
	/**
	 * lorsque_la souris_est deplac�e_en mm_temps_que son bouton_est
	 * _enfonc�: un_peu comme_un_cliss�-d�pos�
	 * l#event sera_toujours appel�_si la_touche reste_enfonc�e
	 */
	public void mouseDragged(MouseEvent e) 
	{ 
		System.out.println("la touche EST enfonc�e: [ x = " + e.getX() + ", y = " + e.getY() + " ]");
	}

	@Override
	/**
	 * l'event est_appelle lorsq_la souris_est_d�pos�e � l'interieur
	 * du_composant
	 */
	public void mouseMoved(MouseEvent e) 
	{ 
		System.out.println("la touche N'EST PAS enfonc�e: [ x = " + e.getX() + ", y = " + e.getY() + " ]");
	}

	public static void main(String[] args) { 
		new MouseLauschen("Evenement lorsque la souris est d�plac�e");
	}
}
