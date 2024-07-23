package primeiro_pacote;

import java.util.Scanner;

import Exercicios.Basico_01;
import Exercicios.Basico_02;
import Exercicios.Condicionais;
import Exercicios.Repeticao;

public class Main {

	public static void main(String[] args) {		
		Basico_01 basico_01 = new Basico_01();
		
		Basico_02 basico_02 = new Basico_02();
		
		Condicionais condicionais = new Condicionais();
		
		Repeticao repeticao = new Repeticao();
		
		boolean opcao = true;
		
		do {
			System.out.println("\n Olá! Escolha o exercício desejado: "
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
					+ "\n -12 Cálculo de tipo de terreno. "
					+ "\n -13 Repetição de nomes. "
					+ "\n -14 Sorteiro de número. "
					+ "\n -15 Inserção de nomes numa lista."
					+ "\n -16 Cálculo de multa de velocidade "
					+ "\n -17 Cálculo de IMC."
					+ "\n -0 Sair. ");
					
			
			int exercicioEscolhido;
			Scanner scan = new Scanner(System.in);
			
			exercicioEscolhido = scan.nextInt();
			
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
					break;
				case 13:
					repeticao.imprimeNome();
					break;
				case 14:
					repeticao.adivinharNumero();
					break;
				case 15:
					repeticao.escolheNomes();
					break;
				case 16:
					condicionais.aplicaMulta();
					break;
				case 17:
					basico_02.calculoImc();
					break;
				
				default:
					System.out.println("Até Logo!");
					 opcao = false;
					 
			}
			//scan.close();
			scan.reset();
		}while(opcao == true);
	}
}
