package com.mycompany.classes;

public class Mamifero extends Animal {
    private boolean motivoAtropello;

    public Mamifero(String nombre, String especie, String peso, String tipoLesion, String gravedad, String tratamiento, boolean motivoAtropello) {
        super( nombre, especie, peso, tipoLesion, gravedad, tratamiento);
        this.motivoAtropello = motivoAtropello;
    }

    public boolean isMotivoAtropello() {
        return motivoAtropello;
    }

    public void setMotivoAtropello(boolean motivoAtropello) {
        this.motivoAtropello = motivoAtropello;
    }
}
