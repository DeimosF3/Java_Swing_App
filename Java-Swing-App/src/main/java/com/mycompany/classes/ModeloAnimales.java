/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

import com.mycompany.classes.bbdd.conexion;
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

    public static ResultSet ListarTabla(String consulta) throws SQLException {
        Connection conn = new conexion().getconexion();
        Statement sql;

        ResultSet datos = null;

        try {
            sql = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            datos = sql.executeQuery(consulta);

        } catch (Exception e) {
            System.out.println(e);
        }
        return datos;
    }

    public ArrayList<Ave> getNombresAvesTratamiento(int num_filtrado2, int num_filtrado3) throws SQLException {
        Connection con = new conexion().getconexion();
        ArrayList<Ave> listaAves = new ArrayList<>(); // Lista para almacenar los animales

        try {
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = null;
            if (num_filtrado2 == 1) {
                rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM aves WHERE gravedad= 'Leve';");
                if (num_filtrado3 == 1) {
                    rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM aves WHERE gravedad= 'Leve' AND tratamiento IS NOT NULL");
                } else if (num_filtrado3 == 2) {
                    rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM aves WHERE gravedad= 'Leve' AND tratamiento IS NULL");
                }
            } else if (num_filtrado2 == 2) {
                rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM aves WHERE gravedad = 'Moderado';");
                if (num_filtrado3 == 1) {
                    rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM aves WHERE gravedad= 'Moderado' AND tratamiento IS NOT NULL");
                } else if (num_filtrado3 == 2) {
                    rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM aves WHERE gravedad= 'Moderado' AND tratamiento IS NULL");
                }
            } else if (num_filtrado2 == 3) {
                rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM aves WHERE gravedad = 'Grave';");
                if (num_filtrado3 == 1) {
                    rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM aves WHERE gravedad= 'Grave' AND tratamiento IS NOT NULL");
                } else if (num_filtrado3 == 2) {
                    rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM aves WHERE gravedad= 'Grave' AND tratamiento IS NULL");
                }

            } else if (num_filtrado3 == 1 && num_filtrado2 == 0) {
                rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM aves WHERE tratamiento IS NOT NULL;");
            } else if (num_filtrado3 == 2 && num_filtrado2 == 0) {
                rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM aves WHERE tratamiento IS NULL;");
            } else if (num_filtrado2 == 0 && num_filtrado3 == 0) {
                rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM aves;");
            }
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

        }

        return listaAves;
    }

    public ArrayList<Ave> getNombresAves() throws SQLException {
        Connection con = new conexion().getconexion();
        ArrayList<Ave> listaAves = new ArrayList<>(); // Lista para almacenar los animales

        try {
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = null;
            rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM aves");

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

        }

        return listaAves;
    }

    public ArrayList<Mamifero> getNombresMamiferosTratamiento(int num_filtrado2, int num_filtrado3) throws SQLException {
        Connection con = new conexion().getconexion();
        ArrayList<Mamifero> listaMamiferos = new ArrayList<>(); // Lista para almacenar los animales

        try {
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = null;
            if (num_filtrado2 == 1) {
                rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM mamiferos WHERE gravedad= 'Leve';");
                if (num_filtrado3 == 1) {
                    rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM mamiferos WHERE gravedad= 'Leve' AND tratamiento IS NOT NULL");
                } else if (num_filtrado3 == 2) {
                    rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM mamiferos WHERE gravedad= 'Leve' AND tratamiento IS NULL");
                }
            } else if (num_filtrado2 == 2) {
                rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM mamiferos WHERE gravedad = 'Moderado';");
                if (num_filtrado3 == 1) {
                    rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM mamiferos WHERE gravedad= 'Moderado' AND tratamiento IS NOT NULL");
                } else if (num_filtrado3 == 2) {
                    rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM mamiferos WHERE gravedad= 'Moderado' AND tratamiento IS NULL");
                }
            } else if (num_filtrado2 == 3) {
                rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM mamiferos WHERE gravedad = 'Grave';");
                if (num_filtrado3 == 1) {
                    rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM mamiferos WHERE gravedad= 'Grave' AND tratamiento IS NOT NULL");
                } else if (num_filtrado3 == 2) {
                    rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM mamiferos WHERE gravedad= 'Grave' AND tratamiento IS NULL");
                }

            } else if (num_filtrado3 == 1 && num_filtrado2 == 0) {
                rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM mamiferos WHERE tratamiento IS NOT NULL;");
            } else if (num_filtrado3 == 2 && num_filtrado2 == 0) {
                rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM mamiferos WHERE tratamiento IS NULL;");
            } else if (num_filtrado3 == 0 && num_filtrado2 == 0) {
                rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM mamiferos;");
            }

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

        }

        return listaMamiferos;
    }

    public ArrayList<Mamifero> getNombresMamiferos() throws SQLException {
        Connection con = new conexion().getconexion();
        ArrayList<Mamifero> listaMamiferos = new ArrayList<>(); // Lista para almacenar los animales

        try {
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
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

        }

        return listaMamiferos;
    }

    public ArrayList<Reptil> getNombresReptilesTratamiento(int num_filtrado2, int num_filtrado3) throws SQLException {
        Connection con = new conexion().getconexion();
        ArrayList<Reptil> listaReptiles = new ArrayList<>(); // Lista para almacenar los animales

        try {
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = null;
            if (num_filtrado2 == 1) {
                rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM reptiles WHERE gravedad= 'Leve';");
                if (num_filtrado3 == 1) {
                    rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM reptiles WHERE gravedad= 'Leve' AND tratamiento IS NOT NULL");
                } else if (num_filtrado3 == 2) {
                    rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM reptiles WHERE gravedad= 'Leve' AND tratamiento IS NULL");
                }
            } else if (num_filtrado2 == 2) {
                rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM reptiles WHERE gravedad = 'Moderado';");
                if (num_filtrado3 == 1) {
                    rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM reptiles WHERE gravedad= 'Moderado' AND tratamiento IS NOT NULL");
                } else if (num_filtrado3 == 2) {
                    rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM reptiles WHERE gravedad= 'Moderado' AND tratamiento IS NULL");
                }
            } else if (num_filtrado2 == 3) {
                rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM reptiles WHERE gravedad = 'Grave';");
                if (num_filtrado3 == 1) {
                    rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM reptiles WHERE gravedad= 'Grave' AND tratamiento IS NOT NULL");
                } else if (num_filtrado3 == 2) {
                    rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM reptiles WHERE gravedad= 'Grave' AND tratamiento IS NULL");
                }

            } else if (num_filtrado3 == 1 && num_filtrado2 == 0) {
                rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM reptiles WHERE tratamiento IS NOT NULL;");
            } else if (num_filtrado3 == 2 && num_filtrado2 == 0) {
                rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM reptiles WHERE tratamiento IS NULL;");
            } else if (num_filtrado2 == 0 && num_filtrado3 == 0) {
                rs = stmt.executeQuery("SELECT nombre, especie, peso, tipo_lesion, gravedad, tratamiento, cazaFurtiva FROM reptiles;");
            }

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

        }

        return listaReptiles;
    }

    public ArrayList<Reptil> getNombresReptiles() throws SQLException {
        Connection con = new conexion().getconexion();
        ArrayList<Reptil> listaReptiles = new ArrayList<>(); // Lista para almacenar los animales

        try {
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
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

        }

        return listaReptiles;
    }

    public ArrayList<Animal> getListadoLeve(int num_filtrado1, int num_filtrado3) throws SQLException {
        Connection con = new conexion().getconexion();
        ArrayList<Animal> listaLeve = new ArrayList<>(); // Lista para almacenar los animales
        ResultSet rs = null;

        try {
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            if (num_filtrado1 == 0 && num_filtrado3 == 0) {
                rs = stmt.executeQuery("SELECT * FROM aves WHERE gravedad = 'Leve'\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM mamiferos WHERE gravedad = 'Leve'\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM reptiles WHERE gravedad = 'Leve';");
            } else if (num_filtrado1 == 0 && num_filtrado3 == 1) {
                rs = stmt.executeQuery("SELECT * FROM aves WHERE gravedad = 'Leve' AND tratamiento IS NOT NULL\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM mamiferos WHERE gravedad = 'Leve' AND tratamiento IS NOT NULL\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM reptiles WHERE gravedad = 'Leve' AND tratamiento IS NOT NULL;");
            } else if (num_filtrado1 == 0 && num_filtrado3 == 2) {
                rs = stmt.executeQuery("SELECT * FROM aves WHERE gravedad = 'Leve' AND tratamiento IS NULL\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM mamiferos WHERE gravedad = 'Leve' AND tratamiento IS NULL\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM reptiles WHERE gravedad = 'Leve' AND tratamiento IS NULL;");
            }

            if (rs != null) {
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
            }

        } catch (SQLException e) {
            // Imprimir la excepción en caso de error

        } finally {
            if (rs != null) {
                rs.close(); // Cerrar el ResultSet
            }
            con.close(); // Cerrar la conexión
        }

        return listaLeve;
    }

    public ArrayList<Animal> getListadoModerado(int num_filtrado1, int num_filtrado3) throws SQLException {
        Connection con = new conexion().getconexion();
        ArrayList<Animal> listaModerado = new ArrayList<>(); // Lista para almacenar los animales
        ResultSet rs = null;

        try {
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            if (num_filtrado1 == 0 && num_filtrado3 == 0) {
                rs = stmt.executeQuery("SELECT * FROM aves WHERE gravedad = 'Moderado'\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM mamiferos WHERE gravedad = 'Moderado'\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM reptiles WHERE gravedad = 'Moderado';");
            } else if (num_filtrado1 == 0 && num_filtrado3 == 1) {
                rs = stmt.executeQuery("SELECT * FROM aves WHERE gravedad = 'Moderado' AND tratamiento IS NOT NULL\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM mamiferos WHERE gravedad = 'Moderado' AND tratamiento IS NOT NULL\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM reptiles WHERE gravedad = 'Moderado' AND tratamiento IS NOT NULL;");
            } else if (num_filtrado1 == 0 && num_filtrado3 == 2) {
                rs = stmt.executeQuery("SELECT * FROM aves WHERE gravedad = 'Moderado' AND tratamiento IS NULL\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM mamiferos WHERE gravedad = 'Moderado' AND tratamiento IS NULL\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM reptiles WHERE gravedad = 'Moderado' AND tratamiento IS NULL;");
            }

            if (rs != null) {
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
            }

        } catch (SQLException e) {
            // Imprimir la excepción en caso de error

        } finally {
            if (rs != null) {
                rs.close(); // Cerrar el ResultSet
            }
            con.close(); // Cerrar la conexión
        }

        return listaModerado;
    }

    public ArrayList<Animal> getListadoGrave(int num_filtrado1, int num_filtrado3) throws SQLException {
        Connection con = new conexion().getconexion();
        ArrayList<Animal> listaGrave = new ArrayList<>(); // Lista para almacenar los animales
        ResultSet rs = null;

        try {
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            if (num_filtrado1 == 0 && num_filtrado3 == 0) {
                rs = stmt.executeQuery("SELECT * FROM aves WHERE gravedad = 'Grave'\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM mamiferos WHERE gravedad = 'Grave'\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM reptiles WHERE gravedad = 'Grave';");
            } else if (num_filtrado1 == 0 && num_filtrado3 == 1) {
                rs = stmt.executeQuery("SELECT * FROM aves WHERE gravedad = 'Grave' AND tratamiento IS NOT NULL\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM mamiferos WHERE gravedad = 'Grave' AND tratamiento IS NOT NULL\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM reptiles WHERE gravedad = 'Grave' AND tratamiento IS NOT NULL;");
            } else if (num_filtrado1 == 0 && num_filtrado3 == 2) {
                rs = stmt.executeQuery("SELECT * FROM aves WHERE gravedad = 'Grave' AND tratamiento IS NULL\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM mamiferos WHERE gravedad = 'Grave' AND tratamiento IS NULL\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM reptiles WHERE gravedad = 'Grave' AND tratamiento IS NULL;");
            }

            if (rs != null) {
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
            }

        } catch (SQLException e) {
            // Imprimir la excepción en caso de error

        } finally {
            if (rs != null) {
                rs.close(); // Cerrar el ResultSet
            }
            con.close(); // Cerrar la conexión
        }

        return listaGrave;
    }

    public ArrayList<Animal> getListadoSin(int num_filtrado1, int num_filtrado2) throws SQLException {
        Connection con = new conexion().getconexion();
        ArrayList<Animal> listaSin = new ArrayList<>(); // Lista para almacenar los animales
        ResultSet rs = null;

        try {
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            if (num_filtrado1 == 0 && num_filtrado2 == 0) {
                rs = stmt.executeQuery("SELECT * FROM aves WHERE tratamiento IS NULL\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM mamiferos WHERE tratamiento IS NULL\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM reptiles WHERE tratamiento IS NULL;");

                if (rs != null) {
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
                }
            }

        } catch (SQLException e) {
            // Imprimir la excepción en caso de error

        } finally {
            if (rs != null) {
                rs.close(); // Cerrar el ResultSet
            }
            con.close(); // Cerrar la conexión
        }

        return listaSin;
    }

    public ArrayList<Animal> getListadoCon(int num_filtrado1, int num_filtrado2) throws SQLException {
        Connection con = new conexion().getconexion();
        ArrayList<Animal> listaCon = new ArrayList<>(); // Lista para almacenar los animales
        ResultSet rs = null;

        try {
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            if (num_filtrado1 == 0 && num_filtrado2 == 0) {
                rs = stmt.executeQuery("SELECT * FROM aves WHERE tratamiento IS NOT NULL\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM mamiferos WHERE tratamiento IS NOT NULL\n"
                        + "UNION ALL\n"
                        + "SELECT * FROM reptiles WHERE tratamiento IS NOT NULL;");
            }

            if (rs != null) {
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
            }

        } catch (SQLException e) {
            // Imprimir la excepción en caso de error

        } finally {
            if (rs != null) {
                rs.close();
            }
            con.close();
        }

        return listaCon;
    }

}
