//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
// o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//situação.

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		
		if (x == 0 && y == 0) {
			System.out.printf("Origem (%.1f, %.1f)", x, y);
		}
		else if (x > 0 && y > 0) {
			System.out.printf("Q1 (%.1f, %.1f)", x, y);
		}
		else if (x < 0 && y > 0) {
			System.out.printf("Q2 (%.1f, %.1f)", x, y);
		}
		else if (x < 0 && y < 0) {
			System.out.printf("Q3 (%.1f, %.1f)", x, y);
		}
		else {
			System.out.printf("Q4 (%.1f, %.1f)", x, y);
		}
		
		sc.close();
	}

}
