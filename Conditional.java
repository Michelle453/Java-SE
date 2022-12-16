
package cursoje;

public class Conditional {
    public static void main(String[] args)
    {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;
        if(isBluetoothEnabled)
        {
            fileSended++;
            System.out.println("Enviado");
        }else{
            System.out.println("Activa el Bluetooth");
        }
    }
}
