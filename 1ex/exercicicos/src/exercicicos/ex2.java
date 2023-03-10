/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicicos;

import java.util.Scanner;

public class ex2 {
    
    public static void ex(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira um número inteiro");
        
        int x = sc.nextInt();
        
        if(x % 2 == 0){
            System.out.println("É par");
        } else {
            System.out.println("É impar");
        }
        
    }
}
