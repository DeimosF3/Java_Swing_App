/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

import com.mycompany.classes.bbdd.*;
import java.sql.SQLException;

/**
 *
 * @author Alumno
 */
public class Controlador {
//    public void insertarFabricante(String nombre) throws Exception {
//            comprobar(nombre);
//            new FachadaBBDD().insertarFabricante(new Fabricante(nombre));
//        }
    public void insertarAve(String nombre, String especie, String peso, String tipoLesion, String gravedad, String tratamiento, boolean cazaFurtiva) throws Exception {
        new FachadaBBDD().insertarAve(new Ave (nombre, especie, peso, tipoLesion, gravedad, tratamiento, cazaFurtiva));
    }
    public void insertarTratamiento(String nombre, String tratamiento) throws SQLException{
        new FachadaBBDD().insertarTratamiento(nombre, tratamiento);
    }
    public void insertarReptil(String nombre, String especie, String peso, String lesion, String gravedad, String tratamiento, boolean tieneInfeccionBacteriana) throws Exception {
        new FachadaBBDD().insertarReptil(new Reptil(nombre, especie, peso, lesion, gravedad, tratamiento, tieneInfeccionBacteriana));
    }
    public void insertarMamifero(String nombre, String especie, String peso, String lesion, String gravedad, String tratamiento, boolean motivoAtropello) throws Exception {
        new FachadaBBDD().insertarMamifero(new Mamifero(nombre, especie, peso, lesion, gravedad, tratamiento, motivoAtropello));
    }
   public void insertarFecha(String tipo, String nombre, String fecha_salida, String veterinario_salida) throws SQLException {
       new FachadaBBDD().insertarfecha(tipo, nombre, fecha_salida, veterinario_salida);
   }
   public void insertarBaja(String tipo, String nombre, String fecha_fallecimiento, String certificado_fallecimiento) throws SQLException {
       new FachadaBBDD().insertarBaja(tipo, nombre, fecha_fallecimiento, certificado_fallecimiento);
   }
}
