package salarioaum;

public class salario {
	double salarioBruto, salarioLiquido,imposto, valorImposto;
	double salarioLiquido(){
		valorImposto = salarioBruto*(imposto/100);
		salarioLiquido= salarioBruto - valorImposto;
		return salarioLiquido;
	}
	double salarioAtualmente, aumento;
	double aumentarSalario(){
		salarioAtualmente= salarioLiquido + aumento;
		return salarioAtualmente;
	}

}
