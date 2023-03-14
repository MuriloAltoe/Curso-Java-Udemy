import java.util.Scanner;

public class ex3 {
    public void ex(){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        double a, b, c, d;

        for (int i = 0 ; i < x; i++) {

            System.out.println("Digite a 1° nota:");
            b = sc.nextInt();
            System.out.println("Digite a 2° nota:");
            c = sc.nextInt();
            System.out.println("Digite a 3° nota:");
            d = sc.nextInt();

            a = (((b * 2) + (c * 3) + (d * 5)) / 10);

            System.out.println("Média: " + a);
        }
    }
}
