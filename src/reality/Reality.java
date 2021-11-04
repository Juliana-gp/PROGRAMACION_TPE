package reality;

import java.util.ArrayList;

public class Reality {

	private ArrayList<Participante> participantes;
	private ArrayList<Coach> coaches;
	
	public Reality(){
		this.participantes = new ArrayList<Participante>();
		this.coaches = new ArrayList<Coach>();
	}
	
	public void addParticipante(Participante pp){
		if (!participantes.contains(pp)){
			participantes.add(pp);
		}
	}
	
	public void addCoach(Coach cc){
		if (!coaches.contains(cc)){
			coaches.add(cc);
		}
	}
}