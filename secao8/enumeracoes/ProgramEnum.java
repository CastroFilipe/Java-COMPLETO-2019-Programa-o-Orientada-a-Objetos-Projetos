package enumeracoes;

import java.util.Date;

import entites.Pedidos;
import entites.enums.OrderStatus;

public class ProgramEnum {

	public static void main(String[] args) {
		Pedidos pedido = new Pedidos(53, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);
		
		System.out.println(pedido);

	}

}
