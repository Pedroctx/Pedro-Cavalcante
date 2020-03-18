package salarioaum;

import java.util.Scanner;

public class salario2 {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		salario calcularSalarioLiquido = new salario();
		System.out.println("Digite o salario bruto do Pedro");
		calcularSalarioLiquido.salarioBruto= in.nextDouble();
		System.out.println("Digite a porcentagem do valor do imposto");
		calcularSalarioLiquido.imposto = in.nextDouble();
		System.out.println("Salario de Pedro é:"+ calcularSalarioLiquido.salarioLiquido());
		
		System.out.println("Digite o aumento do salario de Pedro");
		calcularSalarioLiquido.aumento = in.nextDouble();
		System.out.println("O salario do Pèdro é:"+ calcularSalarioLiquido.aumentarSalario());
		
		
		salario calcularSalarioLiquido1 = new salario();
		System.out.println("Digite o salario bruto do Vagner");
		calcularSalarioLiquido1.salarioBruto= in.nextDouble();
		System.out.println("Digite a porcentagem do valor do imposto");
		calcularSalarioLiquido1.imposto = in.nextDouble();
		System.out.println("Salario de Vagner é:"+ calcularSalarioLiquido1.salarioLiquido());
		
		System.out.println("Digite o aumento do salario de Vagner");
		calcularSalarioLiquido1.aumento = in.nextDouble();
		System.out.println("O salario do Vagner é:"+ calcularSalarioLiquido1.aumentarSalario());
		
		
		
		
		
		
	}

}
