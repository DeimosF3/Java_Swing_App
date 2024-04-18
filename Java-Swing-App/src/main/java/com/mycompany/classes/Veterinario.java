package com.mycompany.classes;


/**
 *
 * @author Paolo
 */

public class Veterinario {
    private String nombre;
    private String especialidad;

    /**
     * Constructor de la clase Veterinario.
     * @param nombre El nombre del veterinario.
     * @param especialidad La especialidad del veterinario.
     */
    public Veterinario(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    /**
     * Método para obtener el nombre del veterinario.
     * @return El nombre del veterinario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener la especialidad del veterinario.
     * @return La especialidad del veterinario.
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Método para establecer la especialidad del veterinario.
     * @param especialidad La nueva especialidad del veterinario.
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Método para obtener una representación en forma de cadena del objeto Veterinario.
     * @return Representación en forma de cadena del objeto Veterinario.
     */
    @Override
    public String toString() {
        return "Veterinario: " + nombre + ", Especialidad: " + especialidad;
    }
}



