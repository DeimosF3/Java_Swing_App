package com.mycompany.classes;


/**
 *
 * @author Paolo
 */

public class Reptil extends Animal {
    private boolean tieneInfeccionBacteriana;

    public Reptil(String nombre, String especie, double peso, String tipoLesion, String gravedad, boolean tieneInfeccionBacteriana) {
        super(nombre, especie, peso, tipoLesion, gravedad);
        this.tieneInfeccionBacteriana = tieneInfeccionBacteriana;
    }
}


