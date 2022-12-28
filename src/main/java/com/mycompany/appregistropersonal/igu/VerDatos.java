
package com.mycompany.appregistropersonal.igu;

import com.mycompany.appregistropersonal.logica.Controlador;
import com.mycompany.appregistropersonal.logica.Persona;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VerDatos extends javax.swing.JFrame {
    
    Controlador control = null;
    
    public VerDatos() {
        control = new Controlador();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersona = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("RP - Visualización de Datos");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaPersona);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Datos del Personal ");

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\gabriel\\Desktop\\JavaProjectoV1\\basura (3).png")); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\gabriel\\Desktop\\JavaProjectoV1\\curriculum (1).png")); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        cargarTabla();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        //Cuanta las tablas, tiene que ser mayor a 0
        if(tablaPersona.getRowCount() > 0) {
            //Seleccionado almenos una fila 
            if (tablaPersona.getSelectedRow() != -1){
                //Obtengo la Legajo a eliminar
                
                //Traer y asignar el numero depersona, el valor en la tabla persona que este ubicado en la columna 0 
                //de la fila seleccionada 
                int Num_persona = Integer.parseInt(String.valueOf(tablaPersona.getValueAt(tablaPersona.getSelectedRow(), 0)));
                
                //Llamo al método Eliminar
                control.borrarPersona(Num_persona);
                
                //Aviso al usuario que se elimino correctamente
                mostrarMensaje("Persona eliminada correctamente", "Info", "Eliminación de Persona");
                
                //Carga nuevamente la tabla, para que desaparesca la persona eliminada
                cargarTabla();
                
            }
            else {
                mostrarMensaje("No seleccionó ningun registro", "Error", "Error al Eliminar");
            }    
        }
        else {
            mostrarMensaje("No hay nada para eliminar en la tabla ", "Error", "Error al Eliminar");
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        //Cuanta las tablas, tiene que ser mayor a 0
        if(tablaPersona.getRowCount() > 0) {
            //Seleccionado almenos una fila 
            if (tablaPersona.getSelectedRow() != -1){
                //Obtengo la Legajo a editar
                
                //Traer y asignar el numero depersona, el valor en la tabla persona que este ubicado en la columna 0 
                //de la fila seleccionada 
                int Num_persona = Integer.parseInt(String.valueOf(tablaPersona.getValueAt(tablaPersona.getSelectedRow(), 0)));
                
                ModificarDatos pantallaModif = new ModificarDatos(Num_persona);
                pantallaModif.setVisible(true);
                pantallaModif.setLocationRelativeTo(null);
                
                //Se cierre la ventana
                this.dispose();
                
                
            }
            else {
                mostrarMensaje("No seleccionó ningun registro", "Error", "Error de edición");
            }    
        }
        else {
            mostrarMensaje("No hay nada para editar en la tabla ", "Error", "Error de edición");
        }
        
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPersona;
    // End of variables declaration//GEN-END:variables

   
    public void cargarTabla() {
        
        //Modelo de tabla 
        //Esta clase, nos permite establecer un modelo para la table,
        //nos permite por codigo, personalizar la tabla.
       
        
        
        DefaultTableModel modeloTabla = new DefaultTableModel(){
             
            //No permitir que las filas y columnas sean editabes 
            @Override
            public boolean isCellEditable(int row,int column){
                return false;
            }
            
        };
        
        
        
        //Nombres de Columnas, lo creamos con vector
        String titulos[] = {"Legajo","Nombre","Apellido", "DNI", "CUIL","Categoria","Sueldo"};
        //Se crean los nombres de las columnas
        modeloTabla.setColumnIdentifiers(titulos);
        
        //Carga de datos, desde la BD
        List <Persona> listaPersona = control.traerPersona();
        
        //Recorre la lista y mostrar cada uno de los elementos en la tabla 
        if (listaPersona != null) {
            for (Persona perso : listaPersona) {
                //Utiliso object, porque me permite mesclar tipos de datos
                Object[] objeto = {perso.getNum_persona(),perso.getNombre(), perso.getApellido(), perso.getDNI(),
                perso.getCUIL(), perso.getCategoria(), perso.getSueldo()};
                
                modeloTabla.addRow(objeto);
            }
        }
        
        tablaPersona.setModel(modeloTabla);
        
    }
}
