package Beecrowd;
import java.util.Scanner;

public class Ex1006 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double numA = input.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double numB = input.nextDouble();
		System.out.print("Digite a terceira nota: ");
		double numC = input.nextDouble();
		
		if (numA > 10 || numB > 10 || numC > 10) {
			System.out.println("Cada nota apenas pode ir de 0 a 10, por favor digite uma nota neste intervalo!");
		} else {
			double media = ((numA * 2) + (numB * 3) + (numC * 5)) / 10;
			System.out.print("Media do aluno e: " + media);
		}
		
		
		input.close();
				
	}
}
