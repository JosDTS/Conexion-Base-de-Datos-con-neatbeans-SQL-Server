/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasql;

import java.util.Date;


/**
 * Clase Persona.
 * Representa a una persona con propiedades como cédula, nombre, apellidos y fecha de nacimiento.
 * @author Jocelyn
 */

public class Persona {
 
    int cedula; 
    String nombre; 
    String apellido_1; 
    String apellido_2; 
    Date fecha_Nacimiento;
    
        /**
     * Constructor de la clase Persona.
     * 
     * @param cedula          Número de cédula de la persona.
     * @param nombre          Nombre de la persona.
     * @param apellido_1      Primer apellido de la persona.
     * @param apellido_2      Segundo apellido de la persona.
     * @param fecha_Nacimiento Fecha de nacimiento de la persona.
     */

    public Persona(int cedula, String nombre, String apellido_1, String apellido_2, Date fecha_Nacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido_1 = apellido_1;
        this.apellido_2 = apellido_2;
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    public Persona() {
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_1() {
        return apellido_1;
    }

    public void setApellido_1(String apellido_1) {
        this.apellido_1 = apellido_1;
    }

    public String getApellido_2() {
        return apellido_2;
    }

    public void setApellido_2(String apellido_2) {
        this.apellido_2 = apellido_2;
    }

    public Date getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido_1=" + apellido_1 + ", apellido_2=" + apellido_2 + ", fecha_Nacimiento=" + fecha_Nacimiento + '}';
    }
    
    
    
    
}
