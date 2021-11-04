package criterios;

import reality.Participante;

public class CriterioNot extends Criterio {
	
	private Criterio criterio;
	

	public CriterioNot(Criterio positivo) {
		this.criterio = positivo;
	}


	@Override
	public boolean cumple(Participante p) {
		return !criterio.cumple(p);
	}

}
