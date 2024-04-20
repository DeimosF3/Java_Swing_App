/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.gui;

import com.mycompany.classes.Fachada;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class mamiferoPanel extends javax.swing.JPanel {

    /**
     * Creates new form mamiferoPanel
     */
    public mamiferoPanel() {
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
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nombre_Ave = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        especie_Ave = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        peso_Ave = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lesion_Ave = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        gravedad_Ave = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CF_true = new javax.swing.JCheckBox();
        CF_false = new javax.swing.JCheckBox();
        enviar_button = new javax.swing.JButton();
        regresarBoton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        contenedor.setBackground(new java.awt.Color(191, 172, 200));
        contenedor.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("             Apartado Mamiferos:");
        contenedor.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(191, 172, 200));
        jPanel3.setPreferredSize(new java.awt.Dimension(620, 420));

        jScrollPane1.setViewportView(nombre_Ave);

        jLabel2.setText("Nombre:");

        jLabel3.setText("Especie:");

        especie_Ave.setText("Ej: oso pardo, zorro");
        especie_Ave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                especie_AveMouseClicked(evt);
            }
        });
        especie_Ave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especie_AveActionPerformed(evt);
            }
        });

        jLabel5.setText("Peso(kg):");

        peso_Ave.setText("En kilogramos");
        peso_Ave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peso_AveMouseClicked(evt);
            }
        });
        peso_Ave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peso_AveActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo de lesión:");

        lesion_Ave.setText("Ej.: Herida abierta");
        lesion_Ave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lesion_AveMouseClicked(evt);
            }
        });
        lesion_Ave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lesion_AveActionPerformed(evt);
            }
        });

        jLabel7.setText("Gravedad:");

        gravedad_Ave.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Leve", "Moderada", "Grave" }));
        gravedad_Ave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravedad_AveActionPerformed(evt);
            }
        });

        jLabel9.setText("¿El motivo de la lesión ha sido provocado por atropello?");

        CF_true.setText("Sí");
        CF_true.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CF_trueMouseClicked(evt);
            }
        });
        CF_true.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CF_trueActionPerformed(evt);
            }
        });

        CF_false.setText("No");
        CF_false.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CF_falseActionPerformed(evt);
            }
        });

        enviar_button.setText("Enviar");
        enviar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_buttonActionPerformed(evt);
            }
        });

        regresarBoton.setBackground(new java.awt.Color(255, 0, 51));
        regresarBoton.setForeground(new java.awt.Color(255, 255, 255));
        regresarBoton.setText("Regresar");
        regresarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gravedad_Ave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(especie_Ave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                        .addComponent(peso_Ave, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lesion_Ave, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(CF_true)
                                    .addGap(18, 18, 18)
                                    .addComponent(CF_false))
                                .addComponent(jLabel9))
                            .addGap(43, 43, 43)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(enviar_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(regresarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(especie_Ave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(peso_Ave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lesion_Ave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gravedad_Ave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CF_true)
                            .addComponent(CF_false))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(enviar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(regresarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17)))
                .addComponent(jLabel8)
                .addGap(148, 148, 148))
        );

        contenedor.add(jPanel3, java.awt.BorderLayout.CENTER);

        jLabel10.setText("FurryFriends");
        contenedor.add(jLabel10, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void especie_AveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_especie_AveMouseClicked


        if (primerClicE) {
            especie_Ave.setText("");
            primerClicE = false;
        }
    }//GEN-LAST:event_especie_AveMouseClicked
