package primeiroProjeto;

import java.util.Scanner;

public class Lista5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  scanner = new Scanner(System.in);
		
		
		//1
		System.out.println("qual a sua idade?");
		int idade;
		idade = scanner.nextInt();
		if( idade < 12){
		System.out.println("criança");
		} else if(idade <17){
		System.out.println("adolecente");
		} else if(idade < 59){
		System.out.println("adulto");
		} else if(idade > 60){
		System.out.println("idoso");
		}
		//2
		System.out.println("temperatura");
		int temp1;
		temp1 = scanner.nextInt();
		if(temp1 < 10) {
			System.out.println("Muito frio");
		} else if(temp1 < 20) {
			System.out.println("Frio");
		} else if(temp1 < 30) {
			System.out.println("Agradavel");
		} else if(temp1 > 30) {
			System.out.println("Muito Quente");
		}
		//3
		   System.out.println("qual é a nota?");
			int nota;
			nota = scanner.nextInt();
			if(nota >90) {
				System.out.println("A");
			}else if(nota > 80) {
				System.out.println("B");
			}else if(nota >70) {
				System.out.println("C");
			}else if(nota >60) {
				System.out.println("D");
			}else if (nota <60) {
				System.out.println("F");
			}
		//4
				System.out.println("qual é a senha?");
				String senha1;
				senha1 = scanner.next();
				System.out.println("informe uma senha");
				if(senha1.equalsIgnoreCase("admin")) {
				System.out.println("Acesso permitido");
			} else {
				System.out.println("Acesso Negado");
				
		//5  
				System.out.println("qual o primeiro nome");
				String nome1 = scanner.next(); 
				System.out.println("qual o segundo nome");
				String nome2 = scanner.next();
				if(nome1.equals( nome2)) {
					System.out.println("o nomes são iguais");
				} else {
					System.out.println("o nomes são diferentes");
					
	//6
					System.out.println("qual a cor favorita");
					String cor;
					cor = scanner.next();
					if(cor == "Azul") {
						System.out.println("Boa escolha ");
					}else if(cor.equalsIgnoreCase("vermelho") ) {
						System.out.println("cor vibrante");
					}else if(cor.equalsIgnoreCase("verde") ) {
						System.out.println("cor da natureza");
					} else {
						System.out.println("cor não cadastrada");
						
	//7 
						
		                System.out.println("Digite uma letra ");
						String letra;
						letra = scanner.next();
						if(letra.equals("a")) {
						System.out.println("É uma vogal ");
						} else if(letra.equals("e")) {
						System.out.println("É uma vogal ");
						} else if(letra.equals("i")) {
						System.out.println("É uma vogal ");
						} else if(letra.equals("o")) {
						System.out.println("É uma vogal ");
						} else if(letra.equals("u")) {
						System.out.println("É uma vogal ");
		                } else {
		                	System.out.println("Não é vogal");
		                }
					}
					
							}
				
				
			}
				
			}
			
		}
		
		
		
	


