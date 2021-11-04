package comparadores;

import java.util.Comparator;
import reality.Participante;

public class ComparaCantGeneros implements Comparator <Participante>{

	@Override
	public int compare(Participante o1, Participante o2) {
		return((o2.getGenerosFav()).size())-((o1.getGenerosFav()).size());
	}
}
