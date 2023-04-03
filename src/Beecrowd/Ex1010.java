package Beecrowd;
import java.util.Scanner;

public class Ex1010 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o codigo do item: ");
		int codPeca1 = input.nextInt();
		System.out.print("Digite a quantidade do item: ");
		int qntPeca1 = input.nextInt();
		System.out.print("Digite o valor do item: ");
		double valorPeca1 = input.nextDouble();
		
		System.out.println();
		
		System.out.print("Digite o codigo do item: ");
		int codPeca2 = input.nextInt();
		System.out.print("Digite a quantidade do item: ");
		int qntPeca2 = input.nextInt();
		System.out.print("Digite o valor do item: ");
		double valorPeca2 = input.nextDouble();
		
		double total = (qntPeca1 * valorPeca1) + (qntPeca2 * valorPeca2);
		
		System.out.println();
		System.out.println();
		
		System.out.print("Codigo do item 1: " + codPeca1);
		System.out.printf(" | Valor a pagar do item 1: R$ %.2f %n", (qntPeca1 * valorPeca1));
		
		System.out.print("Codigo do item 2: " + codPeca2);
		System.out.printf(" | Valor a pagar do item 2: R$ %.2f %n", (qntPeca2 * valorPeca2));
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		System.out.printf("Valor a pagar: R$ %.2f", (total));
		
		input.close();
	}

}
