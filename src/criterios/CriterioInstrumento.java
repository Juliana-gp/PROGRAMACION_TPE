package criterios;

import reality.Participante;

public class CriterioInstrumento extends Criterio {

	private String instrumentoSolicitado;
	
	public CriterioInstrumento(String instrumento) {
		instrumentoSolicitado = instrumento;
	}
	
	public void setInstrumentoSolicitado(String instrumento) {
		instrumentoSolicitado = instrumento;
	}	
	
	@Override
	public boolean cumple(Participante p) {
		return p.tocaInstrumento(instrumentoSolicitado);
	}

}
