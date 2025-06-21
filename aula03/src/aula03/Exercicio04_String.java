package aula03;
import java.util.Scanner;
public class Exercicio04_String {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira uma palavra: ");
		String palavra = input.nextLine();
		String resultado = palavra.toUpperCase();
		
		System.out.println(resultado);
	
		input.close();
	}

}
