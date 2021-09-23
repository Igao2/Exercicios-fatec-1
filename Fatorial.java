import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um número para ver seu fatorial: ");
        int x = sc.nextInt();
        int fat = 1 ;

        for (int i = 1; i <= x; i++) {
            fat *= i;
        }

        System.out.println("O fatorial de "+x+" é " +fat);
    }

}


