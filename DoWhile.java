
package cursoje;

import java.util.Scanner;


public class DoWhile {
    
    
    public static void main(String[] args)
    {
        int response = 0;
        do
        {
            System.out.println("Selecciona el número de la opción deseada: ");
            System.out.println("1. Películas");
            System.out.println("2. Series");
            System.out.println("3. Salir");
            
            Scanner sc = new Scanner((System.in));
            response = Integer.valueOf(sc.nextLine());
            
            switch(response)
            {
                case 1:
                    System.out.println("Películas");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                case 3: 
                    System.out.println("Hasta pronto");
                    break;
                default:
                    break;
            }
            
            
        }while(response!=3);
    }
}
