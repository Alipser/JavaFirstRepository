/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package admisiones;

/**
 *
 * @author Alipser
 */
public class Alumno {
    private int age;
    private String nombreNiño;

    public Alumno(int age, String nombreNiño) {
        this.age = age;
        this.nombreNiño = nombreNiño;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNombreNiño() {
        return nombreNiño;
    }

    public void setNombreNiño(String nombreNiño) {
        this.nombreNiño = nombreNiño;
    }

    
    
    
}
