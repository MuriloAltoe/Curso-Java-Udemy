import java.util.Scanner;

public class ex6 {
    public void ex(){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i=1; i<=x; i++){
            if (x%i==0){
                System.out.println(i);
            }
        }
    }
}
