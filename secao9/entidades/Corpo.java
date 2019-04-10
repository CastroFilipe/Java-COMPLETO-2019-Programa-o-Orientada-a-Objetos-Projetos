package entidades;

import entidades.enums.Cores;

public abstract class Corpo {
	private Cores cor;

	public Corpo(Cores cor) {
		this.cor = cor;
	}
	
	public abstract double area();
}
