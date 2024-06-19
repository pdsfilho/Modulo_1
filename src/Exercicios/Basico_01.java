package Exercicios;
import java.util.Scanner;

public class Basico_01 {
	
	public Basico_01() {
	
	}
	
	public void exercicio_01() {
		
		Scanner myObj = new Scanner(System.in);
		
		String usuario = myObj.nextLine();
		
		
		System.out.println("Olá " + usuario + "! bem-vindo ao nosso programa!");
		myObj.close();
		
	}
	public void exercicio_02() {
		double v1, v2, resultado;
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		v1 = myObj.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		v2 = myObj.nextDouble();
		
		resultado = v1+v2;
		System.out.println("Resultado: " + resultado);
		
		myObj.close();
	}
	
	public void exercicio_03() {
		//vm = distancia(em metros) / tempo(em segundos)
		Scanner myObj = new Scanner(System.in);
		
		double dm, t, vm;
		System.out.println("Programa para cálculo de velocidade média. \n");
		
		System.out.println("Digite a distância percorrida(em metros): \n");
		dm = myObj.nextDouble();
		
		System.out.println("Digite o tempo (em segundos): \n");
		t = myObj.nextDouble();
		
		vm = dm/t;
		System.out.println("Velocidade média: "+ vm + "m/s");
		myObj.close();
	}
	
	public void exercicio_04() {
		Scanner myObj = new Scanner(System.in);
		
		double salarioBruto, ht, vh;
		System.out.println("Programa para cálculo de salário bruto. \n");
		
		System.out.println("Digite a quantidade de horas trabalhadas: \n");
		ht = myObj.nextDouble();
		
		System.out.println("Digite o valor da hora: \n");
		vh = myObj.nextDouble();
		
		salarioBruto = ht * vh;
		
		System.out.println("O Salário bruto é de: \n" + "R$ "+ salarioBruto);
		myObj.close();
	}
	
	public void exercicio_05() {
		//(J) = C x i x T
		Scanner myObj = new Scanner(System.in);
		
		double valorEmprestimo, juros, taxaJurosMensal, valorParcelaMensal, valorTotal; 
		int numeroMeses;
		
		System.out.println("Programa para cálculo da parcela mensal de um empréstimo. \n");
		
		System.out.println("Digite o valor do empréstimo: \n");
		valorEmprestimo = myObj.nextDouble();
		
		System.out.println("Digite o valor da taxa de juros mensal: \n");
		taxaJurosMensal = myObj.nextDouble();
		
		System.out.println("Digite a quantidade de meses do contrato: ");
		numeroMeses = myObj.nextInt();
		
		juros = (valorEmprestimo * (taxaJurosMensal/100) * numeroMeses);
		
		valorTotal = valorEmprestimo + juros;
		
		valorParcelaMensal = valorTotal / numeroMeses;
		
		System.out.println("O valor da parcela mensal é: \n" + "R$ " + valorParcelaMensal);
		myObj.close();
	}
	public void exercicio_06() {
		double qtdLitrosMes, valorConta;
		final double taxa = 0.02;
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Programa para cálculo de conta de água: \n");
		System.out.println("Digite a quantidade de litros mensal: \n");
		
		qtdLitrosMes = myObj.nextDouble();
		
		valorConta = qtdLitrosMes * taxa;
		
		System.out.println("R$ " + valorConta);
		myObj.close();
	}
	public void exercicio_07() {
		
		double qtdPeso, valorFrete;
		final double taxa = 5.00;
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Programa para cálculo de frete: \n");
		System.out.println("Digite o peso da mercadoria: \n");
		
		qtdPeso = myObj.nextDouble();
		
		valorFrete = qtdPeso * taxa;
		
		System.out.println("R$ " + valorFrete);
		myObj.close();
	}
	
	public void exercicio_08() {
		double valorReal, valorDolar, cotacao;
		//Cotação Atual Dólar para Real: 0,183
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Programa para conversão real para dólar: \n");
		
		System.out.println("Digite o valor em real: \n");
		valorReal = myObj.nextDouble();
		
		System.out.println("Digite a cotação: \n");
		cotacao = myObj.nextDouble();
		
		valorDolar = valorReal * cotacao;
		
		System.out.println("$ " + valorDolar);
		myObj.close();
	}
	
	public void exercicio_09() {
		double altura, largura, area, litrosTotais;
		//Cada litro de tinta pinta 2m²
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Programa para cálculo de litros de tinta. \n");
		
		System.out.println("Digite o valor da altura(em metros): \n");
		altura = myObj.nextDouble();
		
		System.out.println("Digite valor da largura(em metros): \n");
		largura = myObj.nextDouble();
		
		area = altura * largura;
		litrosTotais = 2 * area;
		
		System.out.println(litrosTotais + " litros para pintar uma área de " + area + "m²");
		myObj.close();
	}
	
	public void exercicio_10() {
		//(Juros) = Capital x Taxa de Juros x Tempo
		Scanner myObj = new Scanner(System.in);
		
		double valorVista, juros, valorTotal, valorParcela; 
		final double taxaJurosSimples = 0.12;
		int numeroParcelas;
		
		System.out.println("Programa para cálculo da parcela mensal de uma compra. \n");
		
		System.out.println("Digite o valor à vista: \n");
		valorVista = myObj.nextDouble();
		
		System.out.println("Digite a quantidade de parcelas: ");
		numeroParcelas = myObj.nextInt();
		
		juros = (valorVista * taxaJurosSimples * numeroParcelas);
		valorTotal = valorVista + juros;
		
		valorParcela = valorTotal / numeroParcelas;
		
		
		System.out.println(" O valor dos juros é:  " + "R$ " + juros 
				+ "\n O valor da parcela mensal é: "+ "R$ " + valorParcela
				+ "\n O valor total é: R$ " + valorTotal);
		myObj.close();
	}
}
