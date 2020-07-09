package Modelos;

public class Receta {

	protected Paciente recetas;
	protected Datetime fecha;
	protected PlanNutricional planNut;
	protected Collection<Medicamento> medicamentos;
	
	public Receta() {
		planNut = new PlanNutricional();
		medicamentos = new Collection<>();
	}
	
	
	

}