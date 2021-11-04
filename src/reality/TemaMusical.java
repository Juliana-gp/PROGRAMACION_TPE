package reality;

import java.util.ArrayList;

public class TemaMusical {

	private String titulo;
	private String idioma;
	private ArrayList<String> generos;
	private ArrayList<String> instrumentos;
	
	public TemaMusical(String titulo, String idioma){
		this.titulo = titulo;
		this.idioma = idioma;
		generos = new ArrayList<>();
		instrumentos = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getIdioma() {
		return idioma;
	}

	public ArrayList<String> getGeneros() {
		return new ArrayList<String>(generos);
	}

	public ArrayList<String> getInstrumentos() {
		return new ArrayList<String>(instrumentos);
	}
	
	public void addGenero(String genero){
		if(!generos.contains(genero)){
			generos.add(genero);
		}
	}
	
	public void addInstrumento(String inst){
		if (!instrumentos.contains(inst)){
			instrumentos.add(inst);
		}
	}
	
}