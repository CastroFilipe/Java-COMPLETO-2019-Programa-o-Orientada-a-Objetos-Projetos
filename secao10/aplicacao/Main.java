package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entidades.Reserva;

public class Main {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//valores para simular datas e números adicionados. Evitando criar toda a logica de solicitação ao usuario.
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		
		String stringData1 = "10/04/2019";
		String stringData2 = "11/05/2019";
		String stringData3 = "22/06/2019";
		String stringData4 = "24/07/2019";
		String stringData5 = "24/07/1";
		
		
		try {
			//faz a reserva. Nenhum erro acontecerá pois a data de checkIn é anterior a data de CheckOut.
			Reserva reserva1 = new Reserva(num1, sdf.parse(stringData1), sdf.parse(stringData2));
			
			//atualiza a reserva. Nenhum erro acontecerá
			reserva1.atualizarDatas(sdf.parse(stringData3), sdf.parse(stringData4));
			
			System.out.println(reserva1);
			
			//atualiza a reserva. Erro. CheckIn > Checkout
			//reserva1.atualizarDatas(sdf.parse(stringData4), sdf.parse(stringData3));
			
			//atualiza a reserva com data invalida.
			//reserva1.atualizarDatas(sdf.parse(stringData4), sdf.parse(stringData5));
			
			
			//faz a reserva3. Erro. data5 é inválida
			//Reserva reserva3 = new Reserva(num3, sdf.parse(stringData2), sdf.parse(stringData5));
			
			System.out.println(reserva1);
			
		} catch(ParseException e) {
			System.out.println("Data inválida: "+ e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("Erro:!!!! "+ e.getMessage());
		} 
	}

}