boolean primerClicE = true;    boolean primerClicP = true;    boolean primerClicTdL = true;
public void guardarDatos() {
    if (validarSeleccion()) {
        try {
            String tratamiento = null;
            String nombre = nombre_Ave.getText();
            validarTexto(nombre);
            String especie = especie_Ave.getText();
            validarTexto(especie);
            String peso = peso_Ave.getText();
            validarNumero(peso);
            String lesion = lesion_Ave.getText();
            validarTexto(lesion);
            String gravedad = (String) gravedad_Ave.getSelectedItem();
            validarGravedad(gravedad);
            boolean cazaFurtiva= false;

            if (CF_true.isSelected()) {
                cazaFurtiva = true;
            } else if(CF_false.isSelected()){
                cazaFurtiva = false;
            }
            try{
            new Fachada().insertarAve(nombre, especie, peso, lesion, gravedad, tratamiento, cazaFurtiva);
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Error al dar de alta en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            
        } catch (IllegalArgumentException e) {
           JOptionPane.showMessageDialog(null, "Datos inválidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione una opción válida.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}


public void validarNumero(String texto) {
    if (!texto.matches("\\d*\\.?\\d+")) {
        throw new IllegalArgumentException("El valor ingresado no es un número válido.");
    }
}
public void validarGravedad(String gravedad) {
   if (gravedad.equals("Seleccionar")){
       throw new IllegalArgumentException("El valor ingresado no es una selección válido.");
   }
}

public void validarTexto(String texto) {
    if (!texto.matches("[a-zA-Z\\s]+")) {
        throw new IllegalArgumentException("El valor ingresado contiene caracteres no válidos. Por favor, utilice solo letras, espacios y no más de 20 carácteres.");
    } else if (texto.length()>20){
        throw new IllegalArgumentException("El valor ingresado contiene caracteres no válidos. Por favor, utilice solo letras, espacios y no más de 20 carácteres.");
    }
}

public boolean validarSeleccion() {
    if ( (CF_true.isSelected() && CF_false.isSelected()) || (!CF_true.isSelected() && !CF_false.isSelected()) ){
        return false;
    } else {
        return true;
    }
    
}




    public void borrarDatos() {
        nombre_Ave.setText("");
        especie_Ave.setText("Ej.: Oso pardo, Pantera");
        peso_Ave.setText("En kilogramos");
        lesion_Ave.setText("Ej.: Herdia abierta");
        DefaultComboBoxModel<String> modelo = (DefaultComboBoxModel<String>) gravedad_Ave.getModel();

        if (modelo.getSize() > 0) {
            gravedad_Ave.setSelectedItem(modelo.getElementAt(0));
        }
        CF_true.setSelected(false);
        CF_false.setSelected(false);
        primerClicTdL = true;
        primerClicE = true;
        primerClicP = true;
        
    }
    private void especie_AveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especie_AveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especie_AveActionPerformed

    private void peso_AveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peso_AveMouseClicked
        if (primerClicP) {
            peso_Ave.setText("");
            primerClicP = false;
        }
    }//GEN-LAST:event_peso_AveMouseClicked

    private void peso_AveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peso_AveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peso_AveActionPerformed

    private void lesion_AveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lesion_AveMouseClicked
        if (primerClicTdL) {
            lesion_Ave.setText("");
            primerClicTdL = false;
        }
    }//GEN-LAST:event_lesion_AveMouseClicked

    private void lesion_AveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lesion_AveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lesion_AveActionPerformed

    private void gravedad_AveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravedad_AveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gravedad_AveActionPerformed

    private void CF_trueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CF_trueMouseClicked

        CF_true.setSelected(true);
        CF_false.setSelected(false);
    }//GEN-LAST:event_CF_trueMouseClicked

    private void CF_trueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CF_trueActionPerformed

    }//GEN-LAST:event_CF_trueActionPerformed

    private void CF_falseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CF_falseActionPerformed
        CF_true.setSelected(false);
        CF_false.setSelected(true);
    }//GEN-LAST:event_CF_falseActionPerformed

    private void enviar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_buttonActionPerformed
        guardarDatos();
        borrarDatos();
    }//GEN-LAST:event_enviar_buttonActionPerformed

    private void regresarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBotonActionPerformed
        altaMeow dd = new altaMeow();
        System.out.println("asd");
        contenedor.removeAll();
        contenedor.add(dd);
        // Repinta el contenedor para actualizar la interfaz grafica
        contenedor.repaint();
        // Revalida el contenedor para que los cambios se apliquen correctamente
        contenedor.revalidate();
    }//GEN-LAST:event_regresarBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CF_false;
    private javax.swing.JCheckBox CF_true;
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton enviar_button;
    private javax.swing.JTextField especie_Ave;
    private javax.swing.JComboBox<String> gravedad_Ave;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lesion_Ave;
    private javax.swing.JTextPane nombre_Ave;
    private javax.swing.JTextField peso_Ave;
    private javax.swing.JButton regresarBoton;
    // End of variables declaration//GEN-END:variables
}
