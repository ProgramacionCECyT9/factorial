/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorial;


 import java.util.Scanner; 

public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner s =new Scanner(System.in); 
         int suma=1; 
         System.out.println("Ingrese un numero"); 
         int n=s.nextInt(); 

         for(int i=n;i>1;i--){ 
         suma=suma*i; 
         } 
         System.out.println("El factorial de "+n+" es "+suma); 
         } 
    } 
