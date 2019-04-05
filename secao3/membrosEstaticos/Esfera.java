package membrosEstaticos;

public class Esfera {
	public static double raio;
	
	public static double circunferencia(double raio) {
		return 2* Math.PI * raio;
	}
	
	public static double volume(double raio) {
		return (4*Math.PI* Math.pow(raio,3))/3;
	}

	public static double exibirRaioInterno() {
		return raio;
	}
}
