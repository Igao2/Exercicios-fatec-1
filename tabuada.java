import java.util.Scanner;
public class tabuada {
	
public static void main(String []args){
	int n;
	int tabuada = 0;
	Scanner s = new Scanner(System.in);
	System.out.println("Digite um número: ");
	n = s.nextInt();
		 for(int i = 1;i<=n;i++) {
			 tabuada = n*i;
			 System.out.println("A tabuada de "+ n + " * "+ i + " = " + tabuada); 
		 	}
	}
}
