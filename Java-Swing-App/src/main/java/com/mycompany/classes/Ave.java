package com.mycompany.classes;

public class Ave extends Animal {
    private boolean cazaFurtiva;

    public Ave(String nombre, String especie, String peso, String tipoLesion, String gravedad, String tratamiento, boolean cazaFurtiva) {
        super(nombre, especie, peso, tipoLesion, gravedad, tratamiento, cazaFurtiva);
        this.cazaFurtiva = cazaFurtiva;
    }

    public boolean isCazaFurtiva() {
        return cazaFurtiva;
    }

    public void setCazaFurtiva(boolean cazaFurtiva) {
        this.cazaFurtiva = cazaFurtiva;
    }
}
