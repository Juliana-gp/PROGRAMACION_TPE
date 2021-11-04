package comparadores;

import java.util.Comparator;
import reality.Participante;

public class ComparaCantInstrumentos implements Comparator <Participante>{

	@Override
	public int compare(Participante o1, Participante o2) {
		return((o1.getInstrumentos()).size())-((o2.getInstrumentos()).size());
	}
}
