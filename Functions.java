
package cursoje;

public class Functions {
    public static void main(String[] args)
    {
        double circleRadius = 3;
        double area1 = circleArea(circleRadius);
        System.out.println("El área del cículo con radio: " + circleRadius + " es: " + area1);
        
        int a = 3;
        int b = 6;
        boolean op = true; //Is true for sum
        int result = operations(a,b,op);
        System.out.println("El resultado de la suma entre: " + a + " y " + b + " es: " + result);
        op = false; //Is false for subtract
        result = operations(a,b,op);
         System.out.println("El resultado de la resta entre: " + a + " y " + b + " es: " + result);

    }
    
    public static double circleArea(double radius)
    {
        return Math.PI * Math.pow(radius,2);
    }
    /**
     * Descipción: Función que realiza la suma o resta entre dos valores enteros
     * @param num1 Número uno
     * @param num2 Número dos
     * @param operation Operación que se va a realizar, true para suma y false para resta
     * @return Retorna el resultado de la operación realizada
     */
    public static int operations(int num1, int num2, boolean operation)
    {
        if(operation)
        {
            return num1+num2;
        }else
        {
            return num1-num2;
        }
    }
}
