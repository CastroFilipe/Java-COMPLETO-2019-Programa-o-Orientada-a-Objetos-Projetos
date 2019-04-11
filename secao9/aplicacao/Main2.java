package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.FuncionarioTerceirizado;

public class Main2 {

	public static void main(String[] args) {
		List<Funcionario> listaDeFuncionarios = new ArrayList<Funcionario>();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de funcionarios");
		int numeroDeFuncionarios = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < numeroDeFuncionarios; i++) {//ler dados dos funcionarios e armazenalos na lista
			
			System.out.println("O funcionario é terceirizado? (y/n)");
			String resposta = sc.nextLine();
			
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			
			System.out.println("Horas Trabalhadas: ");
			int horas = sc.nextInt(); sc.nextLine();
			
			System.out.println("Valor por Hora: ");
			double valorPorHora = sc.nextDouble(); sc.nextLine();
			
			if(resposta.equalsIgnoreCase("y")) {//é terceirizado
				System.out.println("Valor da despesa adicional: ");
				double despesaAdicional = sc.nextDouble(); sc.nextLine();
				listaDeFuncionarios.add(new FuncionarioTerceirizado(nome, horas, valorPorHora, despesaAdicional));
				
			} else if (resposta.equalsIgnoreCase("n")) {
				listaDeFuncionarios.add(new Funcionario(nome, horas, valorPorHora));
			}
			
		}
		
		System.out.println("PAGAMENTOS");
		
		for (Funcionario funcionario : listaDeFuncionarios) {
			System.out.println(funcionario);
		}
		
		
		
		sc.close();
	}

}
