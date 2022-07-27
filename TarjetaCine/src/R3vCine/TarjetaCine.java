
package R3vCine;


public class TarjetaCine {

    String idTarjeta;
    String nombreCompleto;
    String email;
    String telefono;
    int edad;
    double porcentajeDescuento;

    public TarjetaCine(String idTarjeta, String nombreCompleto, String email,
            String telefono, int edad) {
        this.idTarjeta = idTarjeta;
        this.nombreCompleto=nombreCompleto;
        this.email=email;
        this.telefono=telefono;
        this.edad=edad;
        this.porcentajeDescuento=porcentajeDescuento;
        
        
    }

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
        return pago;
    }

    public String getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(String idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

}
