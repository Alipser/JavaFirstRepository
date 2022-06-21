import java.util.Scanner;

public class CuotaPrestamo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Cuota de Prestamo");
        System.out.print("Ingrese el monto a prestar:  ");
        double monto =sc.nextDouble();
        System.out.print("Ingrese tasa de prestamo deseada:   ");
        double tasa= sc.nextDouble();
        double operation= monto*tasa;
        System.out.println(operation);
        sc.close();
        
       
    }
}
