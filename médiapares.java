import java.util.Scanner;
public class m�diapares {
public static void main(String[]args)
{	Scanner s = new Scanner(System.in);
	double par = 0;
	int contadorp = 0;
	int contadori = 0;
	int x;
	System.out.println("Quantos n�meros deseja digitar? ");
	x = s.nextInt();
	double impar = 0;
	double arrayvalores[];
	arrayvalores = new double[500000];{
	for(int i=1; i<=x;i++) {
	System.out.println("Digite o " +i+ "� valor ");
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
	System.out.println("a m�dia dos pares �: "+(par/contadorp));
	System.out.println("a m�dia dos �mpares �: "+(impar/contadori));
	}

}
}