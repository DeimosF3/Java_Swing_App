package com.mycompany.classes;

/**
 *
 * @author Paolo
 */

public class Mamifero extends Animal {
    private boolean motivoAtropello;

    public Mamifero(String nombre, String especie, double peso, String tipoLesion, String gravedad, String tratamiento, boolean motivoAtropello) {
        super(nombre, especie, peso, tipoLesion, gravedad, tratamiento);
        this.motivoAtropello = motivoAtropello;
    }
    
    public void setCazaFurtiva(boolean motivoAtropello) {
        this.motivoAtropello = motivoAtropello;
    }
}



