package program;

import javax.swing.JOptionPane;

public class Event {
	
	int indexEventoAleatorio;
	
	
	String [] listaEventos = new String[] {
		"evento 1: Una nación vecina te exige 600 kilometros cuadrados de territorio o sinó te atacara con 6000 soldados. cedes?..",
		"evento 2: Una enfermedad ataca al pueblo, buscas la cura?.",
		"evento 3: Deberiamos conquistar al pueblo vecino, están debiles a causa de una peste.",
		"evento 4: Necesitamos mas oro!, ordenar trabajos forzados al pueblo?.",
		"evento 5: Una bestia salvaje ataca al pueblo por las noches. Mandar cazadores a matarlo en su cueva?.",
		"evento 6: Nuestro ejercito es debil. Invertir en armamento y soldados?.",
	};

	public String[] listaEventosImg = new String[] {
			"/src/recursos/guerra.png",
			"/src/recursos/peste.png",
			"/src/recursos/guerra.png",
			"/src/recursos/oro.png",
			"/src/recursos/monstruo.png",
			"/src/recursos/armamento.png",
	};
	
	


	public int generateEvent() {

		return indexEventoAleatorio = (int)Math.floor(Math.random()*6);
		
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
