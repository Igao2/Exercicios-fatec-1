import java.util.Scanner;
public class areatriangulo {
public static void main(String[]args) {
Scanner s = new Scanner(System.in);	
double b;
double h;
System.out.println("Digite o valor da base: ");
b = s.nextDouble();
System.out.println("Digite o valor da altura do tri�ngulo: ");
h = s.nextDouble();
double a = b*h/2;
System.out.println(" A �rea do tri�ngulo � : "+a);
}
}
