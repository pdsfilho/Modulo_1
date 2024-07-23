package Exercicios;
import java.util.Scanner;

public class Basico_02 {

	public Basico_02() {}
	
	public void calculoImc() {
		enum estadoPeso{
			ABAIXO,
			NORMAL,
			SOBREPESO,
			OBESIDADE_1,
			OBESIDADE_2,
			OBESIDADE_3			
		}
		
		double peso, altura;
		
		System.out.println("Programa para cálculo do Índice de Massa Corporal. \n");
		
		System.out.println("Informe o peso da pessoa: \n");
		
		Scanner scan = new Scanner(System.in);
		peso = scan.nextDouble();
		
		System.out.println("Informe a altura da pessoa em metros: \n");
		altura = scan.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("IMC: \n" + imc);
		
		if(imc < 18.5) {
			System.out.println("Classificação do peso: " + estadoPeso.ABAIXO);
		}
		
		else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("Classificação do peso: " + estadoPeso.NORMAL);
		}
		else if (imc >= 25 && imc <=29.9) {
			System.out.println("Classificação do peso: " + estadoPeso.SOBREPESO);
		}
		else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Classificação do peso: " + estadoPeso.OBESIDADE_1);
		}
		else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Classificação do peso: " + estadoPeso.OBESIDADE_2);
		}
		else if (imc >= 40) {
			System.out.println("Classificação do peso: " + estadoPeso.OBESIDADE_3);
		}

	}
}
