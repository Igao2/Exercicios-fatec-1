import java.util.Scanner;
public class sal�rio {
public static void main(String[]args){
double s;
double sn;
Scanner m = new Scanner(System.in);
System.out.println("Digite o valor do sal�rio: ");
s = m.nextDouble();
sn = s*1.25;
System.out.println("O novo sal�rio � de: "+sn+" R$ ");
}
}
