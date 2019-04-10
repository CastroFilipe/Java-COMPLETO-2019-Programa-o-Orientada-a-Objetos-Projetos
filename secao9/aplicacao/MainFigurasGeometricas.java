package aplicacao;
import java.util.ArrayList;
import java.util.List;

import entidades.Circulo;
import entidades.Retangulo;
import entidades.enums.Cores;
import entidades.Corpo;

public class MainFigurasGeometricas {

	public static void main(String[] args) {
		List<Corpo> listaDeFiguras = new ArrayList<Corpo>();
		
		Circulo c1 = new Circulo(Cores.BLACK, 10);
		Circulo c2 = new Circulo(Cores.BLUE, 20);
		
		Retangulo r1 = new Retangulo(Cores.BLACK, 10.0, 10.0);
		Retangulo r2 = new Retangulo(Cores.RED, 20.0, 20.0);
		
		listaDeFiguras.add(c1);
		listaDeFiguras.add(c2);
		listaDeFiguras.add(r1);
		listaDeFiguras.add(r2);

		for (Corpo corpo : listaDeFiguras) {
			System.out.println(corpo.area());
		}



	}

}
