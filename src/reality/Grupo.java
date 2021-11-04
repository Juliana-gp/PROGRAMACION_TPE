package reality;

import java.util.ArrayList;

import criterios.Criterio;

public class Grupo extends Participante {
	
	private ArrayList <Participante> participantes;
	
	public Grupo(String nombre) {
		super(nombre);
		participantes = new ArrayList<>();
	}
	
	
	public void addParticipante (Participante p) {
		if (!participantes.contains(p)) {
			participantes.add(p);
		}
	}
	
	//------OK
	@Override
	public ArrayList<String> getIdiomas() {
		ArrayList<String> idiomas = new ArrayList<>();
		for (Participante p : participantes) {
			ArrayList<String> aux = p.getIdiomas();
			for (String i:aux) {
				if(!idiomas.contains(i))								
					idiomas.add(i);
			}
		}	
		return idiomas;		
	}

	//------OK
	@Override
	public ArrayList<String> getInstrumentos() {
		ArrayList<String> instrumentos = new ArrayList<>();
		for (Participante p : participantes) {
			ArrayList<String> aux = p.getInstrumentos();
			for (String instrumento:aux) {
				if(!instrumentos.contains(instrumento))								
					instrumentos.add(instrumento);
			}
		}	
		return instrumentos;	
	}
	
	//------OK
	@Override
	public ArrayList<String> getGenerosFav(){
		ArrayList <String> generosFav = new ArrayList <>();
		generosFav.addAll((participantes.get(0)).getGenerosFav());
		for (Participante p : participantes) {
			ArrayList <String> aux = p.getGenerosFav();
			for (String g: generosFav) {
				if (!aux.contains(g)) {
					generosFav.remove(g);
				}
			}	
		}
		return generosFav;
	}

	
	
	@Override
	public int getSumaEdades() {
		int aux = 0;
		for (Participante p : participantes) {
			aux += p.getSumaEdades();
		}
		return aux;
	}

	@Override
	public int getCantPersonas() {
		int aux = 0;
		for (Participante p : participantes) {
			aux += p.getCantPersonas();
		}
		return aux;
	}
	
	
	
	
	@Override
	public ArrayList<Participante> busquedaParticipantes(Criterio c1){
		ArrayList<Participante> seleccionados = new ArrayList <>();
		if (c1.cumple(this)) 
			seleccionados.add(this.copia());
		else {			
			for(Participante p : participantes) {
				seleccionados.addAll(p.busquedaParticipantes(c1));
			}		
		}
		return seleccionados;
	}
	
	
	@Override
	public Participante copia() {
		Grupo copia = new Grupo (this.getNombre());
			for(Participante p : participantes) {
				copia.addParticipante(p);
			}
		return copia;	
	}
	
	
	
	

}
