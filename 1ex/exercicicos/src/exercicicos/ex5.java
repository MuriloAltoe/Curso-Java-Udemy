/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicicos;

import java.util.Scanner;

public class ex5 {
    public static void ex5(){
        System.out.println("1- Cachorro Quente - R$4,00");
        System.out.println("2- X-salada - R$4,50");
        System.out.println("3- X-bacon - R$5,00");
        System.out.println("4- Torrada Simples - R$2,00");
        System.out.println("5- Água - R$1,50");

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual opção");
        var x = sc.nextInt();
        System.out.println("Quantos?");
        var y = sc.nextDouble();

            if (x == 1) {
                System.out.println("R$"+(4.00 * y));
            } else if (x == 2) {
                System.out.println("R$"+(4.50 * y));
            } else if (x == 3) {
                System.out.println("R$"+5.00 * y);
            } else if(x == 4) {
                System.out.println("R$"+2.00 * y);
            } else if(x == 5){
                System.out.println("R$"+1.50 * y);
            }

    }
}
