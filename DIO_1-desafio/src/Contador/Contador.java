package Contador;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		var numero1 = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		var numero2 = scanner.nextInt();
		
		try {
			contar(numero1, numero2);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");

		}

        scanner.close();
		
	}
	public static void contar(int numero1, int numero2 ) throws ParametrosInvalidosException {
		if (numero1 > numero2){
			throw new ParametrosInvalidosException();
		}
		var contagem = numero2 - numero1;
		for(var i=1; i<=contagem; i++){
			System.out.println("Imprimindo o número "+i);
		}

	}


    
}