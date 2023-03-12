import java.util.Scanner;

public class ex1 {
    public void ex(){

        int x = 0;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        for (int i =1; i <= x; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }

    }
}
