package reality;

import java.util.ArrayList;

/*La producción también almacena un conjunto de temas musicales que pueden 
ser cantados durante el reality.*/

public class Produccion extends Reality{

	private ArrayList<TemaMusical> temas;
	
	public Produccion(){
		temas = new ArrayList<TemaMusical>();
	}
	
	public void addTemaMusical(TemaMusical tm){
		if (!temas.contains(tm)){
			temas.add(tm);
		}
	}
	
}