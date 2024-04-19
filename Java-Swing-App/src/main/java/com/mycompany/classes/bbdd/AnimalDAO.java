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
    
public void insertarAnimal(Ave a) throws SQLException {
    Connection con = new conexion().getconexion();
    String query = "INSERT INTO animales (nombre, especie, peso, tipo_lesion, gravedad, motivo_lesion) " +
                   "VALUES ( ?, ?, ?, ?, ?, ?)";
    
    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, a.getNombre());
    ps.setString(2, a.getEspecie());
    ps.setString(3, a.getPeso());
    ps.setString(4, a.getTipoLesion());
    ps.setString(5, a.getGravedad());
    ps.setInt(6, a.isCazaFurtiva() ? 1 : 0);

    ps.executeUpdate();
    ps.close();
    con.close();
}

}