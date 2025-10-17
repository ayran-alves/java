package primeiroProjeto;

public class Lista20 {

	public class FuncoesSemParametro {

	    public static void main(String[] args) {
	        repetirSaudacao();
	        desenharRetangulo();
	        imprimirMultiplosDeCinco();
	        contagemCrescente();
	        mostrarMeses();
	        saudacaoPorDia(); 

	    }

	}

	//1	 
		public static void repetirSaudacao() {
		    for (int i = 0; i < 5; i++) {
		        System.out.println("Bom dia!");
		    }
		}
	public static void saudacaoPorDia() {
		// TODO Auto-generated method stub
		
	}
	public static void imprimirMultiplosDeCinco() {
			
			
		}
	public static void contagemCrescente() {
		
		
	}
	//2
		        
		        public static void desenharRetangulo() {
		            for (int i = 0; i < 3; i++) {
		                System.out.println("*****");
		            }
	//3	           	public static void imprimirMultiplosDeCinco() {
		            for (int i = 5; i <= 25; i += 5) {
		                System.out.println(i);
		            }
		            
	//4            public static void contagemCrescente() {
		            for (int i = 1; i <= 8; i++) {
		                System.out.println(i);
		            }
		            System.out.println("Pronto!");
		        }
	//5
		        public static void mostrarMeses() {
		            String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
		            for (String mes : meses) {
		                System.out.println(mes);
		                
		            }
	//6
		            public static void saudacaoPorDia(String dia) {
		                System.out.println("Tenha uma ótima " + dia + "!");
		            }
 
    //7 
		            
		            public static void verificarEstoque(int quantidade) {
		                if (quantidade >= 10) {
		                    System.out.println("Estoque suficiente");
		                } else if (quantidade >= 5) {
		                    System.out.println("Estoque baixo");
		                } else {
		                    System.out.println("Estoque crítico");
		                }
		            }

		        

    
	       
		    
		

	}


