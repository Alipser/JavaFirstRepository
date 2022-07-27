/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turnovirtuall;

import java.util.Arrays;

/**
 *
 * @author Alipser
 */
public class TurnoVirtuall {
    int cantidadTurnosAtendidos = 1;
    int turnoEnAtencion = 0;
    String[] turnosPerdidos;
    String[] turnos;
    boolean estadoTurnoVirtual=true;

    public TurnoVirtuall (String[] cola) {
        turnos = cola;
        turnosPerdidos = new String[turnos.length];
                for (int x = 0; x < turnosPerdidos.length; x++){
                 turnosPerdidos[x]= " ";
                }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Pantallazo 1
        String[] cola = {"A0", "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "A11"};
        TurnoVirtuall turnoVirtual1 = new TurnoVirtuall(cola);
// Pantallazo 2
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.atenderProximoTurno();
// Pantallazo 3
        turnoVirtual1.agregarTurnoPerdido();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.agregarTurnoPerdido();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.agregarTurnoPerdido();
// Pantallazo 4
        turnoVirtual1.cambiarEstadoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.cambiarEstadoTurno();
        System.out.print("Turnos: ");
        System.out.println(Arrays.toString(turnoVirtual1.getTurnos()));
        System.out.print("Turnos Perdidos: ");
        System.out.println(Arrays.toString(turnoVirtual1.getTurnosPerdidos()));
        System.out.print("Estado del Turno Virtual: ");
        System.out.println(turnoVirtual1.isEstadoTurnoVirtual());
        System.out.print("Turno en Atención: ");
        System.out.println(turnoVirtual1.getTurnoEnAtencion());
        System.out.print("Cantidad de turnos atendidos:");
        System.out.println(turnoVirtual1.getCantidadTurnosAtendidos());

    }

    public void atenderProximoTurno() {
      
        if (estadoTurnoVirtual == true) {
            cantidadTurnosAtendidos = ++cantidadTurnosAtendidos;
            turnoEnAtencion = ++turnoEnAtencion;
            
        }
    }

    public void agregarTurnoPerdido() {
        for (int i = 0; i < turnosPerdidos.length; i++) {
            if (" ".equals(turnosPerdidos[i])) {
                turnosPerdidos[i] = turnos[turnoEnAtencion];
                break;
            }
        }
    }

    public void cambiarEstadoTurno() {
        if (estadoTurnoVirtual = true) {
            estadoTurnoVirtual = false;}
        else{
            estadoTurnoVirtual = true;
             }

        }

    public String[] getTurnos() {
        return turnos;
    }

    public String[] getTurnosPerdidos() {
        return turnosPerdidos;
    }

    public int getCantidadTurnosAtendidos() {
        return cantidadTurnosAtendidos;
    }

    public boolean isEstadoTurnoVirtual() {
        return estadoTurnoVirtual;
    }

    public int getTurnoEnAtencion() {
        return turnoEnAtencion;
    }

    public void setCantidadTurnosAtendidos(int cantidadTurnosAtendidos) {
        this.cantidadTurnosAtendidos = cantidadTurnosAtendidos;
    }

    public void setTurnoEnAtencion(int turnoEnAtencion) {
        this.turnoEnAtencion = turnoEnAtencion;
    }

    public void setTurnosPerdidos(String[] turnosPerdidos) {
        this.turnosPerdidos = turnosPerdidos;
    }

    public void setTurnos(String[] turnos) {
        this.turnos = turnos;
    }

    public void setEstadoTurnoVirtual(boolean estadoTurnoVirtual) {
        this.estadoTurnoVirtual = estadoTurnoVirtual;
    }

   
   
}


