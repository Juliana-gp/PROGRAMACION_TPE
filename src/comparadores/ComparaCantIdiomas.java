package comparadores;

import java.util.Comparator;
import reality.Participante;

public class ComparaCantIdiomas implements Comparator <Participante>{

	@Override
	public int compare(Participante o1, Participante o2) {
		return((o1.getIdiomas()).size())-((o2.getIdiomas()).size());
	}
}