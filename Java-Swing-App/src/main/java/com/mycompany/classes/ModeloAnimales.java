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

    public ArrayList<Ave> getNombresAves() throws SQLException {
        Connection con = new Conexion().getconexion();
        ArrayList<Ave> listaAves = new ArrayList<>(); // Lista para almacenar los animales

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM aves;");

            while (rs.next()) {
                // Obtener los valores reales de la consulta
                String nombre = rs.getString("nombre");
                String especie = rs.getString("especie");
                String peso = rs.getString("peso");
                String tipoLesion = rs.getString("tipo_lesion");
                String gravedad = rs.getString("gravedad");
                String tratamiento = rs.getString("tratamiento");
                boolean cazaFurtiva = rs.getBoolean("cazaFurtiva");

                // Crear un nuevo objeto Animal con los valores obtenidos
                Ave a = new Ave(nombre, especie, peso, tipoLesion, gravedad, tratamiento, cazaFurtiva);
                listaAves.add(a);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaAves;
    }

    public ArrayList<Mamifero> getNombresMamiferos() throws SQLException {
        Connection con = new Conexion().getconexion();
        ArrayList<Mamifero> listaMamiferos = new ArrayList<>(); // Lista para almacenar los animales

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, atropello FROM mamiferos;");

            while (rs.next()) {
                // Obtener los valores reales de la consulta
                String nombre = rs.getString("nombre");
                String especie = rs.getString("especie");
                String peso = rs.getString("peso");
                String tipoLesion = rs.getString("tipo_lesion");
                String gravedad = rs.getString("gravedad");
                String tratamiento = rs.getString("tratamiento");
                boolean atropello = rs.getBoolean("atropello");

                // Crear un nuevo objeto Animal con los valores obtenidos
                Mamifero mam = new Mamifero(nombre, especie, peso, tipoLesion, gravedad, tratamiento, atropello);
                listaMamiferos.add(mam);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaMamiferos;
    }

    public ArrayList<Reptil> getNombresReptiles() throws SQLException {
        Connection con = new Conexion().getconexion();
        ArrayList<Reptil> listaReptiles = new ArrayList<>(); // Lista para almacenar los animales

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, infeccion_bacteriana FROM reptiles;");

            while (rs.next()) {
                // Obtener los valores reales de la consulta
                String nombre = rs.getString("nombre");
                String especie = rs.getString("especie");
                String peso = rs.getString("peso");
                String tipoLesion = rs.getString("tipo_lesion");
                String gravedad = rs.getString("gravedad");
                String tratamiento = rs.getString("tratamiento");
                boolean infeccion_bacteriana = rs.getBoolean("infeccion_bacteriana");

                // Crear un nuevo objeto Animal con los valores obtenidos
                Reptil rep = new Reptil(nombre, especie, peso, tipoLesion, gravedad, tratamiento, infeccion_bacteriana);
                listaReptiles.add(rep);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaReptiles;
    }

    public ArrayList<Animal> getListadoLeve() throws SQLException {
        Connection con = new Conexion().getconexion();
        ArrayList<Animal> listaLeve = new ArrayList<>(); // Lista para almacenar los animales

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM aves WHERE gravedad = 'Leve'\n"
                    + "UNION ALL\n"
                    + "SELECT * FROM mamiferos WHERE gravedad = 'Leve'\n"
                    + "UNION ALL\n"
                    + "SELECT * FROM reptiles WHERE gravedad = 'Leve';");

            while (rs.next()) {
                // Obtener los valores reales de la consulta
                String nombre = rs.getString("nombre");
                String especie = rs.getString("especie");
                String peso = rs.getString("peso");
                String tipoLesion = rs.getString("tipo_lesion");
                String gravedad = rs.getString("gravedad");
                String tratamiento = rs.getString("tratamiento");

                // Crear un nuevo objeto Animal con los valores obtenidos
                Animal a = new Animal(nombre, especie, peso, tipoLesion, gravedad, tratamiento);
                listaLeve.add(a);
            }

        } catch (SQLException e) {
            // Imprimir la excepción en caso de error
            e.printStackTrace();
        }

        return listaLeve;
    }

    public ArrayList<Animal> getListadoModerado() throws SQLException {
        Connection con = new Conexion().getconexion();
        ArrayList<Animal> listaModerado = new ArrayList<>(); // Lista para almacenar los animales

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM aves WHERE gravedad = 'Moderado'\n"
                    + "UNION ALL\n"
                    + "SELECT * FROM mamiferos WHERE gravedad = 'Moderado'\n"
                    + "UNION ALL\n"
                    + "SELECT * FROM reptiles WHERE gravedad = 'Moderado';");

            while (rs.next()) {
                // Obtener los valores reales de la consulta
                String nombre = rs.getString("nombre");
                String especie = rs.getString("especie");
                String peso = rs.getString("peso");
                String tipoLesion = rs.getString("tipo_lesion");
                String gravedad = rs.getString("gravedad");
                String tratamiento = rs.getString("tratamiento");

                // Crear un nuevo objeto Animal con los valores obtenidos
                Animal a = new Animal(nombre, especie, peso, tipoLesion, gravedad, tratamiento);
                listaModerado.add(a);
            }

        } catch (SQLException e) {
            // Imprimir la excepción en caso de error
            e.printStackTrace();
        }

        return listaModerado;
    }

    public ArrayList<Animal> getListadoGrave() throws SQLException {
        Connection con = new Conexion().getconexion();
        ArrayList<Animal> listaGrave = new ArrayList<>(); // Lista para almacenar los animales

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM aves WHERE gravedad = 'Grave'\n"
                    + "UNION ALL\n"
                    + "SELECT * FROM mamiferos WHERE gravedad = 'Grave'\n"
                    + "UNION ALL\n"
                    + "SELECT * FROM reptiles WHERE gravedad = 'Grave';");

            while (rs.next()) {
                // Obtener los valores reales de la consulta
                String nombre = rs.getString("nombre");
                String especie = rs.getString("especie");
                String peso = rs.getString("peso");
                String tipoLesion = rs.getString("tipo_lesion");
                String gravedad = rs.getString("gravedad");
                String tratamiento = rs.getString("tratamiento");

                // Crear un nuevo objeto Animal con los valores obtenidos
                Animal a = new Animal(nombre, especie, peso, tipoLesion, gravedad, tratamiento);
                listaGrave.add(a);
            }

        } catch (SQLException e) {
            // Imprimir la excepción en caso de error
            e.printStackTrace();
        }

        return listaGrave;
    }

    public ArrayList<Animal> getListadoSin() throws SQLException {
        Connection con = new Conexion().getconexion();
        ArrayList<Animal> listaSin = new ArrayList<>(); // Lista para almacenar los animales

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM aves WHERE tratamiento IS NULL\n"
                    + "UNION ALL\n"
                    + "SELECT * FROM mamiferos WHERE tratamiento IS NULL\n"
                    + "UNION ALL\n"
                    + "SELECT * FROM reptiles WHERE tratamiento IS NULL;;");

            while (rs.next()) {
                // Obtener los valores reales de la consulta
                String nombre = rs.getString("nombre");
                String especie = rs.getString("especie");
                String peso = rs.getString("peso");
                String tipoLesion = rs.getString("tipo_lesion");
                String gravedad = rs.getString("gravedad");
                String tratamiento = rs.getString("tratamiento");

                // Crear un nuevo objeto Animal con los valores obtenidos
                Animal a = new Animal(nombre, especie, peso, tipoLesion, gravedad, tratamiento);
                listaSin.add(a);
            }

        } catch (SQLException e) {
            // Imprimir la excepción en caso de error
            e.printStackTrace();
        }

        return listaSin;
    }

    public ArrayList<Animal> getListadoCon() throws SQLException {
        Connection con = new Conexion().getconexion();
        ArrayList<Animal> listaCon = new ArrayList<>(); // Lista para almacenar los animales

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM aves WHERE tratamiento IS NOT NULL\n"
                    + "UNION ALL\n"
                    + "SELECT * FROM mamiferos WHERE tratamiento IS NOT NULL\n"
                    + "UNION ALL\n"
                    + "SELECT * FROM reptiles WHERE tratamiento IS NOT NULL;");

            while (rs.next()) {
                // Obtener los valores reales de la consulta
                String nombre = rs.getString("nombre");
                String especie = rs.getString("especie");
                String peso = rs.getString("peso");
                String tipoLesion = rs.getString("tipo_lesion");
                String gravedad = rs.getString("gravedad");
                String tratamiento = rs.getString("tratamiento");

                // Crear un nuevo objeto Animal con los valores obtenidos
                Animal a = new Animal(nombre, especie, peso, tipoLesion, gravedad, tratamiento);
                listaCon.add(a);
            }

        } catch (SQLException e) {
            // Imprimir la excepción en caso de error
            e.printStackTrace();
        }

        return listaCon;
    }

}
