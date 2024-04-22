/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.gui;

import com.mycompany.classes.Animal;
import com.mycompany.classes.Ave;
import com.mycompany.classes.Fachada;
import com.mycompany.classes.Mamifero;
import com.mycompany.classes.ModeloAnimales;
import com.mycompany.classes.Reptil;
import com.mycompany.guiUtils.Utilities;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class tratamientoPanel extends javax.swing.JPanel {

    /**
     * Creates new form tratamientoPanel
     */
    public tratamientoPanel() {
        initComponents();
        Utilities u = new Utilities();
        u.setFontRecursively(contenedor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Filtrado1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Filtrado2 = new javax.swing.JComboBox<>();
        Filtrado3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        ListadoNombres = new javax.swing.JComboBox<>();
        llenarCombo = new javax.swing.JButton();
        jTratamiento = new javax.swing.JTextField();

        contenedor.setBackground(new java.awt.Color(191, 172, 200));
        contenedor.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(191, 172, 200));
        jPanel2.setPreferredSize(new java.awt.Dimension(620, 420));

        jLabel4.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel4.setText("                   Tratamiento / Medicacion");

        jPanel1.setBackground(new java.awt.Color(191, 172, 200));

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel1.setText("Seleccione los filtros de busqueda:");

        Filtrado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Aves", "Mamiferos", "Reptiles" }));
        Filtrado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filtrado1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel3.setText("Suministrar medicacion:");

        jButton1.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jButton1.setText("Guardar registro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Filtrado2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Leve", "Moderado", "Grave" }));
        Filtrado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filtrado2ActionPerformed(evt);
            }
        });

        Filtrado3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Con tratamiento", "Sin tratamiento" }));
        Filtrado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filtrado3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Animales que coincidan con los criterios de la búsqueda:");

        ListadoNombres.setModel(modeloCombo);
        ListadoNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadoNombresActionPerformed(evt);
            }
        });

        llenarCombo.setText("Filtrar");
        llenarCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llenarComboActionPerformed(evt);
            }
        });

        jTratamiento.setText("50 carácteres máximo");
        jTratamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTratamientoMouseClicked(evt);
            }
        });
        jTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTratamientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(ListadoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Filtrado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Filtrado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Filtrado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(llenarCombo))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Filtrado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filtrado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filtrado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(llenarCombo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListadoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        contenedor.add(jPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
public void guardarDatos() {
        if (ListadoNombres.getSelectedItem() != null) {
            try {
                String nombre = (String) ListadoNombres.getSelectedItem();
                String tratamiento = jTratamiento.getText();
                validarTexto(tratamiento);
                try {
                    new Fachada().insertarTratamiento(nombre, tratamiento);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al dar de alta en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Datos inválidos.Por favor, utilice solo letras, espacios y no más de 50 carácteres.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Datos inválidos.Por favor ingrese seleccione un animal", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void validarTexto(String texto) {
        if (!texto.matches("[a-zA-Z\\s]+")) {
            throw new IllegalArgumentException("El valor ingresado contiene caracteres no válidos. Por favor, utilice solo letras, espacios y no más de 50 carácteres.");
        } else if (texto.length() > 50) {
            throw new IllegalArgumentException("El valor ingresado contiene caracteres no válidos. Por favor, utilice solo letras, espacios y no más de 50 carácteres.");
        } else if (texto.equals("50 carácteres máximo")) {
            throw new IllegalArgumentException("Ingresar tratamiento");
        } else if (texto.equals("")) {
            throw new IllegalArgumentException("Ingresar tratamiento");
        }
    }

    public void borrarDatos() {
        ListadoNombres.removeAllItems();
        Filtrado1.setSelectedItem(Filtrado1.getItemAt(0));
        Filtrado2.setSelectedItem(Filtrado2.getItemAt(0));
        Filtrado3.setSelectedItem(Filtrado3.getItemAt(0));
        jTratamiento.setText("50 carácteres máximo");
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        guardarDatos();
        borrarDatos();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void ListarNombresAves(int num_filtrado2,int num_filtrado3) {
        try {
            ModeloAnimales modAnimales = new ModeloAnimales();
            ArrayList<Ave> listaAnimales = modAnimales.getNombresAvesTratamiento(num_filtrado2, num_filtrado3);

            for (Animal animal : listaAnimales) {
                modeloCombo.addElement(animal.getNombre());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ListarNombresMamiferos(int num_filtrado2,int num_filtrado3) {
        try {
            ModeloAnimales modAnimales = new ModeloAnimales();
            ArrayList<Mamifero> listaMamiferos = modAnimales.getNombresMamiferosTratamiento(num_filtrado2, num_filtrado3);

            for (Mamifero mam : listaMamiferos) {
                modeloCombo.addElement(mam.getNombre());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ListarNombresReptiles(int num_filtrado2,int num_filtrado3) {
        try {
            ModeloAnimales modAnimales = new ModeloAnimales();
            ArrayList<Reptil> listaReptiles = modAnimales.getNombresReptilesTratamiento(num_filtrado2, num_filtrado3);

            for (Reptil rep : listaReptiles) {
                modeloCombo.addElement(rep.getNombre());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                      

    int num_filtrado1;
    private void Filtrado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filtrado1ActionPerformed
        num_filtrado1=0;
        if (!Filtrado1.getSelectedItem().equals("Seleccionar...")) {
            
            if (Filtrado1.getSelectedItem().equals("Aves")) {
                num_filtrado1 = 1;
            } else if (Filtrado1.getSelectedItem().equals("Mamiferos")) {
                num_filtrado1 = 2;
            } else if (Filtrado1.getSelectedItem().equals("Reptiles")) {
                num_filtrado1 = 3;
            }

        }
    }//GEN-LAST:event_Filtrado1ActionPerformed


    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();

    private void llenarComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenarComboActionPerformed
        ListadoNombres.removeAllItems();
        modeloCombo.removeAllElements();
        switch (num_filtrado1) {
            case 1 -> {
                ListarNombresAves(num_filtrado2, num_filtrado3);
                establecerPrimerValor(ListadoNombres);
            }
            case 2 -> {
                ListarNombresMamiferos(num_filtrado2, num_filtrado3);
                establecerPrimerValor(ListadoNombres);
            }
            case 3 -> {
                ListarNombresReptiles(num_filtrado2, num_filtrado3);
                establecerPrimerValor(ListadoNombres);
            }
            default ->
                System.out.println("filtrado1 no usado");
        }
        switch (num_filtrado2) {
            case 1 ->
                ListadoLeve(num_filtrado1, num_filtrado3);
            case 2 ->
                ListadoModerado(num_filtrado1, num_filtrado3);
            case 3 ->
                ListadoGrave(num_filtrado1, num_filtrado3);
            default ->
                System.out.println("filtrado2 no usado");
        }
        switch (num_filtrado3) {
            case 1 ->
                ListadoCon(num_filtrado1, num_filtrado2);
            case 2 ->
                ListadoSin(num_filtrado1, num_filtrado2);
            default ->
                System.out.println("filtrado3 no usado");
        }
    }//GEN-LAST:event_llenarComboActionPerformed

    public void ListadoLeve(int num_filtrado1, int num_filtrado3) {
        try {
            ModeloAnimales modAnimales = new ModeloAnimales();
            ArrayList<Animal> listaLeve = modAnimales.getListadoLeve(num_filtrado1, num_filtrado3);

            for (Animal an : listaLeve) {
                modeloCombo.addElement(an.getNombre());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ListadoModerado(int num_filtrado1, int num_filtrado3) {
        try {
            ModeloAnimales modAnimales = new ModeloAnimales();
            ArrayList<Animal> listaModerado = modAnimales.getListadoModerado(num_filtrado1, num_filtrado3);

            for (Animal an : listaModerado) {
                modeloCombo.addElement(an.getNombre());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ListadoGrave(int num_filtrado1, int num_filtrado3) {
        try {
            ModeloAnimales modAnimales = new ModeloAnimales();
            ArrayList<Animal> listaGrave = modAnimales.getListadoGrave(num_filtrado1, num_filtrado3);

            for (Animal an : listaGrave) {
                modeloCombo.addElement(an.getNombre());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ListadoSin(int num_filtrado1, int num_filtrado2) {
        try {
            ModeloAnimales modAnimales = new ModeloAnimales();
            ArrayList<Animal> listaSin = modAnimales.getListadoSin(num_filtrado1, num_filtrado2);

            for (Animal an : listaSin) {
                modeloCombo.addElement(an.getNombre());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ListadoCon(int num_filtrado1, int num_filtrado2) {
        try {
            ModeloAnimales modAnimales = new ModeloAnimales();
            ArrayList<Animal> listaCon = modAnimales.getListadoCon(num_filtrado1, num_filtrado2);

            for (Animal an : listaCon) {
                modeloCombo.addElement(an.getNombre());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void ListadoNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadoNombresActionPerformed
        ListadoNombres.removeAllItems();
        if (ListadoNombres.getSelectedItem() == null) {
            
            switch (num_filtrado1) {
                case 1:
                    ListarNombresAves(num_filtrado2, num_filtrado3);
                    break;
                case 2:
                    ListarNombresMamiferos(num_filtrado2, num_filtrado3);
                    break;
                case 3:
                    ListarNombresReptiles(num_filtrado2, num_filtrado3);
                    break;
                default:
                    System.out.println("filtrado1 no usado");
                    break;
            }
            switch (num_filtrado2) {
                case 1:
                    ListadoLeve(num_filtrado1, num_filtrado3);
                    break;
                case 2:
                    ListadoModerado(num_filtrado1, num_filtrado3);
                    break;
                case 3:
                    ListadoGrave(num_filtrado1, num_filtrado3);
                    break;
                default:
                    System.out.println("filtrado2 no usado");
                    break;
            }
            switch (num_filtrado3) {
                case 1:
                    ListadoCon(num_filtrado1, num_filtrado2);
                    break;
                case 2:
                    ListadoSin(num_filtrado1, num_filtrado2);
                    break;
                default:
                    System.out.println("filtrado3 no usado");
                    break;
            }
            establecerPrimerValor(ListadoNombres);
        }
    }//GEN-LAST:event_ListadoNombresActionPerformed

    private void establecerPrimerValor(javax.swing.JComboBox comboBox) {
            comboBox.setSelectedIndex(0);
        
    }

    int num_filtrado2;
    private void Filtrado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filtrado2ActionPerformed
        num_filtrado2=0;
        if (!Filtrado2.getSelectedItem().equals("Seleccionar...")) {
            if (Filtrado2.getSelectedItem().equals("Leve")) {
                num_filtrado2 = 1;
            } else if (Filtrado2.getSelectedItem().equals("Moderado")) {
                num_filtrado2 = 2;
            } else if (Filtrado2.getSelectedItem().equals("Grave")) {
                num_filtrado2 = 3;
            }

        }
    }//GEN-LAST:event_Filtrado2ActionPerformed

    boolean PrimerClick = true;
    private void jTratamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTratamientoMouseClicked
        if (PrimerClick) {
            jTratamiento.setText("");
            PrimerClick = false;
        }
    }//GEN-LAST:event_jTratamientoMouseClicked

    int num_filtrado3;
    private void Filtrado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filtrado3ActionPerformed
            num_filtrado3=0;
        if (!Filtrado3.getSelectedItem().equals("Seleccionar...")) {
            if (Filtrado3.getSelectedItem().equals("Con tratamiento")) {
                num_filtrado3 = 1;
            } else if (Filtrado3.getSelectedItem().equals("Sin tratamiento")) {
                num_filtrado3 = 2;
            }

        }
    }//GEN-LAST:event_Filtrado3ActionPerformed
//aqui filtrado1
    private void jTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTratamientoActionPerformed
    }//GEN-LAST:event_jTratamientoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Filtrado1;
    private javax.swing.JComboBox<String> Filtrado2;
    private javax.swing.JComboBox<String> Filtrado3;
    private javax.swing.JComboBox<String> ListadoNombres;
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTratamiento;
    private javax.swing.JButton llenarCombo;
    // End of variables declaration//GEN-END:variables
}
