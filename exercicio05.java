// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
// seguir, calcule e mostre o valor da conta a pagar.

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Código do Produto: ");
		int codigo = sc.nextInt();
		double preco;
		
		
		if ( codigo >= 6 ) {
			System.out.println("Esse código não existe.");
		}
		else if ( codigo <= 0 ) {
			System.out.println("Esse código não existe.");
		}
		else {
			System.out.println("Quantidade: ");
			int quantidade = sc.nextInt();
			
			if (codigo == 1) {
				String produto1 = "Cachorro Quente";
				preco = 4.0;
				
				System.out.println("Você escolheu o produto " + produto1 + " cujo preço unitário é R$ " + preco);
				
				double valorFinal1 = quantidade*preco;
				System.out.printf("O valor a pagar considerando a quantidade escolhida de %d unidades é de %.2f", quantidade, valorFinal1);
			}
			if (codigo == 2) {
				String produto2 = "X-Salada";
				preco = 4.50;
				
				System.out.println("Você escolheu o produto " + produto2 + " cujo preço unitário é R$ " + preco);
				
				double valorFinal2 = quantidade*preco;
				System.out.printf("O valor a pagar considerando a quantidade escolhida de %d unidades é de %.2f", quantidade, valorFinal2);
			}
			if (codigo == 3) {
				String produto3 = "X-Bacon";
				preco = 5.0;
				
				System.out.println("Você escolheu o produto " + produto3 + " cujo preço unitário é R$ " + preco);
				
				double valorFinal3 = quantidade*preco;
				System.out.printf("O valor a pagar considerando a quantidade escolhida de %d unidades é de %.2f", quantidade, valorFinal3);
			}
			if (codigo == 4) {
				String produto4 = "Torrada Simples";
				preco = 2.0;
				
				System.out.println("Você escolheu o produto " + produto4 + " cujo preço unitário é R$ " + preco);
				
				double valorFinal4 = quantidade*preco;
				System.out.printf("O valor a pagar considerando a quantidade escolhida de %d unidades é de %.2f", quantidade, valorFinal4);
			}
			if (codigo == 5) {
				String produto5 = "Refrigerante";
				preco = 1.50;
				
				System.out.println("Você escolheu o produto " + produto5 + " cujo preço unitário é R$ " + preco);
				
				double valorFinal5 = quantidade*preco;
				System.out.printf("O valor a pagar considerando a quantidade escolhida de %d unidades é de %.2f", quantidade, valorFinal5);
			}
		}
	}

}
