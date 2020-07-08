package Modelos;

public class Paciente extends Persona {

	protected Cita cita;
	protected String email;
	protected HistoriaClinica historiaClinica;
	protected Collection<Receta> recetas;
	
	public Paciente() {
		historiaClinia = new HistoriaClinica();
		recetas = new Collection<>(;)
	}
	
	
	
	public boolean solicitarCita() {
		// TODO - implement Paciente.solicitarCita
		throw new UnsupportedOperationException();
	}

}