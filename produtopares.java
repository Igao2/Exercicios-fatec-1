import java.util.Scanner;;
public class produtopares {
	public static void main(String[]args) {
		int x;
		int i;
		int par = 1;
		int pares[];
		pares = new int[60];
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um valor de 1 a 10");
		x = s.nextInt();
		for(i=1;i<=x;i++) {
		pares[i]=i;
		 
		if(i%2==0) {
				par=par*pares[i];
				
			}
		
		
}    System.out.println("Produto dos pares é igual a " +par);
}
}


