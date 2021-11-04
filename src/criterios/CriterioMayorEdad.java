package criterios;

import reality.Participante;

public class CriterioMayorEdad extends Criterio {
	
	private int edad;
	
	public CriterioMayorEdad(int edad) {
		this.edad = edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public boolean cumple(Participante p) {
		return p.getEdad()>= edad;
	}

}