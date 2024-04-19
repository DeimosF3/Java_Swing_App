/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

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
    public void insertarAnimal(String nombre, String especie, String peso, String lesion, String gravedad, String tratamiento, boolean cazaFurtiva) throws Exception {
        new Controlador().insertarAnimal(nombre, especie, peso, lesion, gravedad, tratamiento, cazaFurtiva);
    }
}
