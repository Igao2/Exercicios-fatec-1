import java.util.Scanner;
public class salário {
public static void main(String[]args){
double s;
double sn;
Scanner m = new Scanner(System.in);
System.out.println("Digite o valor do salário: ");
s = m.nextDouble();
sn = s*1.25;
System.out.println("O novo salário é de: "+sn+" R$ ");
}
}
