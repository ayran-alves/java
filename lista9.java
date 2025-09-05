package primeiroProjeto;

import java.util.Scanner;

public class lista9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// 1
		int num1 = 1;
		while (num1 <= 10) {
			System.out.println(num1);
			num1++;
		}
		// 2
		int num2 = 10;
		while (num2 >= 1) {
			System.out.println(num2);
			num2--;

			// 3
			int n = 0;
			while (n <= 100) {
				System.out.println(n);
				n += 5;

	       // 4
				int contador = 0;
		        while (contador < 5) {
		            System.out.println("Eu gosto de Java");
		            contador++;
		            
			
		  //5
		            int contador1 = 0;
		            int soma = 0;

		            while (contador1 < 5) {
		                System.out.print("Digite um número inteiro: ");
		                int numero = scanner.nextInt();
		                soma += numero;
		                contador1++;
		                
		 //6
		                int senhaCorreta = 1234;
		                int senhaDigitada = 0;

		                while (senhaDigitada != senhaCorreta) {
		                    System.out.print("Digite a senha: ");
		                    senhaDigitada = scanner.nextInt();
		                    if (senhaDigitada != senhaCorreta) {
		                        System.out.println("Senha incorreta. Tente novamente.");
		                
         //7
		                        System.out.print("Digite um número inteiro positivo: ");
		                        int numero10 = scanner.nextInt();

		                        while (numero > 0) {
		                            System.out.println(numero);
		                            numero--;  

		                        System.out.println("Fim da contagem!");
		                    
		                }  
		            
		          
		            
			               }
		               }
		            }
		        }

			}
		}
	}
}

