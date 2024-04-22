/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

import java.sql.SQLException;

/**
 *
 * @author Alumno
 */

/*
ORDEN: Fachada->Controlador->FachadaBBDD->AnimalDAO->conexion
*/
public class Fachada{
//    public void insertarFabricante(String nombre) throws Exception {
//        new Controlador().insertarFabricante(nombre);
//    }
    public void insertarAve(String nombre, String especie, String peso, String lesion, String gravedad, String tratamiento, boolean cazaFurtiva) throws Exception {
        new Controlador().insertarAve(nombre, especie, peso, lesion, gravedad, tratamiento, cazaFurtiva);
    }
    public void insertarMamifero(String nombre, String especie, String peso, String lesion, String gravedad, String tratamiento, boolean motivoAtropello) throws Exception {
        new Controlador().insertarMamifero(nombre, especie, peso, lesion, gravedad, tratamiento, motivoAtropello);
    }
    public void insertarReptil(String nombre, String especie, String peso, String lesion, String gravedad, String tratamiento, boolean tieneInfeccionBacteriana) throws Exception {
        new Controlador().insertarReptil(nombre, especie, peso, lesion, gravedad, tratamiento, tieneInfeccionBacteriana);
    }
    
    public void insertarTratamiento(String nombre, String tratamiento) throws SQLException{
        new Controlador().insertarTratamiento(nombre, tratamiento);
    }
    public void insertarFecha(String tipo, String nombre, String fecha_salida) throws SQLException {
        new Controlador().insertarFecha(tipo, nombre, fecha_salida);
    }
    public void insertarBaja(String tipo, String nombre, String fecha_fallecimiento, String certificado_fallecimiento) throws SQLException {
        new Controlador().insertarBaja(tipo, nombre, fecha_fallecimiento, certificado_fallecimiento);
    }
}
