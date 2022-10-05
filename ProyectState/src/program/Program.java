package program;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		Window game = new Window();
		State state = new State();
	
		Event event;
		
		game.setVisible(true);
		
		event = new Event();
			
		int indexEventoAleatorio = event.generateEvent();
		
		game.setCard(event.listaEventos[indexEventoAleatorio], indexEventoAleatorio,state, event); 
		
		
		game.lblForce.setText("Force:      "+state.getForce()+" soldiers ");
		   
		game.lblTerritory.setText("Territory:   "+state.getTerritory()+ " Km2 ");
		
		game.lblPoblation.setText("Poblation: "+state.getPoblation()+ " peoples ");
		
		
		
		
		
		

	}

}
