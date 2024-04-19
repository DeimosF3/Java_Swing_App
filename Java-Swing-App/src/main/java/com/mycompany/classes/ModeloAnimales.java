/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

import com.mycompany.classes.bbdd.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ModeloAnimales {

    public ArrayList<Animal> getAnimales() throws SQLException {
        Connection con = new Conexion().getconexion();
        ArrayList<Animal> listaAnimales = new ArrayList<>(); // Lista para almacenar los animales

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nombre, especie, peso, tipoLesion, gravedad, tratamiento, cazaFurtiva FROM aves");

            while (rs.next()) {
                // Obtener los valores reales de la consulta
                String nombre = rs.getString("nombre");
                String especie = rs.getString("especie");
                String peso = rs.getString("peso");
                String tipoLesion = rs.getString("tipoLesion");
                String gravedad = rs.getString("gravedad");
                String tratamiento = rs.getString("tratamiento");
                boolean cazaFurtiva = rs.getBoolean("cazaFurtiva");

                // Crear un nuevo objeto Animal con los valores obtenidos
                Animal a = new Animal(nombre, especie, peso, tipoLesion, gravedad, tratamiento, cazaFurtiva);
                listaAnimales.add(a);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaAnimales;
    }

}
