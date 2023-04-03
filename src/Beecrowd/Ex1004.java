package Beecrowd;
import java.util.Scanner;

public class Ex1004 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numero1 = entrada.nextInt();
		
		System.out.print("Digite outro numero: ");
		int numero2 = entrada.nextInt();
		
		System.out.println("PROD = " + numero1 * numero2);
		
		entrada.close();
	}
}
