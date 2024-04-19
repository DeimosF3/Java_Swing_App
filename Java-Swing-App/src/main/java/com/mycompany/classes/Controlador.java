/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

import com.mycompany.classes.bbdd.*;

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
}
