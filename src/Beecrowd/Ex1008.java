package Beecrowd;
import java.util.Scanner;

public class Ex1008 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o numero do funcionario: ");
		int numeroFuncionario = input.nextInt();
		System.out.print("Digite a quantidade de horas trabalhadas do funcionario: ");
		int horasTrabalhadas = input.nextInt();
		System.out.print("Digite quanto o funcionario recebe por hora trabalhada: ");
		double valorPorHora = input.nextDouble();
		
		double salario = horasTrabalhadas * valorPorHora;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f %n", (salario));
		input.close();
	}

}
