package primeiro_pacote;

import java.util.Scanner;

import Exercicios.Basico_01;
import Exercicios.Condicionais;

public class Main {

	public static void main(String[] args) {		
		Basico_01 basico_01 = new Basico_01();
		
		Condicionais condicionais = new Condicionais();
		
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
				+ "\n -10 Cálculo de cada parcela em uma compra. "
				+ "\n -11 Semáforo. "
				+ "\n -12 Cálculo de tipo de terreno. ");
				
		
		int exercicioEscolhido = 12;
		Scanner myObj = new Scanner(System.in);
		
		exercicioEscolhido = myObj.nextInt();
		
		switch(exercicioEscolhido) {
			case 1:
				basico_01.exercicio_01();
				break;
			case 2:
				basico_01.exercicio_02();
				break;
			case 3:
				basico_01.exercicio_03();
				break;
			case 4:
				basico_01.exercicio_04();
				break;
			case 5:
				basico_01.exercicio_05();
				break;
			case 6:
				basico_01.exercicio_06();
				break;
			case 7:
				basico_01.exercicio_07();
				break;
			case 8:
				basico_01.exercicio_08();
				break;
			case 9:
				basico_01.exercicio_09();
				break;
			case 10:
				basico_01.exercicio_10();
				break;
			case 11:
				condicionais.exercicio_01();
				break;
			case 12:
				condicionais.exercicio_03();
		}	
		myObj.close();
	}
}
