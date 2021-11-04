package reality;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import criterios.Criterio;

public class Persona extends Participante {

	private String apellido;
	private LocalDate fechaDeNacimiento;
	private ArrayList<String> generosFav;
	private ArrayList<String> instrumentos;
	private ArrayList<String> idiomas;
	

	public Persona(String nombre, String apellido, LocalDate nacimiento){
		super(nombre);
		this.apellido = apellido;
		this.fechaDeNacimiento = nacimiento;
		generosFav = new ArrayList<>();
		instrumentos = new ArrayList<>();
		idiomas = new ArrayList<>();
	}
	
	
	@Override
	public Participante copia() {
		Persona p1 = new Persona(this.getNombre(), this.getApellido(),this.fechaDeNacimiento );
		return p1;
	}
	@Override
	public ArrayList<Participante> busquedaParticipantes(Criterio c1){
		ArrayList<Participante> seleccionado = new ArrayList <>();
		if (c1.cumple(this)) 
			seleccionado.add(this.copia());
		return seleccionado;
	}
	
	
	
	//Lo hice asi porque de esta forma es actualizable a traves del tiempo
	public int getSumaEdades(){
		LocalDate ahora = LocalDate.now();
	    Period periodo = Period.between(fechaDeNacimiento, ahora);
	    return periodo.getYears();
	}

	@Override
	public int getCantPersonas() {
		return 1;
	}

	
	public String getApellido() {
		return apellido;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	@Override
	public ArrayList<String> getGenerosFav() {
		return new ArrayList<String>(generosFav);
	}

	public ArrayList<String> getInstrumentos() {
		return new ArrayList<String>(instrumentos);
	}
	
	public ArrayList<String> getIdiomas(){
		return new ArrayList<String>(idiomas);
	}
	
	public void addGenero(String gf){
		if (generosFav.contains(gf)){
			generosFav.add(gf);
		}
	}
	
	public void addInstrumento(String i){
		if (!instrumentos.contains(i)){
			instrumentos.add(i);
		}
	}
	
	public void addIdioma(String idi){
		if (!idiomas.contains(idi)){
			idiomas.add(idi);
		}
	}


	
	public String toString(){
		return "Participante: "+ this.getNombre()+" "+this.getApellido()+"\nEdad: "+this.getEdad();
	}
}