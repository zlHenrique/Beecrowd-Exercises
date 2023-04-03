package Beecrowd;

import java.util.Scanner;

public class Ex1011 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Entre com o raio: ");
		
		double raio = input.nextDouble();

		double volume = (double) (4.0 / 3 * 3.14159) * (raio * raio * raio);

		System.out.printf("VOLUME = %.3f", (volume));

		input.close();

	}
}
