package SistemaDeBanco;

import java.util.Locale;
import java.util.Scanner;

public class SistemaBancario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double saldoInicial;
		int servico;
		
		System.out.print("INFORME SEU SALDO INICIAL: ");
		saldoInicial = sc.nextDouble();
		
		System.out.println("DIGITE DE ACORDO COM O SERVIÇO DESEJADO: ");
		System.out.println("1 - Depositar ");
		System.out.println("2 - Sacar ");
		System.out.println("3 - Consultar saldo ");
		servico = sc.nextInt();
		
		if (servico == 1) {
			saldoInicial = depositarDinheiro(saldoInicial, sc);
		}
		
		else if (servico == 2) {
			saldoInicial = sacarDinheiro(saldoInicial, sc);
		}
		
		else if (servico == 3) {
			consultarSaldo(saldoInicial);
		}
		
		else {
			System.out.println("SERVIÇO NÃO DISPONÍVEL!");
		}
		
		sc.close();
	}
	
	public static double depositarDinheiro(double saldoInicial, Scanner sc) { // Função para depósito
		
		double valorDeposito;
		
		System.out.println("QUANTO VOCÊ DESEJA DEPOSITAR? ");
		valorDeposito = sc.nextDouble();
		
		if (valorDeposito != 0) {
			saldoInicial = saldoInicial + valorDeposito;
			
			System.out.printf("AGORA VOCÊ TEM %.2f REAIS NA SUA CONTA%n", saldoInicial);
		}
		
		else {
			System.out.println("NÃO É POSSÍVEL DEPOSITAR ESSE VALOR!");
		}
		
		return saldoInicial;
	}
	
	public static double sacarDinheiro(double saldoInicial, Scanner sc) { // Função para saque
		
		double saque = 0;
		
		System.out.print("QUANTO VOCÊ DESEJA SACAR? ");
		saque = sc.nextDouble();
		
		if (saldoInicial < saque) {
			System.out.println("VALOR INSUFICIENTE PARA SAQUE!");
		}
		
		else if (saque == 0) {
			System.out.println("O VALOR PARA SAQUE NÃO PODE SER ZERO!");		}
		
		else {
			saque = saldoInicial - saque;
			
			System.out.printf("AGORA VOCÊ TEM %.2f REAIS NA SUA CONTA%n", saque);
		}

		return saque;
	}
	
	public static void consultarSaldo(double saldoInicial) { // Função para consulta de saldo
		
		System.out.printf("VOCÊ TEM %.2f REAIS NA SUA CONTA%n", saldoInicial);
	}
	
}
