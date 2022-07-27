package R3vCine;
import java.util.Arrays;
public class R3vCine {

    public static void main(String[] args) {
        String id = "0123";
        String nombre = "John Doe";
        String email = "jd32@correo.co";
        String tel = "5553221";
        int edad = 26;
        
        TarjetaPlata tp1 = new TarjetaPlata(id, nombre,
                email, tel, edad );
        System.out.println("John pagó:");
        System.out.println(tp1.pagar(new String[]{
            "Boleta",
            "Boleta",
            "Combo 1 - Crispetas + Gaseosa",
            "Combo 2 - Perro + Gaseosa"
        }));
        System.out.println(tp1.pagar(new String[]{"Boleta"}));
        System.out.println(tp1.pagar(new String[]{"Boleta"}));
        System.out.println(tp1.pagar(new String[]{"Boleta"}));
        System.out.println(tp1.pagar(new String[]{"Boleta"}));
        System.out.println("ID de la tarjeta:");
        System.out.println(tp1.getIdTarjeta());
        System.out.println("Nombre del cliente:");
        System.out.println(tp1.getNombreCompleto());
        System.out.println("Email del cliente:");
        System.out.println(tp1.getEmail());
        System.out.println("Teléfono del cliente:");
        System.out.println(tp1.getTelefono());
        System.out.println("Edad del cliente:");
        System.out.println(tp1.getEdad());
        System.out.println("Porcentaje de descuento:");
        System.out.println(tp1.getPorcentajeDescuento());
        System.out.println("Cantidad de visitas:");
        System.out.println(tp1.getCantidadVisitas());
        System.out.println("¿El cliente es elegible parala tarjeta Oro ?");
        System.out.println(tp1.isElegibleOro());
        TarjetaOro to2 = new TarjetaOro(id, nombre,
                email, tel, edad);
        System.out.println("John pagó:");
        System.out.println(to2.pagar(new String[]{
            "Boleta",
            "Combo 1 - Crispetas + Gaseosa"
        }));
        System.out.println("¿Puede John redimir la boleta gratis?:");
        System.out.println(to2.redimirBeneficio(0));
        System.out.println("¿Puede John redimir las crispetas gratis?:");
        System.out.println(to2.redimirBeneficio(1));
        System.out.println("¿Puede John redimir la gaseosa gratis?:");
        System.out.println(to2.redimirBeneficio(2));
        System.out.println("¿Puede John redimir la otra gaseosa gratis?:");
        System.out.println(to2.redimirBeneficio(2));
        System.out.println("ID de la tarjeta:");
        System.out.println(to2.getIdTarjeta());
        System.out.println("Nombre del cliente:");
        System.out.println(to2.getNombreCompleto());
        System.out.println("Email del cliente:");
        System.out.println(to2.getEmail());
        System.out.println("Teléfono del cliente:");
        System.out.println(to2.getTelefono());
        System.out.println("Edad del cliente:");
        System.out.println(to2.getEdad());
        System.out.println("Porcentaje de descuento:");
        System.out.println(to2.getPorcentajeDescuento());
        System.out.println("Beneficios:");
        System.out.println(Arrays.toString(to2.getBeneficiosDescripcion()));
        System.out.println("Estado de los beneficios:");
        System.out.println(Arrays.toString(to2.getBeneficiosEstado()));
    }
}
