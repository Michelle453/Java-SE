
package cursoje;


public class MathematicOperation {
    public static void main(String[] args)
    {
        double x = 2.1;
        double y = 3;
        
        //Clase Math
        double pi = Math.PI;
        double euler = Math.E;
        
        double haciaAbajo = Math.floor(3.5);
        System.out.println("Hacia abajo: " + haciaAbajo);
        
        double haciaArriba = Math.ceil(3.9);
        System.out.println("Hacia arriba: " + haciaArriba);
        
        double potencia = 2;
        System.out.println("La potencia de: " + potencia + " a la 3 es: " + Math.pow(potencia, 3));
        
        System.out.println("El número mayor entre " + x + " y Y es: " + Math.max(x,y));
        
        double raiz = Math.sqrt(y);
        
        
    }
}
