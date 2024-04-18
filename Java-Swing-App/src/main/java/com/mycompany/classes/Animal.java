package com.mycompany.classes;


/**
 *
 * @author Paolo
 */
import java.util.Date;
public class Animal {
    private String nombre;
    private String especie;
    private double peso;
    private String tipoLesion;
    private String gravedad;
    private Date fechaLiberacion;
    private Date fechaFallecimiento;

    public Animal(String nombre, String especie, double peso, String tipoLesion, String gravedad) {
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.tipoLesion = tipoLesion;
        this.gravedad = gravedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void registrarTratamiento(String tratamiento) {
        // Implementar la lógica para registrar el tratamiento administrado al animal
    }

    public void registrarLiberacion(Date fecha) {
        fechaLiberacion = fecha;
    }

    public void registrarFallecimiento(Date fecha) {
        fechaFallecimiento = fecha;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Especie: " + especie + ", Peso: " + peso + ", Tipo de Lesión: " + tipoLesion
                + ", Gravedad: " + gravedad + ", Fecha de Liberación: " + fechaLiberacion + ", Fecha de Fallecimiento: " + fechaFallecimiento;
    }
}


