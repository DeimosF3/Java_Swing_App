package com.mycompany.classes;

import com.mycompany.classes.bbdd.*;
import java.sql.SQLException;

/**
 * 
 * 
 * @author Paolo y Rodri
 */
public class Controlador {
    
    /**
     * Inserta un nuevo ave en la base de datos.
     * @param nombre Nombre del ave.
     * @param especie Especie del ave.
     * @param peso Peso del ave.
     * @param tipoLesion Tipo de lesión del ave.
     * @param gravedad Gravedad de la lesión del ave.
     * @param tratamiento Tratamiento del ave.
     * @param cazaFurtiva Indica si el ave fue capturada en una actividad de caza furtiva.
     * @throws Exception Si ocurre un error durante la inserción del ave en la base de datos.
     */
    public void insertarAve(String nombre, String especie, String peso, String tipoLesion, String gravedad, String tratamiento, boolean cazaFurtiva) throws Exception {
        new FachadaBBDD().insertarAve(new Ave(nombre, especie, peso, tipoLesion, gravedad, tratamiento, cazaFurtiva));
    }
    
    /**
     * Inserta un nuevo tratamiento en la base de datos.
     * @param nombre Nombre del tratamiento.
     * @param tratamiento Descripción del tratamiento.
     * @throws SQLException Si ocurre un error durante la inserción del tratamiento en la base de datos.
     */
    public void insertarTratamiento(String nombre, String tratamiento) throws SQLException{
        new FachadaBBDD().insertarTratamiento(nombre, tratamiento);
    }
    
    /**
     * Inserta un nuevo reptil en la base de datos.
     * @param nombre Nombre del reptil.
     * @param especie Especie del reptil.
     * @param peso Peso del reptil.
     * @param lesion Lesión del reptil.
     * @param gravedad Gravedad de la lesión del reptil.
     * @param tratamiento Tratamiento del reptil.
     * @param tieneInfeccionBacteriana Indica si el reptil tiene una infección bacteriana.
     * @throws Exception Si ocurre un error durante la inserción del reptil en la base de datos.
     */
    public void insertarReptil(String nombre, String especie, String peso, String lesion, String gravedad, String tratamiento, boolean tieneInfeccionBacteriana) throws Exception {
        new FachadaBBDD().insertarReptil(new Reptil(nombre, especie, peso, lesion, gravedad, tratamiento, tieneInfeccionBacteriana));
    }
    
    /**
     * Inserta un nuevo mamífero en la base de datos.
     * @param nombre Nombre del mamífero.
     * @param especie Especie del mamífero.
     * @param peso Peso del mamífero.
     * @param lesion Lesión del mamífero.
     * @param gravedad Gravedad de la lesión del mamífero.
     * @param tratamiento Tratamiento del mamífero.
     * @param motivoAtropello Indica si el mamífero fue atropellado.
     * @throws Exception Si ocurre un error durante la inserción del mamífero en la base de datos.
     */
    public void insertarMamifero(String nombre, String especie, String peso, String lesion, String gravedad, String tratamiento, boolean motivoAtropello) throws Exception {
        new FachadaBBDD().insertarMamifero(new Mamifero(nombre, especie, peso, lesion, gravedad, tratamiento, motivoAtropello));
    }
    
    /**
     * Inserta una nueva fecha relacionada con un animal en la base de datos.
     * @param tipo Tipo de fecha (entrada o salida).
     * @param nombre Nombre del animal.
     * @param fecha_salida Fecha de salida o fallecimiento del animal.
     * @param veterinario_salida Veterinario encargado de la salida del animal.
     * @throws SQLException Si ocurre un error durante la inserción de la fecha en la base de datos.
     */
    public void insertarFecha(String tipo, String nombre, String fecha_salida, String veterinario_salida) throws SQLException {
        new FachadaBBDD().insertarfecha(tipo, nombre, fecha_salida, veterinario_salida);
    }
    
    /**
     * Inserta un nuevo registro de baja de un animal en la base de datos.
     * @param tipo Tipo de animal (ave, reptil, mamífero, etc.).
     * @param nombre Nombre del animal.
     * @param fecha_fallecimiento Fecha de fallecimiento del animal.
     * @param certificado_fallecimiento Certificado de fallecimiento del animal.
     * @throws SQLException Si ocurre un error durante la inserción del registro de baja en la base de datos.
     */
    public void insertarBaja(String tipo, String nombre, String fecha_fallecimiento, String certificado_fallecimiento) throws SQLException {
        new FachadaBBDD().insertarBaja(tipo, nombre, fecha_fallecimiento, certificado_fallecimiento);
    }
}
