/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Carrera;
import static Carrera.Solutions.reporte;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Alipser
 */
public class Carrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Nombre del Corredor");
        
        
        ArrayList<Corredor> carrera = new ArrayList<>();
        carrera.add(new Corredor("Juan Diez", "87", 1.63, 20, 40.0));
        carrera.add(new Corredor("Mateo Doe", "64", 1.8, 27, 45.0));
        carrera.add(new Corredor("Fernando Doe", "52", 1.68, 39, 35.0));
        carrera.add(new Corredor("Sebastian Doe", "13", 1.81, 22, 41.0));
        carrera.add(new Corredor("Gladis Caro", "56", 1.58, 42, 33.0));
        carrera.add(new Corredor("Agustin Doe", "16", 1.75, 26, 43.0));
        carrera.add(new Corredor("Sergio Doe", "26", 1.65, 23, 41.0));
        carrera.add(new Corredor("Carla Giraldo", "47", 1.59, 24, 44.0));
        carrera.add(new Corredor("Luz Diana", "75", 1.64, 31, 45.0));
        carrera.add(new Corredor("John Doe", "81", 1.79, 29, 46.0));
        carrera.add(new Corredor("Mateo Fernandez", "104", 1.8, 24, 44.0));
        Object retorno[] = reporte(carrera);
        System.out.println(carrera.size());
        System.out.println(Arrays.toString(retorno));
    }
}
    
