package entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContratoPorHora {
	private Date data;
	private Double valorPorHora;
	private Integer horas;
	
	public ContratoPorHora(Date data, Double valorPorHora, Integer horas) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}
	
	public double CalcularValorTotal() {
		return valorPorHora * horas;
	}
	
	public Date getData() {
		return this.data;
	}

	@Override
	public String toString() {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		return ("\n ----data do contrato=" + sdf.format(data) + 
				"\n ----valor Por Hora=" + valorPorHora + 
				"\n ----horas=" + horas + 
				"\n -------------------------- \n");
	}

}
