package entidades;

import java.util.Date;


public class AluguelCarro {
	
	private Date dataInicio;
	private Date dataFim;
	
	private Carro modeloCarro;
	private NotaDePagamento nota;
	
	public AluguelCarro(Date dataInicio, Date dataFim, Carro modeloCarro) {
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.modeloCarro = modeloCarro;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
	public void setNota(NotaDePagamento nota) {
		this.nota = nota;

	}
	
	public NotaDePagamento getNota() {
		return this.nota;

	}

}
