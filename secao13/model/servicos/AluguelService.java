package model.servicos;

import entidades.AluguelCarro;
import entidades.NotaDePagamento;

public class AluguelService {
	private Double precoPorDia;
	private Double precoPorHora;
	
	private static BrazilTaxService taxaImposto = new BrazilTaxService();

	public AluguelService(Double precoPorDia, Double precoPorHora) {
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
	}
	
	
	public void processarNota(AluguelCarro aluguelCarro) {
		long tempo1 = aluguelCarro.getDataInicio().getTime(); //pega a data e transforma em milisegundos
		long tempo2 = aluguelCarro.getDataFim().getTime(); //pega a dataFim e transforma em milisegundos
		
		double horas = (double)(tempo2 -  tempo1) /1000 / 60 / 60;//transforma de milisegundos > segundos > minutos > horas
		
		double pagamentoBasico;
		if(horas <= 12.0) {
			pagamentoBasico = Math.ceil(horas) * precoPorHora;
		} else {
			pagamentoBasico = Math.ceil(horas/24) * precoPorDia;
		}
		
		double imposto = taxaImposto.calcularImposto(pagamentoBasico);
		
		aluguelCarro.setNota(new NotaDePagamento(pagamentoBasico, imposto));
	}
	
	
}
