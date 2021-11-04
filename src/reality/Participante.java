package reality;

import java.util.ArrayList;

import criterios.Criterio;


public abstract class Participante {

	protected String nombre;
	

	public Participante(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract Participante copia();
	public abstract ArrayList<Participante> busquedaParticipantes(Criterio c1);
	
	public abstract ArrayList<String> getIdiomas();
	public boolean conoceIdioma(String idioma) {
		ArrayList<String> idiomas = this.getIdiomas();
		return (idiomas.contains(idioma));
	}
	
	public abstract ArrayList<String> getInstrumentos();
	public boolean tocaInstrumento(String instrumento) {
		ArrayList<String> instrumentos = this.getInstrumentos();
		return (instrumentos.contains(instrumento));
	}
	
	public abstract ArrayList<String> getGenerosFav();
	
	public boolean prefiereGenero(String genero) {
		ArrayList<String> generos = this.getGenerosFav();
		return (generos.contains(genero));
	}

	public abstract int getSumaEdades();
	public abstract int getCantPersonas();
	public double getEdad() {
		return this.getSumaEdades()/this.getCantPersonas();
	}
}