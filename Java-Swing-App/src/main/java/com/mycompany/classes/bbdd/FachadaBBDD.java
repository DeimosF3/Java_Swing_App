/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes.bbdd;

import com.mycompany.classes.Ave;
import java.sql.SQLException;

/**
 *
 * @author Alumno
 */
public class FachadaBBDD {
//     public void insertarFabricante(Fabricante f) throws SQLException {
//        new FabricanteDAO().insertarFabricante(f);
//    }
    public void insertarAnimal(Ave a) throws SQLException {
        new AnimalDAO().insertarAnimal(a);
    }
}
