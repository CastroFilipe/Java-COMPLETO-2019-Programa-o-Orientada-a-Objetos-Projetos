package entites;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entites.enums.NivelDoTrabalhador;

public class Trabalhador {
	private String nome;
	private NivelDoTrabalhador nivel;
	private double salarioBase;
	
	private Departamento departamento;
	private List<ContratoPorHora> contratos = new ArrayList<>();
	
	public Trabalhador(String nome, NivelDoTrabalhador nivel, double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	
	public void adicionarContrato(ContratoPorHora contrato) {
		this.contratos.add(contrato);
	}
	
	public void removerContrato(ContratoPorHora contrato) {
		this.contratos.remove(contrato);
	}
	
	public double exibirGanho(int year, int mouth) {
		double soma = this.salarioBase;
		Calendar cal = Calendar.getInstance();
		int anoContrato;
		int mesContrato;
		
		for (ContratoPorHora contrato : contratos) {
			cal.setTime(contrato.getData());
			anoContrato = cal.get(Calendar.YEAR);
			mesContrato = 1 + cal.get(Calendar.MONTH);
			
			if(year == anoContrato && mouth == mesContrato){
				soma += contrato.CalcularValorTotal();
			}
		}
		
		
		return 0.0;
	}
	
	
	
}
