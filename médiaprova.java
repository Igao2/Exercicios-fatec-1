import java.util.Scanner;
public class médiaprova {
public static void main (String[]args){	
Scanner s = new Scanner(System.in);
double n1;
double n2;


System.out.println("Qual foi a primeira nota?: ");
n1 = s.nextDouble();
System.out.println("Qual foi a segunda nota?: ");
n2 = s.nextDouble();
double media = ((n1*2)+(n2*3)/(2+3));

if(media>=6) {
System.out.println("Aluno aprovado");	
}
if(media<6) {
System.out.println("Aluno reprovado");
}
}
}
