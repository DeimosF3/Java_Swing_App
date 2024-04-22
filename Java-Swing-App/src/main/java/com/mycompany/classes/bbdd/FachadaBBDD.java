/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes.bbdd;

import com.mycompany.classes.*;
import java.sql.SQLException;

/**
 *
 * @author Alumno
 */
public class FachadaBBDD {
//     public void insertarFabricante(Fabricante f) throws SQLException {
//        new FabricanteDAO().insertarFabricante(f);
//    }
    public void insertarAve(Ave ave) throws SQLException {
        new AnimalDAO().insertarAve(ave);
    }
    public void insertarReptil(Reptil rep) throws SQLException {
        new AnimalDAO().insertarReptil(rep);
    }
    public void insertarTratamiento(String nombre, String tratamiento) throws SQLException{
        new AnimalDAO().insertarTratamiento(nombre, tratamiento);
    }
    public void insertarMamifero(Mamifero mam) throws SQLException {
        new AnimalDAO().insertarMamifero(mam);
    }
    public void insertarfecha(String tipo, String nombre, String fecha_salida, String veterinario_salida) throws SQLException {
        new AnimalDAO().insertarFecha(tipo, nombre, fecha_salida, veterinario_salida);
    }
    public void insertarBaja(String tipo, String nombre, String fecha_fallecimiento, String certificado_fallecimiento) throws SQLException {
        new AnimalDAO().insertarBaja(tipo, nombre, fecha_fallecimiento, certificado_fallecimiento);
    }
}
