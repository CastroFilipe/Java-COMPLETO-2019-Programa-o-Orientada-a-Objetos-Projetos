package entidades;

import entidades.enums.Cores;

public class Retangulo extends Corpo{
	
	private double largura;
	private double altura;

	public Retangulo(Cores cor, Double altura, Double largura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public double area() {
		return largura * altura;
	}

}
