package com.mycompany.classes;

public class Mamifero extends Animal {
    private boolean motivoAtropello;

    /**
     * Constructor para la clase Mamifero.
     * @param nombre Nombre del mamífero.
     * @param especie Especie del mamífero.
     * @param peso Peso del mamífero.
     * @param tipoLesion Tipo de lesión del mamífero.
     * @param gravedad Gravedad de la lesión del mamífero.
     * @param tratamiento Tratamiento del mamífero.
     * @param motivoAtropello Indica si el mamífero ha sido atropellado.
     */
    public Mamifero(String nombre, String especie, String peso, String tipoLesion, String gravedad, String tratamiento, boolean motivoAtropello) {
        super(nombre, especie, peso, tipoLesion, gravedad, tratamiento);
        this.motivoAtropello = motivoAtropello;
    }

    /**
     * Obtiene el estado del motivo de atropello del mamífero.
     * @return true si el mamífero fue atropellado, false de lo contrario.
     */
    public boolean isMotivoAtropello() {
        return motivoAtropello;
    }

    /**
     * Establece el estado del motivo de atropello del mamífero.
     * @param motivoAtropello true si el mamífero fue atropellado, false de lo contrario.
     */
    public void setMotivoAtropello(boolean motivoAtropello) {
        this.motivoAtropello = motivoAtropello;
    }
}
