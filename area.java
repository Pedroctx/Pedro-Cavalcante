package quadrados;

public class area {
	public static void main(String[]args){
		quadrado quadrado1 = new quadrado ();
		quadrado quadrado2 = new quadrado ();
		quadrado1.base=4;
		quadrado1.altura=5;
		quadrado1.calcularArea();
		System.out.println("A �rea do 1� quadrado � "+quadrado1.area);
		quadrado2.base=3;
		quadrado2.altura=8;
		quadrado2.calcularArea();
		System.out.println("A �rea do 2� quadrado � "+quadrado2.area);
	}

}
