package Beecrowd;
import java.util.Scanner;

public class Ex1015 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Entre com o x1: ");
		double x1 = input.nextDouble();
		System.out.print("Entre com o y2: ");
		double y1 = input.nextDouble();
		
		System.out.print("Entre com o x2: ");
		double x2 = input.nextDouble();
		System.out.print("Entre com o y2: ");
		double y2 = input.nextDouble();
		
		double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.printf("Distancia = %.4f", (distancia));
		
		input.close();
	}

}
