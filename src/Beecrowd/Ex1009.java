package Beecrowd;
import java.util.Scanner;

public class Ex1009 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o nome do vendedor: ");
		String nome = input.next();
		
		System.out.print("Informe o salario fixo do vendedor: ");
		double salarioFixo = input.nextDouble();
		
		System.out.print("Informe o valor das vendas que o vendedor efeutou: ");
		double vendas = input.nextDouble();
		
		double total = salarioFixo + (vendas * 0.15);
		
		System.out.println("Vendedor: " + nome);
		System.out.printf("Valor a receber: %.2f", (total));
		
		
		
		input.close();
	}

}
