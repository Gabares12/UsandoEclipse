package teste;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello World!");
		
		String comprimento = "Bom dia, ";
		
		System.out.println(comprimento);
		
		System.out.println("====================");
		
		
		String nome;
		int idade;
		int escolha;
	
	
		System.out.println("digite seu nome");
		
		 nome = scanner.nextLine();
		 
		 System.out.println("digite sua idade");
		 
		 idade = scanner.nextInt();
		
		System.out.println(comprimento + " meu nome é " + nome + " e tenho " + idade + " anos" );
		
		scanner.nextLine();
		
		System.out.println("e agora eu vou correr ou caminhar?");
		System.out.println("Digite 1 ou 2");
		
		escolha = scanner.nextInt();
		
		if (escolha == 1) {
			System.out.println("eu " + nome + " estou correndo");
		
		}else if (escolha == 2) {
			System.out.println("eu " + nome + " estou caminhando");
		}
		
		
		
		
   }

}
