package exercicios071016;

import java.util.Scanner;

public class Treino {

	public Treino() {
		exercicio1();
	}
	
	private void exercicio1() {
		int num1 =  (new Scanner(System.in)).nextInt();
		int num2 =  (new Scanner(System.in)).nextInt();
		
		if (num1 > num2) {
			System.out.println("o numero 1 é o maior");
		}
		else System.out.println("o numero 2 é o maior");
	}
}
	
	private void exercicio2() {
		int num1 =  (new Scanner(System.in)).nextInt();
		int num2 =  (new Scanner(System.in)).nextInt();
		int num3 =  (new Scanner(System.in)).nextInt();
		
		if (num1 > num2 && num1 > num3) {
			
			System.out.println("o numero 1 é o maior");
		}
		else if (num2 > num1 && num2 > num3) {
			
			System.out.println("o numero 2 é o maior");
		}
		else 
		{
			System.out.println("o numero 3 é o maior");
		}
			
	}
	
	private void exercicio3() {
		
		int random = (new Random()).nextInt(5+1);
		Scanner aposta = new Scanner(System.in);
		int comparar;
		int tentativas = 5;
		boolean acertou = false;
		
		while(tentativas > 0 && acertou == false) {
			
				 System.out.println("Introduza um numero entre 1 e 5");
				comparar = aposta.nextInt();
				 if(random == comparar && random >= 1 && random <=5)
				 {
				 			System.out.println("Você acertou!!");
				 			acertou = true;
						 		
				 } 
				 else 
				 {
					 	--tentativas;
					 		System.out.println("Falhou " + tentativas + " tentativas restantes.");
				 }
			}
		}
	}
