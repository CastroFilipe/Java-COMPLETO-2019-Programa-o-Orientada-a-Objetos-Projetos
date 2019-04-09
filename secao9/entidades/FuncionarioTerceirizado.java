package entidades;

public class FuncionarioTerceirizado extends Funcionario {
	
	private Double despesaAdicional;

	public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double despesaAdicional) {
		super(nome, horas, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}
	
	@Override
	public double valorPagamento() {
		return super.valorPagamento() + (1.1*despesaAdicional);
	}

	@Override
	public String toString() {
		return this.nome + " - R$"+ valorPagamento();
	}
}
