package com.mycompany.classes;

import java.util.Date;

/**
 * La clase Animal representa un animal con diversos atributos como nombre, especie, peso, lesiones, etc.
 */
public class Animal {
    // Atributos
    private String nombre; // Nombre del animal
    private String especie; // Especie del animal
    private String tratamiento; // Tratamiento del animal
    private String peso; // Peso del animal
    private String tipoLesion; // Tipo de lesión que ha sufrido el animal
    private String gravedad; // Gravedad de la lesión
    private Date fechaLiberacion; // Fecha de liberación del animal
    private Date fechaFallecimiento; // Fecha de fallecimiento del animal
    private Date fechaEntrada; // Fecha de entrada del animal
    private String veterinarioSalida; // Veterinario encargado de la salida del animal
    private String certificadoFallecimiento; // Certificado de fallecimiento del animal

    // Constructor y getters y setters
    
    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getVeterinarioSalida() {
        return veterinarioSalida;
    }

    public void setVeterinarioSalida(String veterinarioSalida) {
        this.veterinarioSalida = veterinarioSalida;
    }

    public String getCertificadoFallecimiento() {
        return certificadoFallecimiento;
    }

    public void setCertificadoFallecimiento(String certificadoFallecimiento) {
        this.certificadoFallecimiento = certificadoFallecimiento;
    }

    public Animal(String nombre, String especie, String peso, String tipoLesion, String gravedad, String tratamiento ) {
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
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

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
}
