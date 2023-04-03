package Beecrowd;
import java.util.Scanner;

public class Ex1013 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numA = input.nextInt();
		System.out.print("Digite outro numero: ");
		int numB = input.nextInt();
		System.out.print("Digite outro numero: ");
		int numC = input.nextInt();
		
		System.out.println();
		
		if (numA > numB && numA > numC) {
			System.out.println("O maior numero e: " + numA);
		} else if (numB > numA && numB > numC) {
			System.out.println("O maior numero e: " + numB);
		} else {
			System.out.println("O maior numero e: " + numC);
		}
		
		input.close();
	}

}
