/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.gui;

import com.mycompany.classes.Animal;
import com.mycompany.classes.Ave;
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
 * @author Alumno
 */
public class bajaPanel extends javax.swing.JPanel {

    /**
     * Creates new form bajaPanel
     */
    public bajaPanel() {
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

        jPanel1 = new javax.swing.JPanel();
        contenedor = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        filtrado1 = new javax.swing.JComboBox<>();
        filtrarBoton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        listadoNombres = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        fechaText = new java.awt.TextField();
        enviar_button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        contenedor.setBackground(new java.awt.Color(191, 172, 200));
        contenedor.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(191, 172, 200));

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel1.setText("Apartado Baja:");

        jLabel2.setText("Seleccione los filtros de busqueda:");

        filtrado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Aves", "Mamiferos", "Reptiles" }));
        filtrado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrado1ActionPerformed(evt);
            }
        });

        filtrarBoton.setText("Filtrar");
        filtrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarBotonActionPerformed(evt);
            }
        });

        jLabel3.setText("Animales que coinciden con los criterios de busqueda: ");

        listadoNombres.setModel(modeloCombo);
        listadoNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoNombresActionPerformed(evt);
            }
        });

        jLabel4.setText("Indique la fecha de salida del animal:");

        fechaText.setText("“AAAA-MM-DD\"");
        fechaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaTextActionPerformed(evt);
            }
        });

        enviar_button.setText("Actualizar");
        enviar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_buttonActionPerformed(evt);
            }
        });

        jLabel5.setText("Indique el veterinario encargado del certificado de defunción del animal:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 378, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(filtrado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(filtrarBoton))
                        .addComponent(fechaText, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listadoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(enviar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtrado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtrarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listadoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(enviar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        contenedor.add(jPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
  DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();

    String tipo;

    private void guardarDatos() {

    }

    private void borrarDatos() {

    }
    private void filtrado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrado1ActionPerformed
        if (!filtrado1.getSelectedItem().equals("Seleccionar...")) {
            if (filtrado1.getSelectedItem().equals("Aves")) {
                num_filtrado1 = 1;
                tipo = "aves";
            } else if (filtrado1.getSelectedItem().equals("Mamiferos")) {
                tipo = "mamiferos";
                num_filtrado1 = 2;
            } else if (filtrado1.getSelectedItem().equals("Reptiles")) {
                tipo = "reptiles";
                num_filtrado1 = 3;
            }

        }

    }//GEN-LAST:event_filtrado1ActionPerformed
    private void establecerPrimerValor(javax.swing.JComboBox comboBox) {
        comboBox.setSelectedIndex(0);

    }
    private void filtrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarBotonActionPerformed

        listadoNombres.removeAllItems();

        switch (num_filtrado1) {
            case 1 -> {
                ListarNombresAves();
                establecerPrimerValor(filtrado1);
            }
            case 2 -> {
                ListarNombresMamiferos();
                establecerPrimerValor(filtrado1);
            }
            case 3 -> {
                ListarNombresReptiles();
                establecerPrimerValor(filtrado1);
            }
            default ->
                System.out.println("filtrado1 no usado");
        }
    }//GEN-LAST:event_filtrarBotonActionPerformed
    int num_filtrado1;
    private void listadoNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoNombresActionPerformed
        if (listadoNombres.getSelectedItem() == null) {
            modeloCombo.removeAllElements();
            switch (num_filtrado1) {
                case 1:
                    ListarNombresAves();
                    break;
                case 2:
                    ListarNombresMamiferos();
                    break;
                case 3:
                    ListarNombresReptiles();
                    break;
                default:
                    System.out.println("filtrado1 no usado");
                    break;
            }
            establecerPrimerValor(listadoNombres);
    }//GEN-LAST:event_listadoNombresActionPerformed
    }
    private void fechaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaTextActionPerformed
    public void ListarNombresAves() {
        try {
            ModeloAnimales modAnimales = new ModeloAnimales();
            ArrayList<Ave> listaAnimales = modAnimales.getNombresAves();

            for (Animal animal : listaAnimales) {
                modeloCombo.addElement(animal.getNombre());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ListarNombresMamiferos() {
        try {
            ModeloAnimales modAnimales = new ModeloAnimales();
            ArrayList<Mamifero> listaMamiferos = modAnimales.getNombresMamiferos();

            for (Mamifero mam : listaMamiferos) {
                modeloCombo.addElement(mam.getNombre());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ListarNombresReptiles() {
        try {
            ModeloAnimales modAnimales = new ModeloAnimales();
            ArrayList<Reptil> listaReptiles = modAnimales.getNombresReptiles();

            for (Reptil rep : listaReptiles) {
                modeloCombo.addElement(rep.getNombre());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void enviar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_buttonActionPerformed
        guardarDatos();
        borrarDatos();
    }//GEN-LAST:event_enviar_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton enviar_button;
    private java.awt.TextField fechaText;
    private javax.swing.JComboBox<String> filtrado1;
    private javax.swing.JButton filtrarBoton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> listadoNombres;
    // End of variables declaration//GEN-END:variables
}
