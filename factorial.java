import java.util.Scanner; 

public class Factorial {

    public static void main(String[] args) 
    {
         Scanner s =new Scanner(System.in); 
         int suma=1;
         int error = 0; 
         int n = 0;
         System.out.println("Ingrese un numero"); 
         try
         {
         	n = s.nextInt();

         	if(n >= 17)
	         {
	        	System.out.println("Solo puede ser un numero menor a 17, escribe otro");
	        	n = s.nextInt();
	         }
	         else
	         {	         	
	         }

	         for(int i = n; i > 1; i--)
	         	{ 
		        	suma = suma * i; 
		        } 
		        
		        System.out.println("El factorial de "+n+" es "+suma); 

         	
	     } 
	     catch(Exception err)
	     {
	     	System.out.println("Se espera un numero y escribio otra cosa, little bitch chupapijas");
	     }
    }
} 
