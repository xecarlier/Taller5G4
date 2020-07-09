package Modelos;

import java.util.*;

public class AreaMedica {

	protected Collection<Doctor> doctores;
	protected String especilidad;
	protected float costo;
	
	public AreaMedica(Collection<Doctor> doc) {
		doctores = doc;
	}

}