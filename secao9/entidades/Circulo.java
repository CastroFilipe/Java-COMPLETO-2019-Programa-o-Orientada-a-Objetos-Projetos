package entidades;

import entidades.enums.Cores;

public class Circulo extends Corpo {
	private double raio;
	
	public Circulo(Cores cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}
	
}
