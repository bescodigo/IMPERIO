package program;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		Window game = new Window();
		State state = new State();
		Event event = new Event();
		
		game.setVisible(true);
		
			
		int indexEventoAleatorio = event.generateEvent();
		
		game.setCard(event.listaEventos[indexEventoAleatorio], indexEventoAleatorio,state, event); 
		
		

	}

}
