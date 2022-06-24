
public class CreditFeeArgs {
    
        public static void main(String[] args){
            if((args.length>=3)){
                System.out.println("Cuota de Prestamo");
                double monto=Double.parseDouble(args[0]);
                double tasa=Double.parseDouble(args[1])/100;
                double period=Double.parseDouble(args[2]);
                double cuota= monto*(Math.pow(1+tasa,period)*tasa)/(Math.pow(1+tasa,period)-1);
                System.out.println("el valor de la cuota es: " + cuota);
            }
            else{
                System.out.println("Faltan Parametros de entrada");
            }
           
            
        
        }
    
}

    

