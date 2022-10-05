package program;

public class Success {

	StateAtribute [][] stateAtribute = new StateAtribute[][] {
		
		// Una nación vecina te exige 600 kilometros cuadrados de territorio o sinó te atacara con 6000 soldados. cedes?.
		{new StateAtribute(0,0,-600), new StateAtribute(0,-6000,0)}, 
		// Una enfermedad ataca al pueblo, buscas la cura?.
		{new StateAtribute(-1000,-4000,0), new StateAtribute(-2000,-2000,-1000)},
		// Deberiamos conquistar al pueblo vecino, están debiles a causa de una peste.
		{new StateAtribute(-4000,-4000,8000), new StateAtribute(-200,-100,50)},
		// Necesitamos mas oro!, ordenar trabajos forzados al pueblo?.
		{new StateAtribute(-3000,-200,5000), new StateAtribute(200,-20,-1000)},
		// Una bestia salvaje ataca al pueblo por las noches. Mandar cazadores a matarlo en su cueva?.
		{new StateAtribute(300,-100,7000), new StateAtribute(-700,20,-200)},
		// Nuestro ejército es debil. Invertir en armamento y soldados?.
		{new StateAtribute(-5500,10000,2000), new StateAtribute(500,-300,-4000)},
		
	};
	
	State state;
	
	public Success(State state) {
		super();
		this.state = state;
	}

	public void ejecuteConsecuense(int index, int confirm) {
		
		if(confirm!=-1) {
			
			state.setTerritory(stateAtribute[index][confirm].territory);
			state.setPoblation(stateAtribute[index][confirm].poblation);
			state.setForce(stateAtribute[index][confirm].force);
		}
		
		
	}

	
}
