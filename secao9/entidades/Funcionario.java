package entidades;

public class Funcionario {
	protected String nome;
	protected Integer horas;
	protected Double valorPorHora;
	
	public Funcionario(String nome, Integer horas, Double valorPorHora) {
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}
	
	public double valorPagamento() {
		return horas*valorPorHora;
	}

	@Override
	public String toString() {
		return this.nome + " - R$"+ valorPagamento();
	}
	
}
