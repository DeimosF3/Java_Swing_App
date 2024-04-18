package com.mycompany.classes;


/**
 *
 * @author Paolo
 */
 public class Ave extends Animal {
    private boolean motivoCaza;

    public Ave(String nombre, String especie, double peso, String tipoLesion, String gravedad, boolean motivoCaza) {
        super(nombre, especie, peso, tipoLesion, gravedad);
        this.motivoCaza = motivoCaza;
    }
}

