package primeiroProjeto;

import java.util.Scanner;

public class Lista13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1
		for (int i = 10; i <= 30; i++) {
		    System.out.println(i);
		}
	
//2
		Scanner scanner = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
		    System.out.print("Digite a idade " + i + ": ");
		    int idade = scanner.nextInt();
		    if (idade >= 18) {
		        System.out.println("Maior de idade");
		    } else {
		        System.out.println("Menor de idade");
		    }
		    
//3	eleição*//	
		    

		  
		    for (int eleicao = 1; i <= 5; eleicao++) {
		        System.out.print("Digite o voto " + "eleicao" + " (1-4 candidatos, 5 nulo, 6 branco): ");
		        int voto = scanner.nextInt();

		        switch (voto) {
		            case 1:
		                System.out.println("Votou no candidato 1");
		                break;
		            case 2:
		                System.out.println("Votou no candidato 2");
		                break;
		            case 3:
		                System.out.println("Votou no candidato 3");
		                break;
		            case 4:
		                System.out.println("Votou no candidato 4");
		                break;
		            case 5:
		                System.out.println("Voto nulo");
		                break;
		            case 6:
		                System.out.println("Voto em branco");
		                break;
		            default:
		                System.out.println("Código inválido");
		        }
		        
		        //4 
		        
		        System.out.print("Digite uma frase: ");
		        String frase = scanner.nextLine();

		        System.out.print("Digite um número: ");
		        int repeticoes = scanner.nextInt();

		        for (int fr = 1; fr <= repeticoes; fr++) {
		            System.out.println(frase);
		        }
		        
		        //5
		        
		        for (int seq = 50; seq >= 30; seq--) {
		            System.out.println(i);
		        }
		        
		        //6
		        for (int num = 1; num <= 50; num += 2) {
		            System.out.println(num);
		        }
		        
		        //7
		        
		        

		              for (int nt = 1; nt <= 5; nt++) {
		            System.out.print("informe  a nota " + nt + ": ");
		            double nota = scanner.nextDouble();
		            if (nota >= 6.0) {
		                System.out.println("Aprovado");
		            } else {
		                System.out.println("Reprovado");
		            }
		            //8
		            
		            for (int cat = 1; cat <= 5; cat++) {
		                System.out.print("Digite a idade da pessoa " + cat + ": ");
		                int idad1 = scanner.nextInt();

		                if (idad1 <= 12) {
		                    System.out.println("Criança");
		                } else if (idad1 <= 17) {
		                    System.out.println("Adolescente");
		                } else if (idad1 <= 59) {
		                    System.out.println("Adulto");
		                } else {
		                    System.out.println("Idoso");
		                }
		                
		                //9
		                
		                
		                for (int np = 1; np <= 7; np++) {
		                    System.out.print("Digite o número " + np + ": ");
		                    int numero = scanner.nextInt();

		                    if (numero > 0) {
		                        System.out.println("Positivo");
		                    } else if (numero < 0) {
		                        System.out.println("Negativo");
		                    } else {
		                        System.out.println("Zero");
		                    }
		                }
		            }
		        }




		    }

		}


	}

}
