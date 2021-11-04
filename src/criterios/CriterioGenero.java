package criterios;

import reality.Participante;

public class CriterioGenero extends Criterio {
	
	private String generoSolicitado;
	
	public CriterioGenero(String genero) {
		generoSolicitado = genero;
	}
	
	public void setGeneroSolicitado(String genero) {
		generoSolicitado = genero;
	}
	
	@Override
	public boolean cumple(Participante p) {
		return p.prefiereGenero(generoSolicitado);
	}

}
