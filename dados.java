package nomes;

import java.util.Scanner;

public class dados {
	public static void main(String[]args){
		Scanner in = new Scanner (System.in);
		
		pessoa nome1 = new pessoa();
		System.out.println("Digite o ano de nascimento:");
		nome1.anoNasci= in.nextInt();
		nome1.calcularIdade();
		//inserir nomes
		System.out.println("Digite o teu primeiro nombre:");
		nome1.nome= in.next();
		System.out.println("Digite o teu segundo nombre:");
		nome1.sobrenome= in.next();
		nome1.mostrarNomeCompleto();
		System.out.println("O teu nombre é:" + nome1.nomeC +" e sua idade é "+nome1.idade+ " años");
		
		
	
		
		
		
	}

}
