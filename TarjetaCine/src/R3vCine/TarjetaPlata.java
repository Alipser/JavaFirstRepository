package R3vCine;

public class TarjetaPlata extends TarjetaCine {

    int cantidadVisitas;
    boolean elegibleOro;

    public TarjetaPlata(String idTarjeta, String nombreCompleto, String email, String telefono, int edad) {
        super(idTarjeta, nombreCompleto, email, telefono, edad);
        this.porcentajeDescuento = 10;
        cantidadVisitas = 0;
        elegibleOro = false;
        this.idTarjeta = idTarjeta;
        this.nombreCompleto=nombreCompleto;
        this.email=email;
        this.telefono=telefono;
        this.edad=edad;
        

    }

    @Override
    public double pagar(String[] cuenta) {
        double total = 0;
        
        for (int i = 0; i < cuenta.length; i++) {
            if (cuenta[i] == "Boleta") {
                total += 6000;
            } else if (cuenta[i] == "Combo 1 - Crispetas + Gaseosa") {
                total = total + 8000;
            } else {
                total = total + 12000;
            }
        }
        double pago = total * (1 - porcentajeDescuento / 100);
        cantidadVisitas++;
        if (cantidadVisitas == 5) {
            elegibleOro = true;
        }
        return pago;
    }

    public int getCantidadVisitas() {
        return cantidadVisitas;
    }

    public void setCantidadVisitas(int cantidadVisitias) {
        this.cantidadVisitas = cantidadVisitias;
    }

    public boolean isElegibleOro() {
        return elegibleOro;
    }

    public void setElegibleOro(boolean elegibleOro) {
        this.elegibleOro = elegibleOro;
    }

    

    

   
}
