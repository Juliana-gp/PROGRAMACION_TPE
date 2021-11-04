package comparadores;

import java.util.Comparator;
import reality.Participante;

public class ComparaMayorEdad implements Comparator <Participante>{

	@Override
	public int compare(Participante o1, Participante o2) {
		return ((int)o1.getEdad()) - ((int)o2.getEdad());
	}
}
