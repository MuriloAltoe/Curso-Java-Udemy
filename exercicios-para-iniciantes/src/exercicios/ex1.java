package exercicios;

import java.util.Scanner;

public class ex1 {

    public void ex(){
        int x = 0;
        Scanner sc = new Scanner(System.in);

        while (x != 2002){
            System.out.println("digite a senha: ");

            x = sc.nextInt();

            if (x == 2002){
                System.out.println("Acesso Liberado");
            }
            else {
                System.out.println("Acesso Negado");
            }
        }
    }
}
