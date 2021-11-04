package criterios;

import reality.Participante;
import reality.TemaMusical;

public class CriterioInterpretaTema extends Criterio {

	TemaMusical tema;
	
	public CriterioInterpretaTema(TemaMusical tema) {
		this.tema = tema;
	}

	@Override
	public boolean cumple(Participante p) {
		return false;
	}

}
