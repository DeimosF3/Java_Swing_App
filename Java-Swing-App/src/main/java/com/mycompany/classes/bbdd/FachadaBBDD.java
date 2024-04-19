/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes.bbdd;

/**
 *
 * @author Alumno
 */
public class FachadaBBDD {
//     public void insertarFabricante(Fabricante f) throws SQLException {
//        new FabricanteDAO().insertarFabricante(f);
//    }
    public void insertarAnimal(String nombre, String especie, String peso, String lesion, String gravedad, Boolean cazaFurtiva) throws Exception {
        new AnimalDAO().insertarAnimal(nombre, especie, peso, lesion, gravedad, cazaFurtiva);
    }
}
