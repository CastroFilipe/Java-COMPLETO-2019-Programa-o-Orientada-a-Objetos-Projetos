package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entidades.AluguelCarro;
import entidades.Carro;
import model.servicos.AluguelService;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		Date data1 = sdf.parse("12/04/2019 10:30");
		Date data2 = sdf.parse("12/04/2019 14:40");
		Date data3 = sdf.parse("14/04/2019 10:30");
		Date data4 = sdf.parse("16/04/2019 11:40");
		
		double precoHora = 10.0;
		double precoDia = 130.0;
		
		AluguelCarro aluguelCarro = new AluguelCarro(data3, data4, new Carro("Civic"));
		AluguelService servicoDeAluguel = new AluguelService(precoDia, precoHora);
		
		servicoDeAluguel.processarNota(aluguelCarro);
		
		System.out.println("Pagamento base " + aluguelCarro.getNota().getPagamentoBasico());
		System.out.println("taxa Imposto "+aluguelCarro.getNota().getTaxa());
		System.out.println("Total " +aluguelCarro.getNota().calcularTotal());
		
		
	}

}
