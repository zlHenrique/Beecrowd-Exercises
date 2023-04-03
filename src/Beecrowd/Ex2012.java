package Beecrowd;
import java.util.Scanner;

public class Ex2012 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		double numA = input.nextDouble();
		System.out.print("Digite outo numero: ");
		double numB = input.nextDouble();
		System.out.print("Digite outo numero: ");
		double numC = input.nextDouble();
		
		System.out.println();
		
		//triangulo
		double triangulo = (numA * numC) / 2;
		System.out.printf("TRIANGULO = %.3f %n", (triangulo));
		
		//circulo 
		double circulo = 3.14159 * (numC*numC);
		System.out.printf("CIRCULO = %.3f %n", (circulo));
		
		//trapezio
		double trapezio = ((numA + numB) * numC) / 2;
		System.out.printf("TRAPEZIO = %.3f %n", (trapezio));
		
		//quadrado
		double quadrado = numB * numB;
		System.out.printf("QUADRADO = %.3f %n", (quadrado));

		//retangulo
		double retangulo = numA * numB;
		System.out.printf("RETANGULO = %.3f %n", (retangulo));

		
		input.close();
	}

}
