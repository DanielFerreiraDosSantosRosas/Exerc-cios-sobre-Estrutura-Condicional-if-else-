import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto*/
		Scanner sc = new Scanner(System.in);
		
		double X, Y;
		
		System.out.println("Digite O  Valor DE X:");
		X = sc.nextDouble();
		System.out.println("Digite O Valor De Y");
		Y = sc.nextDouble();
		
		if(X>0 && Y>0) {
			System.out.println("Q1");
		}
		else if(X<0 && Y>0) {
			System.out.println("Q2");
		}
		else if (X<0 && Y<0) {
			System.out.println("Q3");
		}
		else if (X>0 && Y<0) {
			System.out.println("Q4");
		}
		else {
			System.out.println("Origem");
		}
		
		
		
		
		
		
		sc.close();
	}

}
