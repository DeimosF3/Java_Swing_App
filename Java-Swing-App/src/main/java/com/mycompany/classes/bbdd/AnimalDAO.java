package com.mycompany.classes.bbdd;
import com.mycompany.classes.bbdd.Conexion;
import com.mycompany.classes.Ave;
import com.mycompany.classes.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
 
public class AnimalDAO {    
public void insertarAve(Ave ave) throws SQLException {
    Connection conn = null;
    PreparedStatement pstmt = null;
try {
        conn = new Conexion().getconexion();

        String sql = "INSERT INTO aves (nombre, especie, peso, tipo_lesion, gravedad, cazaFurtiva) VALUES (?, ?, ?, ?, ?, ?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, ave.getNombre());
        pstmt.setString(2, ave.getEspecie());
        pstmt.setString(3, ave.getPeso());
        pstmt.setString(4, ave.getTipoLesion());
        pstmt.setString(5, ave.getGravedad());
        pstmt.setInt(6, ave.isCazaFurtiva() ? 1 : 0);
        
        pstmt.executeUpdate();
     conn.createStatement().executeUpdate(sql);
    conn.close();
    
    } finally {
        if (pstmt != null) {
            pstmt.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
}

public void insertarReptil(Reptil rep) throws SQLException {
    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        conn = new Conexion().getconexion();

        String sql = "INSERT INTO reptiles (nombre, especie, peso, tipo_lesion, gravedad, infeccion_bacteriana) VALUES (?, ?, ?, ?, ?, ?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, rep.getNombre());
        pstmt.setString(2, rep.getEspecie());
        pstmt.setString(3, rep.getPeso());
        pstmt.setString(4, rep.getTipoLesion());
        pstmt.setString(5, rep.getGravedad());
        pstmt.setInt(6, rep.isTieneInfeccionBacteriana()? 1 : 0);
        
        pstmt.executeUpdate();
    } finally {
        if (pstmt != null) {
            pstmt.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
}



public void insertarMamifero(Mamifero mam) throws SQLException {
    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        conn = new Conexion().getconexion();
        String query = "INSERT INTO mamiferos (nombre, especie, peso, tipo_lesion, gravedad, atropello)"
                + " VALUES (?, ?, ?, ?, ?, ?)";

        pstmt = conn.prepareStatement(query);
        pstmt.setString(1, mam.getNombre());
        pstmt.setString(2, mam.getEspecie());
        pstmt.setString(3, mam.getPeso());
        pstmt.setString(4, mam.getTipoLesion());
        pstmt.setString(5, mam.getGravedad());
        pstmt.setInt(6, mam.isMotivoAtropello() ? 1 : 0);

        pstmt.executeUpdate();
    } finally {
        if (pstmt != null) {
            pstmt.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
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
 public void insertarFecha(String nombre, String fecha_salida) throws SQLException {
        Connection con = new Conexion().getconexion();

        // consulta para insertar fecha de salida del animal a partir del nombre
        String queryFecha = "UPDATE mamiferos SET fecha_salida = = '" + fecha_salida + "' WHERE nombre = '" + nombre + "'";
        con.createStatement().executeUpdate(queryFecha);
 }
}
