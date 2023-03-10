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
public class ex1 {
    public void ex1() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira um número inteiro");
        
        int x = sc.nextInt();
                
        if(x >= 0){
            System.out.println("É positivo");
        } else {
            System.out.println("É negativo");
        }
    }    
}
