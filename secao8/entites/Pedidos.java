package entites;
import java.util.Date;

import entites.enums.OrderStatus;

public class Pedidos {
	private Integer id;
	private Date momento;
	private OrderStatus statusDoPedido;
	
	public Pedidos(Integer id, Date momento, OrderStatus statusDoPedido) {
		this.id = id;
		this.momento = momento;
		this.statusDoPedido = statusDoPedido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrderStatus getStatusDoPedido() {
		return statusDoPedido;
	}

	public void setStatusDoPedido(OrderStatus statusDoPedido) {
		this.statusDoPedido = statusDoPedido;
	}

	@Override
	public String toString() {
		return "Pedidos [id=" + id + ", momento=" + momento + ", statusDoPedido=" + statusDoPedido + "]";
	}
	
	
}
