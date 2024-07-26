package Exercicios;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Repeticao {
	
	public Repeticao() {}
	
	public void imprimeNome() {
		String[] nomes = new String[3];
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Informe um nome: \n");
			
			nomes[i]= scan.nextLine();
			
		}
		//scan.close();
		System.out.println(Arrays.toString(nomes));
	}
	
	public void adivinharNumero() {
		Random r = new Random();
		int numero = r.nextInt(10)+1, usuarioNumero = 99;
		
		Scanner scan = new Scanner(System.in);
		
		while(usuarioNumero != numero) {
			System.out.println("Adivinhe um número entre 0 a 10. \n");
			usuarioNumero = scan.nextInt();
			
			if(usuarioNumero < numero) {
				System.out.println("O número sorteado é maior!");
				
			}
			else if (usuarioNumero > numero) {
				System.out.println("O número sorteado é menor! ");
			}
			else {
				System.out.println("achou! ");
			}
		}

	}
	public void escolheNomes() {
		List<String> nomes = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		String opcao = "s";
		
		do {
			System.out.println("Informe um nome: \n");
			
			String nome = scan.nextLine();
			nomes.add(nome);
			
			System.out.println("Deseja adicionar outro nome (S/N)?");
			opcao = scan.nextLine();
			
		}while(opcao.equalsIgnoreCase("s"));
		
		
		//scan.close();
		System.out.println(nomes);
	}
	
}

