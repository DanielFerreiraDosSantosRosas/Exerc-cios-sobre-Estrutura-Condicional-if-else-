import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a 
		 * quantidade deste item. Aseguir, calcule e mostre o valor da conta a pagar.*/

		Scanner sc = new Scanner (System.in);
		
		int codigo, quantidade;
		double total;
		
		System.out.println("Qual o Seu Produto ? ");
		codigo = sc.nextInt();
		System.out.println("Digite a Quantidade : ");
		quantidade = sc.nextInt();
		
		if( codigo == 1) {
			total = (quantidade * 4.00) ;
			System.out.printf(" O Valor da compra é  R$%.2f ", total);
		}
		else if (codigo == 2) {
			total = (quantidade * 4.50) ;
			System.out.printf(" O Valor da compra é  R$%.2f ", total);
		}
		else if (codigo == 3) {
			total = (quantidade * 5.00) ;
			System.out.printf(" O Valor da compra é  R$%.2f ", total);
		}
		else if (codigo == 4) {
			total = (quantidade * 2.00) ;
			System.out.printf(" O Valor da compra é  R$%.2f ", total);
		}
		else if (codigo == 5) {
			total = (quantidade * 1.50) ;
			System.out.printf(" O Valor da compra é  R$%.2f ", total);
		}
		else {
			
			System.out.println("Codigo Invalido");
		}
		
		
		
		
		sc.close();
	}

}
