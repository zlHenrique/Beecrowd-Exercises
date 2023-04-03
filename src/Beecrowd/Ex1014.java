package Beecrowd;
import java.util.Scanner;

public class Ex1014 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a distancia percorrida: ");
		int distancia = input.nextInt();
		
		System.out.print("Digite o total de combustivel gasto: ");
		double combustivel = input.nextDouble();
		
		double media = distancia / combustivel;
		
		System.out.printf("%.3f km/l", (media));
		
		
		input.close();
	}

}
