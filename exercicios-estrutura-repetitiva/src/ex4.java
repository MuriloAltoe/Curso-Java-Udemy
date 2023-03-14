import java.util.Scanner;

public class ex4 {
    public void ex(){
        double x, y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos calculos?");

        int z = sc.nextInt();

       for (int i=0; i < z; i++){
           x = sc.nextInt();
           y = sc.nextInt();

           if (y != 0){
               double a = x/y;
               System.out.println(a);
           } else {
               System.out.println("Divisão impossível");
           }
       }
    }
}
