import java.util.Scanner;
public class maiormenor {
	
public static void main(String [] args) {	
	int maior = 0;
	int menor = 0;
	int x = 5;
	int i;
	int arrayvalores[];
	Scanner s = new Scanner(System.in);
	 arrayvalores = new int[x];
	 

	for(i=0; i<x; i++)
	{
		System.out.println("Digite o " + (i + 1) + "º valor : ");
		arrayvalores[i] = s.nextInt();
		maior = arrayvalores[i];
		menor = arrayvalores[i];
	}
	for(i = 0; i < x; i++)
	 {
		if (arrayvalores[i] > maior) {
		maior = arrayvalores[i];
		
		}
		if (arrayvalores[i] < menor) {
			menor = arrayvalores[i];
		}
		
		
	   }	
		System.out.printf("Maior = %d\n",maior);
		System.out.printf("Menor = %d\n",menor);
	   
	 }
	}

