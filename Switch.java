
package cursoje;

public class Switch {
    public static void main(String[] args)
    {
        String colorModeSelected = "Dark";
        
        switch(colorModeSelected)
        {
            case "Light":
                System.out.println(colorModeSelected);
                break;
            case "Dark":
                System.out.println(colorModeSelected);
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}
