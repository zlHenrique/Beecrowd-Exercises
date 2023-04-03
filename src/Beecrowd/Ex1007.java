package Beecrowd;
import java.util.Scanner;


public class Ex1007 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numA = input.nextInt();
		int numB = input.nextInt();
		int numC = input.nextInt();
		int numD = input.nextInt();
		
		int diferenca = (numA * numB) - (numC * numD);
		
		System.out.println(diferenca);
		
		
		input.close();
	}
	
	
}
