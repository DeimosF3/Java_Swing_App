/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.gui;

import com.mycompany.guiUtils.Utilities;

/**
 *
 * @author Alumno
 */
public class altaMeow extends javax.swing.JPanel {

    /**
     * Creates new form altaMeow
     */
    public altaMeow() {
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
        jPanel1 = new javax.swing.JPanel();
        mamBoton = new javax.swing.JButton();
        reptilBoton = new javax.swing.JButton();
        aveBoton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedor.setBackground(new java.awt.Color(191, 172, 200));
        contenedor.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(191, 172, 200));

        mamBoton.setText("Mamifero");
        mamBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mamBotonActionPerformed(evt);
            }
        });

        reptilBoton.setText("Reptil");
        reptilBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reptilBotonActionPerformed(evt);
            }
        });

        aveBoton.setText("Ave");
        aveBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aveBotonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel1.setText("Seleccione el tipo de animal:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(aveBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(mamBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(reptilBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aveBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mamBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reptilBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(245, Short.MAX_VALUE))
        );

        contenedor.add(jPanel1, java.awt.BorderLayout.CENTER);

        add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
   avePanel f = new avePanel();
    mamiferoPanel m = new mamiferoPanel();
    reptilPanel r = new reptilPanel();
    private void mamBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mamBotonActionPerformed
        System.out.println("asd");
        contenedor.removeAll();
        contenedor.add(m);

       

        // Repinta el contenedor para actualizar la interfaz gráfica
        contenedor.repaint();
         // Revalida el contenedor para que los cambios se apliquen correctamente
        contenedor.revalidate();

    }//GEN-LAST:event_mamBotonActionPerformed

    private void reptilBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reptilBotonActionPerformed
            System.out.println("asd");
        contenedor.removeAll();
        contenedor.add(r);

        // Revalida el contenedor para que los cambios se apliquen correctamente
        contenedor.revalidate();

        // Repinta el contenedor para actualizar la interfaz gráfica
        contenedor.repaint();
    }//GEN-LAST:event_reptilBotonActionPerformed

    private void aveBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aveBotonActionPerformed
        System.out.println("asd");
        contenedor.removeAll();
        contenedor.add(f);

        // Revalida el contenedor para que los cambios se apliquen correctamente
        contenedor.revalidate();

        // Repinta el contenedor para actualizar la interfaz gráfica
        contenedor.repaint();
    }//GEN-LAST:event_aveBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aveBoton;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mamBoton;
    private javax.swing.JButton reptilBoton;
    // End of variables declaration//GEN-END:variables
}
