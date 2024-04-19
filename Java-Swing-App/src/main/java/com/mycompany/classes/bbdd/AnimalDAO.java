/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes.bbdd;

import java.sql.PreparedStatement;

/**
 *
 * @author Alumno
 */
public class AnimalDAO {
//    public void insertarFabricante(Fabricante f) throws SQLException {
//        Statement s = new conexion().getconexion().createStatement();
//        int nFil = s.executeUpdate("insert into fabricante(id,nombre) values (default,'" + f.getNombre() + "')");
//        new conexion().getconexion().createStatement().executeUpdate("insert into fabricante(id,nombre) values (default,'" + f.getNombre() + "')");
//    }
    public void insertarAnimal(String tipo, String nombre, String especie, String peso, String lesion, String gravedad, Boolean cazaFurtiva) throws Exception {
        new conexion().getconexion().createStatement().executeUpdate(
               INSERT INTO `animales` (`tipo`, `nombre`, `especie`, `peso`, `tipo_lesion`, `gravedad`, `motivo_lesion`, `infeccion_bacteriana`)
                VALUES
                ('ave', 'Piolín', 'Canario', '0.05', 'Fractura de ala', '2', 'Caza', '0'),
                ('mamífero', 'Bambi', 'Ciervo', '60.00', 'Herida leve', '1', 'Caza', '0'),
                ('reptil', 'Godzilla', 'Iguana marina', '8.00', 'Fractura de cola', '2', NULL, '0');
    }
}
/*
-- Insertar nuevos registros en la tabla `animales`
INSERT INTO `animales` (`tipo`, `nombre`, `especie`, `peso`, `tipo_lesion`, `gravedad`, `motivo_lesion`, `infeccion_bacteriana`)
VALUES
('ave', 'Piolín', 'Canario', '0.05', 'Fractura de ala', '2', 'Caza', '0'),
('mamífero', 'Bambi', 'Ciervo', '60.00', 'Herida leve', '1', 'Caza', '0'),
('reptil', 'Godzilla', 'Iguana marina', '8.00', 'Fractura de cola', '2', NULL, '0');

*/
