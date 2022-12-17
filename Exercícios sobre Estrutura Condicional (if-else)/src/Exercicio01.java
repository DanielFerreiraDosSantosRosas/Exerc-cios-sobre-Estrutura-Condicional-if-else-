import java.util.Scanner;

public class Exercicio01 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fazer um programa para ler um número inteiro, e depois 
		 * dizer se este número é negativo ou não.*/
		
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if (numero > 0 ) {
			
			System.out.println("o número é POSITIVO! ");
			
		}
		else {
			System.out.println("o número é NEGATIVO! ");
		}
		
		sc.close();

	}

}
