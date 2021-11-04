package criterios;

import reality.Participante;

public class CriterioIdioma extends Criterio {
	
	private String idiomaSolicitado;
	
	public CriterioIdioma(String idioma) {
		idiomaSolicitado = idioma;
	}
	
	public void setIdiomaSolicitado(String idioma) {
		idiomaSolicitado = idioma;	
	}
	
	@Override
	public boolean cumple(Participante p) {
		return p.conoceIdioma(idiomaSolicitado);
	}

}
