package comparadores;
		
import java.util.Comparator;
import reality.Participante;

public class ComparadorCompuesto implements Comparator <Participante>{
	private Comparator<Participante> c1, c2;
	
	public ComparadorCompuesto(Comparator<Participante>c1, Comparator<Participante>c2) {
			this.c1 = c1;
			this.c2 = c2;
	}
			
	@Override
	public int compare(Participante o1, Participante o2) {
		if ((c1.compare(o1, o2)) == 0 ) {
			return c2.compare(o1,o2);
		}
		else
			return c1.compare(o1, o2);
	}
}
