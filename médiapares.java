import java.util.Scanner;
public class médiapares {
public static void main(String[]args)
{	Scanner s = new Scanner(System.in);
	double par = 0;
	int contadorp = 0;
	int contadori = 0;
	int x;
	System.out.println("Quantos números deseja digitar? ");
	x = s.nextInt();
	double impar = 0;
	double arrayvalores[];
	arrayvalores = new double[500000];{
	for(int i=1; i<=x;i++) {
	System.out.println("Digite o " +i+ "º valor ");
	arrayvalores[i] = s.nextInt();
	if(arrayvalores[i] % 2== 0){
		contadorp++;
		par+=arrayvalores[i];
		
		}
		
	if(arrayvalores[i] % 2!= 0) {
	contadori++;	
	impar+=arrayvalores[i];	
	}
	

	}
	System.out.println("a média dos pares é: "+(par/contadorp));
	System.out.println("a média dos ímpares é: "+(impar/contadori));
	}

}
}