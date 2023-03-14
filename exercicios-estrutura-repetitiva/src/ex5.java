import java.util.Scanner;

public class ex5 {
    public void ex(){
        int x, y=0;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();


        if (x!=0){
            y=x;
            for (int i=x; i>=2; i--){
                y = y * (i-1);
            }
            System.out.println(y);
        } else {
            System.out.println(1);
        }
    }
}
