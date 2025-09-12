package primeiroProjeto;

import java.util.Scanner;

public class lista10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // java.util
		
		
		
		
		
		// 1 - Contador: Mostre os números de 10 a 30 no console.
        System.out.println("Exercício 1 - Contador de 10 a 30:");
        int contador1 = 10;
        while (contador1 <= 30) {
            System.out.print(contador1 + " ");
            contador1++;
        }
        System.out.println("\n");

        // 2 - Soma de Números Digitados:
        System.out.println("Exercício 2 - Soma de 3 números:");
        int soma = 0;
        int i2 = 0;
        while (i2 < 3) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            soma += numero;
            i2++;
        }
        System.out.println("Soma total: " + soma + "\n");

        // 3 - Multiplicação de Números Digitados:
        System.out.println("Exercício 3 - Multiplicação de 5 números:");
        int produto = 1;
        int i3 = 0;
        while (i3 < 5) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            produto *= numero;
            i3++;
        }
        System.out.println("Produto total: " + produto + "\n");

        // 4 - Contar até o número informado:
        System.out.println("Exercício 4 - Contar até o número informado:");
        System.out.print("Digite um número inteiro: ");
        int limite = scanner.nextInt();
        int contador4 = 1;
        while (contador4 <= limite) {
            System.out.print(contador4 + "");
            contador4++;
        }
        System.out.println("\n");

        // 5 - Somar os números de 1 a 5:
        System.out.println("Exercício 5 - Soma de 1 a 5:");
        int soma5 = 0;
        int contador5 = 1;
        while (contador5 <= 5) {
            soma5 += contador5;
            contador5++;
        }
        System.out.println("Soma de 1 a 5: " + soma5 + "\n");

        // 6 - Tabuada *//
        System.out.println("Exercício 6 - Tabuada:");
        System.out.print("Digite um número para ver sua tabuada: ");
        int numeroTabuada = scanner.nextInt();
        int i6 = 1;
        while (i6 <= 10) {
            System.out.println(numeroTabuada + " x " + i6 + " = " + (numeroTabuada * i6));
            i6++;
        }

 
    }


	}


