import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem 
	* "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos 
	* entre si. Atenção: os números devem poder ser digitados emordem crescente ou decrescente.*/
		
		Scanner sc = new Scanner (System.in);
		
		int A, B;
		
		System.out.println("Digite o primeiro valor: ");
		A = sc.nextInt();
		System.out.println("Digite o Segundo valor: ");
		B = sc.nextInt();
		
		if( A % B == 0 || B % A == 0) {
			
			System.out.println("São múltiplos");
			
		}
		else {
			
			System.out.println("Não são múltiplos");
			
		}
		
		
		sc.close();

	}

}
