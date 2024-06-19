package primeiro_pacote;

import java.util.Scanner;

import Exercicios.Basico_01;

public class Main {

	public static void main(String[] args) {		
		Basico_01 exercicio = new Basico_01();
		
		System.out.println("Olá! Escolha o exercício desejado: "
				+ "\n -1 Saudações para usuário. "
				+ "\n -2 Soma de valores. "
				+ "\n -3 Cálculo de velocidade média."
				+ "\n -4 Cálculo de salário bruto. "
				+ "\n -5 Cálculo da parcela mensal de um empréstimo. "
				+ "\n -6 Cálculo de conta de água. "
				+ "\n -7 Cálculo de frete de uma mercadoria. "
				+ "\n -8 Conversão real para dólar. "
				+ "\n -9 Quantidade de litros de tinta necessária. "
				+ "\n -10 Cálculo de cada parcela em uma compra. ");
		
		int exercicioEscolhido = 10;
		Scanner myObj = new Scanner(System.in);
		
		exercicioEscolhido = myObj.nextInt();
		
		switch(exercicioEscolhido) {
			case 1:
				exercicio.exercicio_01();
				break;
			case 2:
				exercicio.exercicio_02();
				break;
			case 3:
				exercicio.exercicio_03();
				break;
			case 4:
				exercicio.exercicio_04();
				break;
			case 5:
				exercicio.exercicio_05();
				break;
			case 6:
				exercicio.exercicio_06();
				break;
			case 7:
				exercicio.exercicio_07();
				break;
			case 8:
				exercicio.exercicio_08();
				break;
			case 9:
				exercicio.exercicio_09();
				break;
			case 10:
				exercicio.exercicio_10();
				break;
		}	
		myObj.close();
	}
}
