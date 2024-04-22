package com.mycompany.classes;


public class Ave extends Animal {
    private boolean cazaFurtiva; // Indicates if the bird is being hunted illegally

    /**
     * Constructor de ave
     *
     * @param nombre        El nombre de ave
     * @param especie      La especie de ave
     * @param peso          Peso de ave
     * @param tipoLesion    La lesion del ave
     * @param gravedad      La gravedad de la lesion
     * @param tratamiento   El tratamiento
     * @param cazaFurtiva   Si su herida ha sido ocasionada por caza
     */
    public Ave(String nombre, String especie, String peso, String tipoLesion, String gravedad, String tratamiento, boolean cazaFurtiva) {
        super(nombre, especie, peso, tipoLesion, gravedad, tratamiento);
        this.cazaFurtiva = cazaFurtiva;
    }

    /**
     * Obtiene el valor de cazaFurtiva del ave
     *
     * @return verdadero si la herida del ave es por caza furtiva
     */
    public boolean isCazaFurtiva() {
        return cazaFurtiva;
    }

    public void setCazaFurtiva(boolean cazaFurtiva) {
        this.cazaFurtiva = cazaFurtiva;
    }
}
