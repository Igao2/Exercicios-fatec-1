import java.util.Scanner;
public class númerosprimosatén {
	public static void main(String args[]) {
	int x;
	Scanner s = new Scanner(System.in);
	System.out.println("Dê o valor do número, para serem exibidos todos os números primos até o número digitado: ");
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