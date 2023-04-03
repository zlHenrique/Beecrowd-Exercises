package Beecrowd;

import java.util.Scanner;

public class Ex1016 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a distancia em km: ");
		int distanciaKm = input.nextInt();
		
		int carroY = distanciaKm * 2;
		
		System.out.println(carroY + " minutos");
		
		input.close();
	}
}
