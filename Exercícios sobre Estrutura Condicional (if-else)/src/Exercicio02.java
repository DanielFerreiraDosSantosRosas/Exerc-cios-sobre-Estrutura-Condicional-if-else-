import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/
		
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if( numero % 2 == 0) {
			
			System.out.println("o número é PAR");
			
		}
		else {
			
			System.out.println("o número é IMPAR");
			
		}
		
		
		
		
		
		
		sc.close();
	}

}
