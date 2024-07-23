package Exercicios;

import java.util.Scanner;

public class Condicionais {
	
	public Condicionais() {
		
	}
	
	public void exercicio_01() {
		
		enum semaforo{
			VERMELHO,
			AMARELO,
			VERDE
		}
		
		Scanner scan = new Scanner(System.in);

		var estado = semaforo.VERDE;
		int opcao = 3;
		
		System.out.println("Indique o estado do semáforo: "
				+ "\n 1- Vermelho"
				+ "\n 2- Amarelo"
				+ "\n 3- Verde");
		opcao = scan.nextInt();
		
		switch(opcao){
			case 1:
				estado = semaforo.VERMELHO;
				break;
				
			case 2:
				estado = semaforo.AMARELO;
				break;
			
			case 3:
				estado = semaforo.VERDE;
				break;
			
			default:
				System.out.println("Semáforo Inativo.");
		}
		System.out.println(estado);
		scan.close();
	}
	
	public void exercicio_03() {
		
		enum tipoArea{
			POPULAR,
			MASTER,
			VIP
		}
		
		double altura, largura, area;
		var nivel = tipoArea.POPULAR;
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Programa para cálculo de tipo de terreno. \n");
		
		System.out.println("Digite o valor da largura(em metros): \n");
		altura = myObj.nextDouble();
		
		System.out.println("Digite valor da comprimento(em metros): \n");
		largura = myObj.nextDouble();
		
		area = altura * largura;
		
		if (area < 100 && area > 0) {
			nivel= tipoArea.POPULAR;
		}
		else if (area >= 100 && area < 500) {
			nivel = tipoArea.MASTER;
		}
		else {
			nivel = tipoArea.VIP;
		}
		
		System.out.println("Tipo de área de terreno é: " + nivel);
		System.out.println("\n Área: " + area + "m²");
		
		myObj.close();
	}

	public void aplicaMulta() {
		int excedente;
		final int taxa = 5;
		final int velocidadeLimite = 80;
		
		System.out.println("Informe a velocidade do veículo: \n");
		Scanner scan = new Scanner(System.in);
		
		excedente = scan.nextInt();
		if(excedente > velocidadeLimite) {
			int multa = (excedente - velocidadeLimite) * taxa;
			System.out.printf("Multa de R$ %d" , multa);
		}
		else {
			System.out.println("Sem multa. \n");
		}

	}
}
