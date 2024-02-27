public class Main {
	
	public static int Somar(int a, int b){
		return a + b; //retorno inteiro;
	}
		
	public static void Imprimir(){ //sem retorno será void;
		System.out.println("Só imprime uma mensagem!"); 
	}

	public static void main(String[] args) {
		
		int x = 7;
		int y = 3;
		System.out.println(x + y);
		Imprimir();
		
		int z = Somar(x, y);
		
		z = Somar(2,3);
		System.out.println(z);
		Imprimir();
		z = Somar(1,0);
		System.out.println(z);
		Imprimir();
		z = Somar(2,1);
		System.out.println(z);
		Imprimir();
		z = Somar(0,3);
		System.out.println(z);
		Imprimir();		
	}
	
 //int z = Somar();

}
