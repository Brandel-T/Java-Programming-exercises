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
	 * lorsque_la souris_est deplacée_en mm_temps_que son bouton_est
	 * _enfoncé: un_peu comme_un_clissé-déposé
	 * l#event sera_toujours appelé_si la_touche reste_enfoncée
	 */
	public void mouseDragged(MouseEvent e) 
	{ 
		System.out.println("la touche EST enfoncée: [ x = " + e.getX() + ", y = " + e.getY() + " ]");
	}

	@Override
	/**
	 * l'event est_appelle lorsq_la souris_est_déposée à l'interieur
	 * du_composant
	 */
	public void mouseMoved(MouseEvent e) 
	{ 
		System.out.println("la touche N'EST PAS enfoncée: [ x = " + e.getX() + ", y = " + e.getY() + " ]");
	}

	public static void main(String[] args) { 
		new MouseLauschen("Evenement lorsque la souris est déplacée");
	}
}
