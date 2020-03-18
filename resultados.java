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
		System.out.println("O resultado da soma é:"+ usuario1.resultado);
		
		System.out.println("Digite o primeiro numero da subtração:");
		usuario1.numero1=in.nextDouble();
		System.out.println("Digite o segundo numero da subtração:");
		usuario1.numero2=in.nextDouble();
		usuario1.calcularSub();
		System.out.println("O resultado da subtração é:"+ usuario1.resultado);
		
		System.out.println("Digite o primeiro numero da divisão:");
		usuario1.numero1=in.nextDouble();
		System.out.println("Digite o segundo numero da divisão:");
		usuario1.numero2=in.nextDouble();
		usuario1.calcularDiv();
		System.out.println("O resultado da divisão é:"+ usuario1.resultado);
		
		System.out.println("Digite o primeiro numero da multiplicação:");
		usuario1.numero1=in.nextDouble();
		System.out.println("Digite o segundo numero da multiplicação:");
		usuario1.numero2=in.nextDouble();
		usuario1.calcularMult();
		System.out.println("O resultado da multiplicação é:"+ usuario1.resultado);
	}
	

}
