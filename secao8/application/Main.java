package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entites.Departamento;
import entites.Trabalhador;
import entites.enums.NivelDoTrabalhador;
import entites.ContratoPorHora;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do departamento");
		String nomeDepartamento = sc.nextLine();
		
		System.out.println("Nome do Trabalhador");
		String nomeTrabalhador = sc.nextLine();
		
		System.out.println("Level do Trabalhador");
		String levelTrabalhador = sc.nextLine();
		
		System.out.println("Salario Base");
		double salarioBaseTrabalhador = sc.nextDouble();
		
		//criando um trabalhador com as informações coletadas.
		Trabalhador trabalhador = 
				new Trabalhador(nomeTrabalhador, NivelDoTrabalhador.valueOf(levelTrabalhador), salarioBaseTrabalhador, new Departamento(nomeDepartamento));
		
		System.out.println("Quantos contratos "+trabalhador.getNome()+" ?");
		int numContratos = sc.nextInt();
		
		for (int i = 0; i < numContratos; i++) {
			System.out.println("dados do contrato "+ i);
			System.out.println("Data (DD/MM/YYYY): ");
			String data = sc.next();
			
			System.out.println("valor por hora: ");
			double valor = sc.nextDouble();
			
			System.out.println("duracao em horas: ");
			int duracao = sc.nextInt();
			
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			Date data2 = sdf1.parse(data);
			
			ContratoPorHora contrato = new ContratoPorHora(data2, valor, duracao);
			
			trabalhador.adicionarContrato(contrato);
			
		}
		
		System.out.println(trabalhador);
		
		System.out.println();
		
		System.out.println("Consultar ganhos no periodo:");
		System.out.println("Ano:");
		int ano = sc.nextInt();
		
		System.out.println("Mês: ");
		int mes = sc.nextInt();
		
		System.out.println("Ganho total de R$"+trabalhador.exibirGanho(ano, mes)+ " no mês "+mes+" de "+ano);
		
		
		sc.close();

	}

}
