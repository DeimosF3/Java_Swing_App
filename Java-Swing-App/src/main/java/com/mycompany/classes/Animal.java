package com.mycompany.classes;


/**
 *
 * @author Paolo
 */
import java.util.Date;
public class Animal {
    private String nombre;
    private String especie;
    private String tratamiento;
    private double peso;
    private String tipoLesion;
    private String gravedad;
    private Date fechaLiberacion;
    private Date fechaFallecimiento;

    public Animal(String nombre, String especie, double peso, String tipoLesion, String gravedad, String tratamiento) {
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.tipoLesion = tipoLesion;
        this.gravedad = gravedad;
        this.tratamiento = tratamiento;
    }


    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Especie: " + especie + ", Peso: " + peso + ", Tipo de Lesión: " + tipoLesion
                + ", Gravedad: " + gravedad + ", Fecha de Liberación: " + fechaLiberacion +
                ", Fecha de Fallecimiento: " + fechaFallecimiento + ", Tratamiento: " + tratamiento;
    }
    public String getNombre() {
        return nombre;
    }
    
    public String setNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipoLesion() {
        return tipoLesion;
    }

    public void setTipoLesion(String tipoLesion) {
        this.tipoLesion = tipoLesion;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    public Date getFechaLiberacion() {
        return fechaLiberacion;
    }

    public void setFechaLiberacion(Date fechaLiberacion) {
        this.fechaLiberacion = fechaLiberacion;
    }

    public Date getFechaFallecimiento() {
        return fechaFallecimiento;
    }

    public void setFechaFallecimiento(Date fechaFallecimiento) {
        this.fechaFallecimiento = fechaFallecimiento;
    }
    
    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento() {
        this.tratamiento = tratamiento;
    }
}


