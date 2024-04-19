/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes.bbdd;
import com.mycompany.classes.bbdd.conexion;
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
    Connection con = new conexion().getconexion();
    String query = "INSERT INTO aves (nombre, especie, peso, tipo_lesion, gravedad, cazaFurtiva)"
            + " VALUES ('"+ a.getNombre() +"','"+ a.getEspecie() +"','"+ a.getPeso()+"','"+ a.getTipoLesion()+"','"+ a.getGravedad()+"','"+ a.isCazaFurtiva() +"')";

     con.createStatement().executeUpdate(query);
    con.close();
}

}