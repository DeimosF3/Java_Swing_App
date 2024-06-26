package com.mycompany.classes;

public class Reptil extends Animal {
    private boolean tieneInfeccionBacteriana;

    public Reptil(String nombre, String especie, String peso, String tipoLesion, String gravedad, String tratamiento, boolean tieneInfeccionBacteriana) {
        super(nombre, especie, peso, tipoLesion, gravedad, tratamiento);
        this.tieneInfeccionBacteriana = tieneInfeccionBacteriana;
    }

    public boolean isTieneInfeccionBacteriana() {
        return tieneInfeccionBacteriana;
    }

    public void setTieneInfeccionBacteriana(boolean tieneInfeccionBacteriana) {
        this.tieneInfeccionBacteriana = tieneInfeccionBacteriana;
    }
}
