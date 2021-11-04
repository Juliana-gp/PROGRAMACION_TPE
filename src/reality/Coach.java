package reality;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import criterios.Criterio;


public class Coach {

	private String nombre;
	private ArrayList<Participante> equipo; //puede ser una instrancia de un grupo?
	
	//______________________________________________________________OPCION 2___________________________________
	private Grupo equipo1;
	
	public Coach(String nombre){
		this.nombre = nombre;
		this.equipo = new ArrayList<Participante>();
		//__________________________________________________________OPCION 2___________________________________
		this.equipo1 = new Grupo("Equipo de "+nombre);
	}

	public String getNombre() {
		return nombre;
	}

	
	//______________________________________________________________OPCION 2___________________________________
	public void addAlEquipo1(Participante pp){
			equipo1.addParticipante(pp);
	}

	
	
	//puede tener una persona e integrante de un grupo??
	public void addAlEquipo(Participante pp){
		if (!equipo.contains(pp)){
			equipo.add(pp);
		}
	}

	public ArrayList<Participante> getEquipo() {
		return new ArrayList<Participante>(equipo);
	}
	
	public ArrayList<Participante> getEquipoBatalla(Comparator<Participante> comp) {
		ArrayList<Participante> listado = new ArrayList <>(equipo);
		Collections.sort(listado, comp);
		return listado;
	}
	

	
	

	public ArrayList <String> getInstrumentos() {
		ArrayList<String> instrumentos = new ArrayList<>();
			for(Participante p : equipo) {
				ArrayList<String> aux = p.getInstrumentos();
				for (String instrumento:aux) {
					if(!instrumentos.contains(instrumento))								
						instrumentos.add(instrumento);
				}
			}	
		Collections.sort(instrumentos);
		return instrumentos;		
	}
	
	
	

	
	public ArrayList <String> getGeneros() {
		ArrayList<String> generos = new ArrayList<>();
		for(Participante p : equipo) {
			ArrayList<String> aux = p.getGenerosFav();
			for (String genero:aux) {
				if(!generos.contains(genero))								
					generos.add(genero);
			}
		}	
		return generos;		
	}

	
	
	public ArrayList <String> getIdiomas() {
		ArrayList<String> idiomas = new ArrayList<>();
		for(Participante p : equipo) {
			ArrayList<String> aux = p.getIdiomas();
			for (String idioma:aux) {
				if(!idiomas.contains(idioma))								
					idiomas.add(idioma);
			}
		}	
		return idiomas;		
	}

	
	
	public double getPromedioEdad() {
		double sumaEdades = 0;
		for(Participante p : equipo) {
			sumaEdades+=p.getEdad();
		}
		if (equipo.size()>0)
			return sumaEdades/equipo.size();
		else return 0;
	}
	
	
	
	
	public ArrayList<Participante> busquedaParticipantes(Criterio c1){
		ArrayList<Participante> seleccionados = new ArrayList <>();
		for(Participante p : equipo) {
				seleccionados.addAll(p.busquedaParticipantes(c1));
		}		
		return seleccionados;
	}
	
}
