/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes.bbdd;
import com.mycompany.classes.bbdd.Conexion;
import com.mycompany.classes.Ave;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alumno
 */
public class AnimalDAO {    
    
public void insertarAve(Ave a) throws SQLException {
    Connection con = new Conexion().getconexion();
    String query = "INSERT INTO aves (nombre, especie, peso, tipo_lesion, gravedad, cazaFurtiva)"
            + " VALUES ('"+ a.getNombre() +"','"+ a.getEspecie() +"','"+ a.getPeso()+"','"+ a.getTipoLesion()+"','"+ a.getGravedad()+"','"+ a.isCazaFurtiva() +"')";

     con.createStatement().executeUpdate(query);
    con.close();
}

public void insertarTratamiento(String nombre, String tratamiento) throws SQLException {
    Connection con = new Conexion().getconexion();
    
    // tratamiento para aves
    String queryAves = "UPDATE aves SET tratamiento = '" + tratamiento + "' WHERE nombre = '" + nombre + "'";
    con.createStatement().executeUpdate(queryAves);
    
    // tratamiento para mamiferos
    String queryMamiferos = "UPDATE mamiferos SET tratamiento = '" + tratamiento + "' WHERE nombre = '" + nombre + "'";
    con.createStatement().executeUpdate(queryMamiferos);
    
    // tratamiento para reptiles
    String queryReptiles = "UPDATE reptiles SET tratamiento = '" + tratamiento + "' WHERE nombre = '" + nombre + "'";
    con.createStatement().executeUpdate(queryReptiles);
    
    con.close();
}

}