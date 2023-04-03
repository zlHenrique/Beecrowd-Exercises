package Beecrowd;
import java.util.Scanner;

public class Ex1017 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int tempoGasto = input.nextInt();
		int kmPorHora = input.nextInt();
		
		float media = (float) tempoGasto * kmPorHora / 12;
		
		System.out.printf("%.3f",(media));
		
		
		input.close();
	}

}
