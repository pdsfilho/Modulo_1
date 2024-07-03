package Exercicios;

import java.util.Scanner;

public class Condicionais {
	
	enum tipoArea{
		POPULAR,
		MASTER,
		VIP
	}

	public Condicionais() {
		
	}
	public void exercicio_03() {
		
		
		double altura, largura, area;
		var nivel = tipoArea.POPULAR;
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Programa para cálculo de tipo de terreno. \n");
		
		System.out.println("Digite o valor da altura(em metros): \n");
		altura = myObj.nextDouble();
		
		System.out.println("Digite valor da largura(em metros): \n");
		largura = myObj.nextDouble();
		
		area = altura * largura;
		
		if (area < 100 && area > 0) {
			nivel= tipoArea.POPULAR;
		}
		else if (area >= 100 || area < 500) {
			nivel = tipoArea.MASTER;
		}
		else {
			nivel = tipoArea.VIP;
		}
		
		System.out.println("Tipo de área de terreno é: " + nivel);
		
		myObj.close();
	}
}
