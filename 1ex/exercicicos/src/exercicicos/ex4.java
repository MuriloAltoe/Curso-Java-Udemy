/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicicos;

import java.util.Scanner;

/**
 *
 * @author murilo
 */
public class ex4 {
    
    public static void ex4() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a primeira hora");

        int x = sc.nextInt();

        System.out.println("Insira a hora final");

        int y = sc.nextInt();

        int counter = 0;

        while (x != y) {
            counter++;
            x++;
            if (x == 12) {
                x = 0;
            }
        }

        if (x == y) {
            System.out.println("o jogo durou " + counter + " horas");
        }

    }
}
