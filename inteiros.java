import java.util.Scanner;
public class inteiros {
  public static void main (String [] args) {
	  
	  Scanner in= new Scanner (System.in);
	  
	  int n;
	  
	  System.out.println ("Digite um n�mero");
	  
	  n= in.nextInt();
	  
	  if(n<0){
		  System.out.println ("N�mero � negativo");  
	  }else{
		  System.out.println ("N�mero � Positivo");
	  }
	  
     
  }
}
