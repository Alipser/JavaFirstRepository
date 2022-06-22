
public class CreditFeeArgs {
    
        public static void main(double[] args){
            if((args.length>=3)){
                System.out.println("Cuota de Prestamo");
                double monto=args[0];
                double tasa=args[1];
                double period=args[2];
                double cuota= monto*(Math.pow(1+tasa,period)*tasa)/(Math.pow(1+tasa,period)-1);
                System.out.println("el valor de la cuota es: " + cuota);
            }
            else{
                System.out.println("Faltan Parametros de entrada");
            }
           
            
        
        }
    
}

    

