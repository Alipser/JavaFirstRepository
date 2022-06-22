import java.util.Scanner;

public class CuotaPrestamo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Cuota de Prestamo");
        System.out.print("Ingrese el monto a prestar:  ");
        double monto =sc.nextDouble();
        System.out.print("Ingrese tasa de prestamo deseada:   ");
        double tasa= sc.nextDouble()/100;
        System.out.print("Ingrese el numero de periodos a ser financiados:     ");
        int period=sc.nextInt();
        double cuota= monto*(Math.pow(1+tasa,period)*tasa)/(Math.pow(1+tasa,period)-1);
        System.out.println("el valor de la cuota es: " + cuota);
        sc.close();
        
       
    }
}
