package Exercicios;

import java.util.Scanner;

public class Condicionais {
	
	public Condicionais() {
		
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
}
