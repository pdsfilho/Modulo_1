package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Listas {
	
	public void listaAleatoria() {
		Random r = new Random();
		
		//1) Crie uma Lista com vinte números aleatórios.
		List<Integer> listaNum = new ArrayList<>();
		
		for (int i = 0; i < 20; i ++) {
			listaNum.add(r.nextInt(100)+1);
		}
		
		//2) Adicione o número 11 à Lista criada no exercício anterior.
		listaNum.add(11);
		
		//3) Remova o número na 5ª posição da Lista.
		listaNum.remove(5);
		
		//4) Concatene a Lista atual com uma nova Lista contendo os números de 12 a 15.
		List<Integer> novaLista = new ArrayList();
		
		for (int i = 12; i <= 15; i++) {
			novaLista.add(i);
		}
		listaNum.addAll(novaLista);
		
		//5) Encontre o comprimento da Lista resultante.
		System.out.println(listaNum.size());
		
		//6) Verifique se o número 8 está presente na Lista.
		System.out.println(listaNum.contains(8));
		
		//7) Inverta a ordem dos elementos na Lista.
		System.out.println(listaNum.reversed());
		
		//8) Remova todos os números pares da Lista.
		List<Integer> listaImpar = new ArrayList<>(listaNum);
		
		listaImpar.removeIf(n -> n % 2 ==0);
		System.out.println(listaImpar);
		
		//9) Substitua o valor da 3ª posição por 30.
		listaNum.set(3, 30);
		
		//10) Ordene a Lista de forma crescente.
		Collections.sort(listaNum);
		
		// resultado
		System.out.println(listaNum);
	}
	
}
