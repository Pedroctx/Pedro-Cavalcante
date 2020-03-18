import java.util.Scanner;
public class idade2020{
  public static void main (String [] args) {
	  
	  Scanner in= new Scanner (System.in);
	  
	  int an,aa,id;
	  
	  System.out.println ("Digite o ano de nascimento:");
	  an= in.nextInt();
	  System.out.println ("Digite o ano atual:");
	  aa= in.nextInt();
	  id=aa-an;
	  if( id<18 ){
		  System.out.println ("menor");  
	  }else{
		  System.out.println ("maior");
	  }
	  
     
  }
}