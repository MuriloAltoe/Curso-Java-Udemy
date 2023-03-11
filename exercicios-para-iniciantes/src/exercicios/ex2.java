package exercicios;

import java.util.Scanner;

public class ex2 {
    public void ex(){

        Scanner sc = new Scanner(System.in);

        int x = 1, y = 1;

        while(x != 0 && y != 0){

            System.out.println("Digite o primeiro num");
            x = sc.nextInt();
//            System.out.println(x);

            System.out.println("Digite o segundo num");
            y = sc.nextInt();
//            System.out.println(y);

            if (x >=0){
                if (y >=0){
                    System.out.println("Primeiro quadrante");
                } else {
                    System.out.println("Quarto quadrante");
                }
            } else {
                if (y >=0){
                    System.out.println("Segundo quadrante");
                } else {
                    System.out.println("Terceiro quadrante");
                }
            }

        }
    }
}
