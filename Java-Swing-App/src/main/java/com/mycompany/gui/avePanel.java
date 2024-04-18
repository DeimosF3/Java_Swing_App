@ -50,7 +50,7 @@ public class avePanel extends javax.swing.JPanel {
    CF_false = new javax.swing.JCheckBox();
    enviar_button = new javax.swing.JButton();
    jLabel4 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();

    jPanel3.setBackground(new java.awt.Color(204, 255, 153));

@ -147,6 +147,7 @@ public class avePanel extends javax.swing.JPanel {
                .addComponent(gravedad_Ave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7)
                .addComponent(jLabel8)
<<<<<<< Updated upstream
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
@ -166,6 +167,27 @@ public class avePanel extends javax.swing.JPanel {
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(enviar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(610, Short.MAX_VALUE))
=======
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(CF_true)
                                .addGap(18, 18, 18)
                                .addComponent(CF_false))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enviar_button))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(especie_Ave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addComponent(peso_Ave, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lesion_Ave, javax.swing.GroupLayout.Alignment.LEADING)))
            .addContainerGap(426, Short.MAX_VALUE))
>>>>>>> Stashed changes
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
@ -189,6 +211,7 @@ public class avePanel extends javax.swing.JPanel {
            .addComponent(jLabel7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(gravedad_Ave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< Updated upstream
            .addGap(56, 56, 56)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel9)
@ -198,6 +221,21 @@ public class avePanel extends javax.swing.JPanel {
                .addComponent(CF_true)
                .addComponent(CF_false))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
=======
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CF_true)
                        .addComponent(CF_false)))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(enviar_button)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(26, 26, 26)
>>>>>>> Stashed changes
            .addComponent(jLabel8)
            .addGap(148, 148, 148))
    );
@ -205,12 +243,18 @@ public class avePanel extends javax.swing.JPanel {
    jLabel4.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
    jLabel4.setText("Apartado Aves");

<<<<<<< Updated upstream
    jLabel10.setText("FurryFriends");
=======
    jLabel11.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
    jLabel11.setText("FurryFriends");
>>>>>>> Stashed changes

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< Updated upstream
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGap(61, 61, 61)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
@ -218,14 +262,33 @@ public class avePanel extends javax.swing.JPanel {
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(577, Short.MAX_VALUE))
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
=======
        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(78, 78, 78)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(80, 80, 80))
>>>>>>> Stashed changes
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
<<<<<<< Updated upstream
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
=======
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(6, 6, 6)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
>>>>>>> Stashed changes
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
@ -264,6 +327,7 @@ boolean primerClicE = true;
    if (primerClicP) {
        peso_Ave.setText("");
        primerClicP = false;
        
    }
}//GEN-LAST:event_peso_AveMouseClicked

@ -279,7 +343,8 @@ boolean primerClicE = true;
}//GEN-LAST:event_lesion_AveMouseClicked

private void lesion_AveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lesion_AveActionPerformed
    // TODO add your handling code here:
    lesion_Ave.getText();
    System.out.println(lesion_Ave);
}//GEN-LAST:event_lesion_AveActionPerformed

private void gravedad_AveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravedad_AveActionPerformed
@ -304,6 +369,7 @@ boolean primerClicE = true;
    borrarDatos();
    guardarDatos();
}//GEN-LAST:event_enviar_buttonActionPerformed
<<<<<<< Updated upstream

public void guardarDatos() {
if (validarSeleccion()) { 
@ -318,6 +384,19 @@ public void guardarDatos() {
        validarTexto(lesion);
        String gravedad = (String) gravedad_Ave.getSelectedItem();
        boolean cazaFurtiva;
=======
                                      
boolean botones_CF = false;
public void guardarDatos() {
//hacer metodo comprobar que si tienen el mismo valor CF_true y CF_false devuelva un boolean false y que no deje gaurdar los valores///if(){resto del codigo}ç
if(botones_CF){
String nombre = nombre_Ave.getText();
String especie = especie_Ave.getText();
String peso = peso_Ave.getText();
String lesion = lesion_Ave.getText();
String gravedad = (String) gravedad_Ave.getSelectedItem();
boolean cazaFurtiva; // Variable para almacenar si la caza furtiva está seleccionada
>>>>>>> Stashed changes

        if (CF_true.isSelected()) {
            cazaFurtiva = true;
@ -325,7 +404,6 @@ public void guardarDatos() {
            cazaFurtiva = false;
        }
        
        // Aquí deberías hacer algo con los datos recolectados, como guardarlos en alguna estructura de datos o enviarlos a otra parte del programa.
        
    } catch (IllegalArgumentException e) {
       JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
@ -333,8 +411,19 @@ public void guardarDatos() {
} else {
    JOptionPane.showMessageDialog(null, "Por favor, seleccione una opción válida.", "Error", JOptionPane.ERROR_MESSAGE);
}
}
}
public boolean validarSeleccion(boolean botones_CF) {
if (CF_true.isSelected() && CF_false.isSelected()) {
    return false;
} else if(!CF_true.isSelected() && !CF_false.isSelected()) {
    return false; 
} else{
     return botones_CF=true;
}
}



public void validarNumero(String texto) {
if (!texto.matches("\\d*\\.?\\d+")) {
@ -378,7 +467,7 @@ public boolean validarSeleccion() {
private javax.swing.JButton enviar_button;
private javax.swing.JTextField especie_Ave;
private javax.swing.JComboBox<String> gravedad_Ave;
private javax.swing.JLabel jLabel10;
private javax.swing.JLabel jLabel11;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel4;
