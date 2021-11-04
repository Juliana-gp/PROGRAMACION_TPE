package reality;

import criterios.Criterio;

/*Uno de los jurados se puso exigente y solo permite agregar a su equipo participantes que al menos
toquen un determinado instrumento, conozcan ciertos idiomas y prefieran un determinado gÈnero.
Puntualmente, solo permite agregar participantes que toquen la baterÌa, puedan cantar en espaÒol e
inglÈs, y que prefieran ìpopî. Es posible que este jurado cambie en tiempo de ejecuciÛn su
restricciÛn para aceptar participantes, aunque los participantes ya aceptados no se eliminan si
cambia su preferencia por nuevos participantes.*/

public class CoachExigente extends Coach {

	//private String instrumento, idioma, genero;
	private Criterio criterio;
	
	public CoachExigente(String nombre, String apellido, Criterio criterio/*, String instrumento, String idioma, String genero*/) {
		super(nombre, apellido);
		/*this.instrumento = instrumento;
		this.idioma = idioma;
		this.genero = genero;/
		*/this.criterio = criterio;
	}
	
	
	public void setCritetio(Criterio c) {
		criterio = c;
	}
	
	public void addAlEquipo(Participante p){
		if (!getEquipo().contains(p)){
			/*if((p.contieneInstrumento(instrumento)) && (p.contieneIdioma(idioma)) && (p.contieneGenero(genero))){
				super.addAlEquipo(p);
			}
		}*/
		if (criterio.cumple(p)) {
			super.addAlEquipo(p);
		}
		}
	}

	
}