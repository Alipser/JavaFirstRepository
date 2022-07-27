/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carrera;

import java.util.ArrayList;


public class Solutions {

    static double promedioDeTiempos = 0;
    static String NombreMenorTiempoMeta;
    static double menorTiempoMeta = Double.MAX_VALUE;
    static String NombreMayorTiempoMeta;
    static double meyorTiempoMeta = Double.MIN_VALUE;

    public static Object[] reporte(ArrayList<Corredor> carrera) {

        for (Corredor corredor : carrera) {
        promedioDeTiempos += corredor.getTiempoMeta();

            if (corredor.getTiempoMeta() < menorTiempoMeta) {
                NombreMenorTiempoMeta = corredor.getNombreCompleto();
                menorTiempoMeta = corredor.getTiempoMeta();
                System.out.println(NombreMenorTiempoMeta);}

                if (corredor.getTiempoMeta() > meyorTiempoMeta) {
                    NombreMayorTiempoMeta = corredor.getNombreCompleto();
                    meyorTiempoMeta = corredor.getTiempoMeta();
                }

            
        }
        promedioDeTiempos /= carrera.size();
        Object[] retorno = {promedioDeTiempos, NombreMenorTiempoMeta, menorTiempoMeta,
            NombreMayorTiempoMeta, meyorTiempoMeta};
        return retorno;
    }

}
