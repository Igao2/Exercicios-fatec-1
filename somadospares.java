import java.util.Scanner;

public class somadospares {
public static void main(String[] args)
{	double total = 0;
	int x;
	double numero;
    Scanner s = new Scanner(System.in);
{
 for(x=0; x<6; x++) {
	 System.out.println("Digite o " +x+ " º número ");
	 numero = s.nextDouble();
     if ((numero % 2 == 0 )) {
	 total = total+numero;
 }
 
      }
 System.out.printf("A soma dos pares é = %.2f",total);
    }
 }
}
