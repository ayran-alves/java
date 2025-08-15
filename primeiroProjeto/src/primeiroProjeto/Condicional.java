package primeiroProjeto;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int idade =17;
     
     if(idade >= 18) {
    	 System.out.println("Você é maior de idade");
     } else {
    	 System.out.println("você é menor de idade");
     }
     
     Scanner scanner = new Scanner(System.in);
     //verificação de desconto 
     System.out.println("quanto você pagou");
     double valor = scanner.nextDouble();
     if(valor >=200) {
    	 System.out.println("você ganhou o desconto");
     }else {
    	 System.out.println("Você não ganhou desconto");
   //--------------------------------------------------
    	 String continuar;
    	 System.out.println("deseja continuar");
    	 continuar = scanner.next();
    	 if(continuar == "sim") {
    		 System.out.println("voce escolheu continuar");
    	 } else {
    		 System.out.println("você escolheu sair"); 	
    		 
    		 double nota1, nota2;
    		 System.out.println("informe a nota 1:");
    		 nota1 = scanner.nextDouble();
    		 System.out.println("informe a nota 2: ");
    		 nota2 = scanner.nextDouble();
    		 double media = (nota1 + nota2 / 2);
    		 
    		 if(media <7) {
    			 System.out.println("reprovado");
    		 } else {
    			 System.out.println("aprovado");
    		 }
    	 }
}
	}

}
 