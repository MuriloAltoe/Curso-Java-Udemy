import java.util.Scanner;

public class ex2 {
    public void ex(){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), a=0, b=0, c;

        for (int i = 1 ; i <= x; i++){
            c = sc.nextInt();

            if (c >=10 && c <=20){
                a++;
            } else {
                b++;
            }
        }

        System.out.println("In: "+a);
        System.out.println("Out: "+b);

    }
}
