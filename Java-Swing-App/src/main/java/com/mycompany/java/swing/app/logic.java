package com.mycompany.java.swing.app;




import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */

public class logic extends JFrame implements ActionListener {
    private  List<Animal> listaAnimales;
    private List<Veterinario> listaVeterinarios;

    private JButton altaButton, tratamientoButton, liberacionButton, listadoButton, bajaButton, salirButton;

    public logic() {
        listaAnimales = new ArrayList<>();
        listaVeterinarios = new ArrayList<>();

        setTitle("Centro de Recuperación de Fauna");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        altaButton = new JButton("Alta");
        tratamientoButton = new JButton("Tratamiento");
        liberacionButton = new JButton("Liberación");
        listadoButton = new JButton("Listado");
        bajaButton = new JButton("Baja");
        salirButton = new JButton("Salir");

        altaButton.addActionListener(this);
        tratamientoButton.addActionListener(this);
        liberacionButton.addActionListener(this);
        listadoButton.addActionListener(this);
        bajaButton.addActionListener(this);
        salirButton.addActionListener(this);

        add(altaButton);
        add(tratamientoButton);
        add(liberacionButton);
        add(listadoButton);
        add(bajaButton);
        add(salirButton);

        setVisible(true);
    }

    @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == altaButton) 
    
    {
        // Mostrar un formulario para ingresar los datos del animal y luego crear una instancia de la clase Animal con esos datos.
        String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del animal:");
        String especie = JOptionPane.showInputDialog(this, "Ingrese la especie del animal:");
        double peso = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese el peso del animal:"));
        //FALTA control de excepciones (que valide si es un String)
        String tipoLesion = JOptionPane.showInputDialog(this, "Ingrese el tipo de lesión del animal:");
        
        
        String[] tiposGravedad = {"Grave", "Leve"};
        String gravedad = (String) JOptionPane.showInputDialog(this, "Seleccione el tipo de gravedad:",
                "Tipo de Animal", JOptionPane.QUESTION_MESSAGE, null, tiposGravedad, tiposGravedad[0]);

        
        String[] tiposAnimales = {"Ave", "Mamífero", "Reptil"};
        String tipoAnimal = (String) JOptionPane.showInputDialog(this, "Seleccione el tipo de animal:",
                "Tipo de Animal", JOptionPane.QUESTION_MESSAGE, null, tiposAnimales, tiposAnimales[0]);

        Animal animal = null;
        if (tipoAnimal.equals("Ave")) {
            boolean motivoCaza = JOptionPane.showConfirmDialog(this, "¿La lesión fue provocada por caza furtiva?", "Motivo de Caza",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
            animal = new Ave(nombre, especie, peso, tipoLesion, gravedad, motivoCaza);
        } else if (tipoAnimal.equals("Mamífero")) {
            boolean motivoAtropello = JOptionPane.showConfirmDialog(this, "¿La lesión fue provocada por atropello?", "Motivo de Atropello",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
            animal = new Mamifero(nombre, especie, peso, tipoLesion, gravedad, motivoAtropello);
        } else if (tipoAnimal.equals("Reptil")) {
            boolean tieneInfeccionBacteriana = JOptionPane.showConfirmDialog(this, "¿El reptil tiene una infección bacteriana?", "Infección Bacteriana",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
            animal = new Reptil(nombre, especie, peso, tipoLesion, gravedad, tieneInfeccionBacteriana);
        }

        listaAnimales.add(animal);
        JOptionPane.showMessageDialog(this, "Animal dado de alta correctamente.");
    } 
    
    
    else if (e.getSource() == tratamientoButton) 
    
        
    {
        // Mostrar un formulario para seleccionar un animal y registrar el tratamiento administrado.
        if (listaAnimales.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay animales registrados.");
            return;
        }

        String[] nombresAnimales = new String[listaAnimales.size()];
        for (int i = 0; i < listaAnimales.size(); i++) {
            nombresAnimales[i] = listaAnimales.get(i).getNombre();
        }

        String nombreAnimal = (String) JOptionPane.showInputDialog(this, "Seleccione el animal:", "Registro de Tratamiento",
                JOptionPane.QUESTION_MESSAGE, null, nombresAnimales, nombresAnimales[0]);

        Animal animalSeleccionado = null;
        for (Animal animal : listaAnimales) {
            if (animal.getNombre().equals(nombreAnimal)) {
                animalSeleccionado = animal;
                break;
            }
        }

        String tratamiento = JOptionPane.showInputDialog(this, "Ingrese el tratamiento administrado:");
        animalSeleccionado.registrarTratamiento(tratamiento);
        JOptionPane.showMessageDialog(this, "Tratamiento registrado correctamente.");
    } 
    
    
    else if (e.getSource() == liberacionButton) 
    
        
    {
        // Mostrar un formulario para seleccionar un animal y registrar la fecha de liberación.
        
        
        //FALTA cuando sea liberado que se le de de baja automaticamente
        if (listaAnimales.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay animales registrados.");
            return;
        }

        String[] nombresAnimales = new String[listaAnimales.size()];
        for (int i = 0; i < listaAnimales.size(); i++) {
            nombresAnimales[i] = listaAnimales.get(i).getNombre();
        }

        String nombreAnimal = (String) JOptionPane.showInputDialog(this, "Seleccione el animal:", "Registro de Liberación",
                JOptionPane.QUESTION_MESSAGE, null, nombresAnimales, nombresAnimales[0]);

        Animal animalSeleccionado = null;
        for (Animal animal : listaAnimales) {
            if (animal.getNombre().equals(nombreAnimal)) {
                animalSeleccionado = animal;
                break;
            }
        }
        Date fechaLiberacion = new Date();
        animalSeleccionado.registrarLiberacion(fechaLiberacion);
        JOptionPane.showMessageDialog(this, "Liberación registrada correctamente.");
    } 
    
    
    else if (e.getSource() == listadoButton) 
    
    
    {
        // Mostrar un diálogo o imprimir en consola el listado de animales en el centro de recuperación.
        if (listaAnimales.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay animales registrados.");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Animal animal : listaAnimales) {
            sb.append(animal).append("\n");
        }
        JOptionPane.showMessageDialog(this, sb.toString(), "Listado de Animales", JOptionPane.INFORMATION_MESSAGE);
    } 
    
    
    else if (e.getSource() == bajaButton)
    
    
    {
        
        if (listaAnimales.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay animales registrados.");
            return;
        }
        
        String[] nombresAnimales = new String[listaAnimales.size()];
        for (int i = 0; i < listaAnimales.size(); i++) {
            nombresAnimales[i] = listaAnimales.get(i).getNombre();
        }

        String nombreAnimal = (String) JOptionPane.showInputDialog(this, "Seleccione el animal:", "Registro de Baja",
                JOptionPane.QUESTION_MESSAGE, null, nombresAnimales, nombresAnimales[0]);

        Animal animalSeleccionado = null;
        for (Animal animal : listaAnimales) {
            if (animal.getNombre().equals(nombreAnimal)) {
                animalSeleccionado = animal;
                break;
            }
        }

        //FALTA baja = fallecimiento?
        //boolean 
        Date fechaBaja = new Date();
        animalSeleccionado.registrarFallecimiento(fechaBaja);
        JOptionPane.showMessageDialog(this, "Baja registrada correctamente.");
    } 
    
    
    else if (e.getSource() == salirButton) 
    
    
    {
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro que deseas salir?", "Salir",
                JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}


    public static void main(String[] args) {
        SwingUtilities.invokeLater(logic::new);
    }
}
