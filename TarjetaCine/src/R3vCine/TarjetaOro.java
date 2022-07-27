package R3vCine;

public class TarjetaOro extends TarjetaCine {

    String[] beneficiosDescripcion;
    boolean[] beneficiosEstado;

    public TarjetaOro(String idTarjeta, String nombreCompleto, String email, String telefono, int edad) {
        super(idTarjeta, nombreCompleto, email, telefono, edad);
        this.beneficiosDescripcion = new String[]{"Boleto Gratis", "Crispetas Gratis", "Gaseosa Gratis"};
        this.beneficiosEstado = new boolean[]{true, true, true};
        this.porcentajeDescuento = 20;
        this.idTarjeta = idTarjeta;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;

    }

    public boolean redimirBeneficio(int i) {
        this.beneficiosEstado[i] = this.beneficiosEstado[i] != true;
        return this.beneficiosEstado[i];
    }

    public String[] getBeneficiosDescripcion() {
        return this.beneficiosDescripcion;
    }

    public void setBeneficiosDescripcion(String[] beneficiosDescripcion) {
        this.beneficiosDescripcion = beneficiosDescripcion;
    }

    public boolean[] getBeneficiosEstado() {
        return this.beneficiosEstado;
    }

    public void setBeneficiosEstado(boolean[] beneficiosEstado) {
        this.beneficiosEstado = beneficiosEstado;
    }

}
