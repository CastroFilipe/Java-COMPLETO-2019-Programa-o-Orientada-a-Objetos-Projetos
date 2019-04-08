package listas;

import java.util.ArrayList;
import java.util.List;

public class ListasExemplo {

	public static void main(String[] args) {
		List<String> lista1 = new ArrayList<>();
		List<Integer> lista2 = new ArrayList<>();

		lista1.add("Ana");
		lista1.add("Pedro"); //Adiciona a última posição da lista.
		lista1.add("Amora");
		lista1.add("Filipe");
		lista1.add(0, "Joana Dark");
		
		lista1.remove("Pedro"); //remove o pedro
		
		for (String conteudo : lista1) {
			System.out.println(conteudo);
		}
		
		
		System.out.println("tamanho lista1: "+lista1.size());
		lista1.clear(); //remove todos os elementos
		System.out.println("tamanho lista1 após a remoção de todos: "+lista1.size());
		System.out.println("--------------------------");
		
		lista2.add(10);
		lista2.add(20);
		lista2.add(30);
		lista2.remove(1); //remove o elemento na posição 1
		System.out.println("tamanho lista2: "+lista2.size());
		
		System.out.println("--------------------------");
		
		lista1.add("Ana");
		lista1.add("Pedro");
		lista1.add("Amora");
		lista1.add("Filipe");
		lista1.add("Fabiana");
		
		lista1.removeIf(x -> x.charAt(0) == 'A');//remove todos os elementos que comecem com a letra A
		
		
		for (String conteudo : lista1) {
			System.out.println(conteudo);
		}
		
		
	}

}
