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
public class ex3 {
    
    public static void ex3(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira um número inteiro");
        
        int x = sc.nextInt();
        
        System.out.println("Insira outro número inteiro");
        
        int y = sc.nextInt();
        
        int a, b;
        
        if (x > y) {
            a = x;
            b = y;
        } else {
            a = y;
            b = x;
        }
        
        if (a % b == 0){
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }
    }
}
