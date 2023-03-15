/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package FramesYpaneles;
import DAO.ControlComentariosRatings;
import Negocio.Cliente;
import Negocio.Usuario;
import java.awt.event.ItemEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class ComentariosYRating extends javax.swing.JPanel {
    ControlComentariosRatings control = new ControlComentariosRatings();
    DefaultTableModel modelo; 
    /**
     * Creates new form PanComentariosYRatingEmpleados
     */
    public ComentariosYRating() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jText_Comentario = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAmbos = new javax.swing.JTable();
        btnGuardarComentariosEmpleado = new javax.swing.JButton();
        boxCalificacion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        boxTipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jText_Comentario.setColumns(20);
        jText_Comentario.setRows(5);
        jScrollPane2.setViewportView(jText_Comentario);

        TableAmbos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TableAmbos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableAmbosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableAmbos);

        btnGuardarComentariosEmpleado.setText("Guardar");
        btnGuardarComentariosEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarComentariosEmpleadoActionPerformed(evt);
            }
        });

        boxCalificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5 Estrellas", "4 Estrellas", "3 Estrellas", "2 Estrellas", "1 Estrella" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Calificacion:");

        jLabel2.setText("De Click para seleccionar y calificar");

        jLabel4.setText("Comentario:");

        boxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Empleado", "Cliente" }));
        boxTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxTipoItemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Tipo:");

        jLabel6.setText("id:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_id, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addGap(237, 237, 237))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarComentariosEmpleado)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardarComentariosEmpleado)))
                .addContainerGap(212, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarComentariosEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarComentariosEmpleadoActionPerformed
        if (this.boxTipo.getSelectedItem().equals("Empleado")) {
               ComentarioYCalificacionEmpleado();
               limpíarCampos();
            }else if(this.boxTipo.getSelectedItem().equals("Cliente")){
               ComentarioYCalificacionClientes();
               limpíarCampos();
            }else if(this.boxTipo.getSelectedItem().equals("Seleccionar")){
               ComentarioYCalificacionSeleciconar();
               limpíarCampos();
            }
        
        
        
    }//GEN-LAST:event_btnGuardarComentariosEmpleadoActionPerformed

    private void boxTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxTipoItemStateChanged
        if (evt.getStateChange()==ItemEvent.SELECTED) {
            if (this.boxTipo.getSelectedItem().equals("Empleado")) {
            consultarEmpleados();
            }else if(this.boxTipo.getSelectedItem().equals("Cliente")){
            consultarClientes();
            }else if(this.boxTipo.getSelectedItem().equals("Seleccionar")){
            consultarSeleccionar();
            }
        }
        
        
        
    }//GEN-LAST:event_boxTipoItemStateChanged

    private void TableAmbosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableAmbosMouseClicked
        int fila = TableAmbos.getSelectedRow();
        limpíarCampos();
        
        if (this.boxTipo.getSelectedItem().equals("Empleado")) {
        if (fila != -1) {
            txt_id.setText(TableAmbos.getValueAt(fila, 0).toString());
            
            try {
            if (TableAmbos.getValueAt(fila, 7).toString().equals("1 Estrella")) {
             boxCalificacion.setSelectedIndex(4);
            }else if(TableAmbos.getValueAt(fila, 7).toString().equals("2 Estrellas")){
              boxCalificacion.setSelectedIndex(3);
            }else if(TableAmbos.getValueAt(fila, 7).toString().equals("3 Estrellas")){
             boxCalificacion.setSelectedIndex(2);
            }else if(TableAmbos.getValueAt(fila, 7).toString().equals("4 Estrellas")){
            boxCalificacion.setSelectedIndex(1);
            }else if(TableAmbos.getValueAt(fila, 7).toString().equals("5 Estrellas")){
             boxCalificacion.setSelectedIndex(0);
            }
            
            jText_Comentario.setText(TableAmbos.getValueAt(fila, 6).toString());
          
            } catch (java.lang.NullPointerException e) {
            }
        }
        
        
            }else if(this.boxTipo.getSelectedItem().equals("Cliente")){
                if (fila != -1) {
            txt_id.setText(TableAmbos.getValueAt(fila, 0).toString());
            
            try {
            if (TableAmbos.getValueAt(fila, 8).toString().equals("1 Estrella")) {
             boxCalificacion.setSelectedIndex(4);
            }else if(TableAmbos.getValueAt(fila, 8).toString().equals("2 Estrellas")){
              boxCalificacion.setSelectedIndex(3);
            }else if(TableAmbos.getValueAt(fila, 8).toString().equals("3 Estrellas")){
             boxCalificacion.setSelectedIndex(2);
            }else if(TableAmbos.getValueAt(fila, 8).toString().equals("4 Estrellas")){
            boxCalificacion.setSelectedIndex(1);
            }else if(TableAmbos.getValueAt(fila, 8).toString().equals("5 Estrellas")){
             boxCalificacion.setSelectedIndex(0);
            }
            
            jText_Comentario.setText(TableAmbos.getValueAt(fila, 7).toString());
          
            } catch (java.lang.NullPointerException e) {
            }
        }
                
                

            }
        
        
    }//GEN-LAST:event_TableAmbosMouseClicked
    
