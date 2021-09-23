import java.util.Scanner;
public class númeroprimo {
	public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int x; 
	int i;
	int r = 0;
	int arrayvalores[]=new int [100000];
	  System.out.println("Digite um número: ");
	 x = s.nextInt();
	 
	 for (i = 2; i <= x; i++) {
		 arrayvalores[i]=i;
		 if((x%i!=0)&&(i/1!=0)) {
		System.out.println(i);
		
		 }
		 if((i%i==0)&&(i%1==0)) {
		System.out.println(i+" é primo")	 ;
		 }
	 }
}
}