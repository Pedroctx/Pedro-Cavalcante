package triangulo;

public class areaTR {
	public static void main (String[]args){
		triangulo triangulo1 = new triangulo();
		triangulo retangulo1 = new triangulo();
		triangulo1.base=5;
		triangulo1.altura=6;
		triangulo1.calcularAreaT();
		System.out.println("A área do triangulo é "+triangulo1.triangulo);
		
		retangulo1.base=5;
		retangulo1.altura=6;
		retangulo1.calcularAreaR();
		System.out.println("A área do retangulo é "+retangulo1.retangulo);
		
	
	}
    
}
