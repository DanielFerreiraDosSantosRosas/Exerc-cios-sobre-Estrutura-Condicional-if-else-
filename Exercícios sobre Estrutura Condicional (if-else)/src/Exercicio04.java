import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 
1 hora e máxima de 24 horas.*/
		
		Scanner sc = new Scanner (System.in);
		
		double HrInicial, HrFinal, DuracaoJogo;
		
		System.out.println("Digite a Hora Inicial do Jogo: ");
		HrInicial = sc.nextDouble();
		System.out.println("Digite a Hora Final do Jogo: ");
		HrFinal = sc.nextDouble();
		
		if(HrInicial >= HrFinal) {
			
			DuracaoJogo = (HrInicial - (HrFinal + 24))*-1;

		}
		else {
			
			DuracaoJogo = (HrInicial - HrFinal)*-1 ;
			
		}
		
		
		System.out.printf(" O Jogo Durou %.0f Horas ", DuracaoJogo);
		
		
		
		sc.close();
	}

}
