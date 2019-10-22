/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collatz;

import java.util.Scanner;


public class Collatz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        
        do{
            System.out.print("Introduce un número: ");
            num = in.nextInt();
            
            if(num <= 1)
                System.out.println("Error. El número debe ser mayor que 1.");
        }while(num <= 1);
        
        System.out.print(num + " ");
        
        while(num > 1){
            if(num % 2 == 0)
                num = num / 2;
            else
                num = 3 * num + 1;
            
            System.out.print(num + " ");
        }
    }
    
}
