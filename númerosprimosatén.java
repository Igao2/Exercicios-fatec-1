import java.util.Scanner;
public class n�merosprimosat�n {
	public static void main(String args[]) {
	int x;
	Scanner s = new Scanner(System.in);
	System.out.println("D� o valor do n�mero, para serem exibidos todos os n�meros primos at� o n�mero digitado: ");
	x = s.nextInt();
	
        for (int i = 1; i <= x; i++) {
            int contador = 0;
            for (int b = 1; b <= i; b++) {
                if (i % b == 0) ++contador;
            }
            if (contador == 2) {
                System.out.println(i);
            }
        }
    
}
}