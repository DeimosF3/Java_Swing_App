/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes.bbdd;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author Alumno
 */
public class AnimalDAO {    
    
    public void insertarAnimal(String tipo, String nombre, String especie, String peso, String lesion, String gravedad, boolean cazaFurtiva) throws Exception {
       new conexion().getconexion().createStatement().executeUpdate("INSERT INTO animales (tipo, nombre, especie, peso, tipo_lesion, gravedad, motivo_lesion) "
                + "VALUES ('" + tipo + "', '" + nombre + "', '" + especie + "', " + peso + ", '" + lesion + "', '" + gravedad + "', '" + cazaFurtiva + "')");

    }
}