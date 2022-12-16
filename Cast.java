
package cursoje;


public class Cast {
    
    public static void main(String[] args)
    {
        double monthlyDogs = 30.0/12.0;
        
        //estimación
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);
        
        //Exactitud
        int a = 30;
        int b = 12;
       
        System.out.println((double) a/b);
        
    }
}
