
package cursoje;



public class CicloFor {
    
    static boolean isTurnOnLight = false;
    public static void main(String[] args)
    {
        turnOnOffLight();
        for(int i=0;i<=9;i++)
        {
            printSOS();
        }
    }
     public static void printSOS()
    {
        System.out.println(". . . _ _ _ . . .");
    }
    public static boolean turnOnOffLight()
    {
        return isTurnOnLight = (isTurnOnLight)?false:true;
    }
}
