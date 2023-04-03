package Beecrowd;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1005 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double nota1, nota2;
		
		System.out.print("Entre com a primeira nota do aluno: ");
		nota1 = input.nextDouble();
		
		System.out.print("Entre com a segunda nota do aluno: ");
		nota2 = input.nextDouble();
		
		DecimalFormat formatter = new DecimalFormat("#0.00000");
		double media = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;
		
		System.out.print("MEDIA = ");
		System.out.print(formatter.format(media));
		
		input.close();
	}
}