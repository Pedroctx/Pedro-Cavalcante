package sinais;

import java.util.Scanner;

public class resultados {
	public static void main(String[]args){
		Scanner in = new Scanner (System.in);
		
		calculadora usuario1 = new calculadora();
		
		
		System.out.println("Digite o primeiro numero da soma:");
		usuario1.numero1=in.nextDouble();
		System.out.println("Digite o segundo numero da soma:");
		usuario1.numero2=in.nextDouble();
		usuario1.calcularSoma();
		System.out.println("O resultado da soma �:"+ usuario1.resultado);
		
		System.out.println("Digite o primeiro numero da subtra��o:");
		usuario1.numero1=in.nextDouble();
		System.out.println("Digite o segundo numero da subtra��o:");
		usuario1.numero2=in.nextDouble();
		usuario1.calcularSub();
		System.out.println("O resultado da subtra��o �:"+ usuario1.resultado);
		
		System.out.println("Digite o primeiro numero da divis�o:");
		usuario1.numero1=in.nextDouble();
		System.out.println("Digite o segundo numero da divis�o:");
		usuario1.numero2=in.nextDouble();
		usuario1.calcularDiv();
		System.out.println("O resultado da divis�o �:"+ usuario1.resultado);
		
		System.out.println("Digite o primeiro numero da multiplica��o:");
		usuario1.numero1=in.nextDouble();
		System.out.println("Digite o segundo numero da multiplica��o:");
		usuario1.numero2=in.nextDouble();
		usuario1.calcularMult();
		System.out.println("O resultado da multiplica��o �:"+ usuario1.resultado);
	}
	

}
