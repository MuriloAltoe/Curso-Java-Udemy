/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicicos;

import java.util.Scanner;

/**
 *
 * @author murilo
 */
public class Exercicicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira um número inteiro");
        
        int x = sc.nextInt();
                
        if(x >= 0){
            System.out.println("É positivo");
        } else {
            System.out.println("É negativo");
        }
    }
    
    public static void ex2(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira um número inteiro");
        
        int x = sc.nextInt();
        
        if(x % 2 == 0){
            System.out.println("É par");
        } else {
            System.out.println("É impar");
        }
        
    }
    
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
      public static void ex4(){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira a primeira hora");
        
        int x = sc.nextInt();
        
        System.out.println("Insira a hora final");
        
        int y = sc.nextInt();
    
        int counter = 0;
                
        while(x != y){
            counter++;
            x++;
            if(x==12){
                x=0;
            }
        }
        
        if(x == y) {
            System.out.println("o jogo durou " + counter + " horas");
        }
    
    }
        
    
}
