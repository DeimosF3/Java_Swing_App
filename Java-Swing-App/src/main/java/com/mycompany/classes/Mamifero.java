package com.mycompany.classes;

/**
 *
 * @author Paolo
 */

public class Mamifero extends Animal {
    private boolean motivoAtropello;

    public Mamifero(String nombre, String especie, double peso, String tipoLesion, String gravedad, boolean motivoAtropello) {
        super(nombre, especie, peso, tipoLesion, gravedad);
        this.motivoAtropello = motivoAtropello;
    }
}



