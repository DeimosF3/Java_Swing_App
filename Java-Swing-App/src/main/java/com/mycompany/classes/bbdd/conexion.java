/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alumno
 */

/*
*******NO TOCAR*******
*/
public class conexion {
    Connection c = null;
    String urlConnection = "jdbc:mysql://localhost:3306/tienda";
    String user = "root";
    String password = "";

    public Connection getconexion() throws SQLException {

        c = DriverManager.getConnection(urlConnection, user, password);
        System.out.println("Conexión realizada");
        Statement s = c.createStatement();

        return c;
    }
}
