
package cursoje;


public class Arrays {
    public static void main(String[] args)
    {
        String androidVersions[] = new String[16];
        String days[] = new String[6];
        
        String cities[][] = new String[4][2]; /*fila, columna*/
        
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";
        
        System.out.println(androidVersions[0]);
        
       cities[0][0] = "Colombia";
       cities[0][1] = "Medellín";
       
       System.out.println(cities[0][0]);
       System.out.println(cities[0][1]);
    }
}
