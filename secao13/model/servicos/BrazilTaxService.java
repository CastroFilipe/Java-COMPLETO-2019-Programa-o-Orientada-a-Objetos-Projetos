package model.servicos;

public class BrazilTaxService {
	private static final Double IMPOSTO_15 = 0.15;
	private static final Double IMPOSTO_20 = 0.2;
	
	public double calcularImposto(double valor) {
		if(valor <= 100.0) {
			return valor* IMPOSTO_20;
		} else {
			return valor*IMPOSTO_15;
		}
	}
	
}
