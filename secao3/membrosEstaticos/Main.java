package membrosEstaticos;

public class Main {

	public static void main(String[] args) {
		System.out.println("Circunferencia: " + Esfera.circunferencia(3));
		System.out.println("volume: " + Esfera.volume(3));
		
		Esfera.raio = 10;
		
		System.out.println(Esfera.exibirRaioInterno());
		
		Esfera.raio = 15;
		System.out.println(Esfera.exibirRaioInterno());
		
	}

}
