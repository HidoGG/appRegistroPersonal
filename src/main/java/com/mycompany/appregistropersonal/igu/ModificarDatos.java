
package com.mycompany.appregistropersonal.igu;

import com.mycompany.appregistropersonal.logica.Controlador;
import com.mycompany.appregistropersonal.logica.Persona;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class ModificarDatos extends javax.swing.JFrame {
    
    Controlador control = null;
    int Num_persona;
    Persona perso; 
  
    public ModificarDatos( int Num_persona) {
        control = new Controlador();
        //this.Num_persona = Num_persona;
        initComponents();
        cargarDatos(Num_persona);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtCuil = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        cmbCategoria = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtApellido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel9.setText("RP - Modificación de Datos ");

        jLabel10.setText("Nombre");

        jLabel11.setText("Apellido");

        jLabel12.setText("DNI");

        jLabel13.setText("CUIL");

        jLabel14.setText("Categoria");

        jLabel15.setText("Sueldo");

        jLabel16.setText("Observación");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        txtCuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuilActionPerformed(evt);
            }
        });

        txtSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoActionPerformed(evt);
            }
        });

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Contratado", "Planta permanente" }));
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\gabriel\\Desktop\\JavaProjectoV1\\limpieza-de-datos (2).png")); // NOI18N
        btnLimpiar.setText(" Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\gabriel\\Desktop\\JavaProjectoV1\\guardar (1) (1).png")); // NOI18N
        btnGuardar.setText(" Guardar Cambios");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel9))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCuil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(txtDni, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtSueldo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCuil, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 378, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtCuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuilActionPerformed

    private void txtSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        //Limpia los datos en Carga de Datos
        txtNombre.setText("");
        txtApellido.setText("");
        txtDni.setText("");
        txtCuil.setText("");
        cmbCategoria.setSelectedIndex(0);
        txtSueldo.setText("");
        txtObservaciones.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        
        //Variables aux. Datos de la persona
        String nombrePersona = txtNombre.getText();
        String apellidoPersona = txtApellido.getText();
        String dniPersona = txtDni.getText();
        String cuitPersona = txtCuil.getText();
        String cbmCategoriaPersona = (String) cmbCategoria.getSelectedItem();
        String sueldoPersona = txtSueldo.getText();
        String observaPersona = txtObservaciones.getText();
        
        control.modificarPersona(perso, nombrePersona, apellidoPersona, dniPersona, cuitPersona,
                cbmCategoriaPersona, sueldoPersona, observaPersona);
        
        //Mensaje
        if (nombrePersona.equals("") || apellidoPersona.equals("") || dniPersona.equals("") || cuitPersona.equals("") || 
                cbmCategoriaPersona.equals("-") || sueldoPersona.equals("") || observaPersona.equals("")){
            mostrarMensaje("Falto completar campos", "Error", "Error de Guardado");
        }else {
            mostrarMensaje("Edición realizada correctamente", "Info", "Edición correcta");
            
            VerDatos pantalla = new VerDatos();
            pantalla.setVisible(true);
            pantalla.setLocationRelativeTo(null);
        
            //Cierro ventana
            this.dispose();
        }
        
        
        
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoriaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCuil;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int Num_persona) {
        
        this.perso= control.traerPersona(Num_persona);
        
        txtNombre.setText(perso.getNombre());
        txtApellido.setText(perso.getApellido());
        txtDni.setText(perso.getDNI());
        txtCuil.setText(perso.getCUIL());
        txtSueldo.setText(perso.getSueldo());
        txtObservaciones.setText(perso.getObservacon());
        
        if (perso.getCategoria().equals("Contratado")){
            cmbCategoria.setSelectedIndex(1);
        }
        else{
            if (perso.getCategoria().equals("Planta permanente")){
                cmbCategoria.setSelectedIndex(2);
            }
        }
        
        
            
    }
    
    public void mostrarMensaje(String mensaje, String tipo, String titulo){
        
        //Panel de opciones, agrega el mensaje
        JOptionPane optionPane = new JOptionPane(mensaje);
            //Tipo de mensaje que quiero
            if(tipo.equals("Info")){
                optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            }
            else if (tipo.equals("Error")){
                optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
            }
        
        //Tipo de pantalla y Titulo superior de la ventana
        JDialog dialog = optionPane.createDialog(titulo);
        //Siempre arriba
        dialog.setAlwaysOnTop(true);
        //Siemrpe visible
        dialog.setVisible(true);
    }
    
}
