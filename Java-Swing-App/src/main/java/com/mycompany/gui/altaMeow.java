/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.gui;

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
        jButton2 = new javax.swing.JButton();
        aveBoton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        contenedor.setBackground(new java.awt.Color(191, 172, 200));
        contenedor.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));

        mamBoton.setText("Mamífero");
        mamBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mamBotonActionPerformed(evt);
            }
        });

        jButton2.setText("Reptil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                .addGap(45, 45, 45)
                .addComponent(aveBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(mamBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aveBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mamBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(245, Short.MAX_VALUE))
        );

        contenedor.add(jPanel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 180, Short.MAX_VALUE)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 80, Short.MAX_VALUE)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
   avePanel f = new avePanel();
    private void mamBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mamBotonActionPerformed
                                              
      
      
        


                                            
  
    }//GEN-LAST:event_mamBotonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mamBoton;
    // End of variables declaration//GEN-END:variables
}