public void consultarEmpleados(){
    modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Email");
        modelo.addColumn("Telefono");
        modelo.addColumn("Tipo");
        modelo.addColumn("Comentarios");
        modelo.addColumn("Calificacion");
        this.TableAmbos.setModel(modelo);
    
     List<Usuario> list = control.listarUsuarios();
        DefaultTableModel model= (DefaultTableModel) TableAmbos.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
          model.removeRow(i);
        }
        Object rowData[]=new Object[8];
        for(int i=0; i<list.size();i++){
            rowData[0]=list.get(i).id;
            rowData[1]=list.get(i).nombres;
            rowData[2]=list.get(i).apellidos;
            rowData[3]=list.get(i).email;
            rowData[4]=list.get(i).telefono;
            rowData[5]=list.get(i).tipo;
            rowData[6]=list.get(i).comentarios;
            rowData[7]=list.get(i).calificacion;
            model.addRow(rowData);
        } 
  }

public void consultarClientes(){
    modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Empresa");
        modelo.addColumn("Email");
        modelo.addColumn("Telefono");
        modelo.addColumn("Rfc");
        modelo.addColumn("Comentarios");
        modelo.addColumn("Calificacion");
        this.TableAmbos.setModel(modelo);
    
       List<Cliente> list = control.listarClientes();
        DefaultTableModel model= (DefaultTableModel) TableAmbos.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
          model.removeRow(i);
        }
        Object rowData[]=new Object[9];
        for(int i=0; i<list.size();i++){
            rowData[0]=list.get(i).id;
            rowData[1]=list.get(i).nombres;
            rowData[2]=list.get(i).apellidos;
            rowData[3]=list.get(i).empresa;
            rowData[4]=list.get(i).email;
            rowData[5]=list.get(i).telefono;
            rowData[6]=list.get(i).rfc;
            rowData[7]=list.get(i).comentarios;
            rowData[8]=list.get(i).calificacion;
            model.addRow(rowData);
        }
  }

public void consultarSeleccionar(){
        modelo = new DefaultTableModel();
        modelo.addColumn("");
        this.TableAmbos.setModel(modelo);
}

public void ComentarioYCalificacionEmpleado(){
            Usuario usuario = new Usuario();
            usuario.setId(Integer.parseInt(txt_id.getText()));
            usuario.setComentarios(jText_Comentario.getText());
            usuario.setCalificacion(boxCalificacion.getSelectedItem().toString());
            
        if(control.CalificarYComentarUsuario(usuario)){
           JOptionPane.showMessageDialog(null, "Se Califico con exito al Empleado", "Empleado", JOptionPane.INFORMATION_MESSAGE);
        }else{
           JOptionPane.showMessageDialog(null, "Fallo al Calificar", "Empleado", JOptionPane.INFORMATION_MESSAGE);
        }
        consultarEmpleados();
}
    

public void ComentarioYCalificacionClientes(){
            Cliente cliente = new Cliente();
            cliente.setId(Integer.parseInt(txt_id.getText()));
            cliente.setComentarios(jText_Comentario.getText());
            cliente.setCalificacion(boxCalificacion.getSelectedItem().toString());
            

        if(control.CalificarYComentarCliente(cliente)){
           JOptionPane.showMessageDialog(null, "Se Califico con exito al Cliente", "Cliente", JOptionPane.INFORMATION_MESSAGE);
        }else{
           JOptionPane.showMessageDialog(null, "Fallo al Calificar", "Cliente", JOptionPane.INFORMATION_MESSAGE);
        }
        consultarClientes();
}

public void ComentarioYCalificacionSeleciconar(){
JOptionPane.showMessageDialog(null, "Favor de seleccionar al tipo de persona que quiera calificar", "Seleccione", JOptionPane.INFORMATION_MESSAGE);
}
 private void limpíarCampos() {
        this.txt_id.setText("");
        this.jText_Comentario.setText("");
        this.boxCalificacion.setSelectedIndex(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableAmbos;
    private javax.swing.JComboBox<String> boxCalificacion;
    private javax.swing.JComboBox<String> boxTipo;
    private javax.swing.JButton btnGuardarComentariosEmpleado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jText_Comentario;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables

   

    
}