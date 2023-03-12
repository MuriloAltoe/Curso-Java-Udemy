package exercicios;

import java.util.Scanner;

public class ex3 {

    public void ex(){

        int x=0, a=0,b=0,c=0;

        System.out.println("1. Alcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Disel");
        System.out.println("4. Sair");

        Scanner sc = new Scanner(System.in);

        while (x != 4){

            x = sc.nextInt();

            switch (x){
                case 1:
                    a++;
                    break;
                case 2:
                    b++;
                    break;
                case 3:
                    c++;
                    break;
                case 4:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Digite novamente");
                    break;
            }
        }

        System.out.println("Alcool " + a);
        System.out.println("Gasolina " + b);
        System.out.println("Disel " + c);


    }
}
