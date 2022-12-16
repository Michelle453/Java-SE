
package cursoje;
//Variable = Espacio de memoria(RAM) al que se le puede asignar un contenido
public class Variables {
    public static void main(String[] args)
    {
        int speed;
        speed = 10;
        int salary = 1000;
        String employeeName = "Andres";
        System.out.println(employeeName);
        int bono = 200;
        salary+=bono;
        System.out.print("Salario más bono: ");
        System.out.println(salary);
        int pension = 50;
        salary-=pension;
        System.out.print("Salario menos pensión: ");
        System.out.println(salary);
        salary+=(30*2) - 45;
        employeeName+= " Rodríguez";
        System.out.println("El empleado: " + employeeName + " tuvo un salario total de: " + salary);
        
        //Data Types
        long num = 12348934L;
        float numDem = 12.34343F;
        
        var salary2 = 2000;
        var pension2 = salary*0.03;
        var totalSalary = salary2 - pension2;
        System.out.println("El empleado 2, tuvo un salario de: " + totalSalary);
        
        
    }
}
