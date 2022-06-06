/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package obligatorio2restoUIEscritorio;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import obligatorio2restoControladores.ControladorVistaMozo;
import obligatorio2restoControladores.InterfaceVistaMozo;
import obligatoriorestoLogica.Cliente;
import obligatoriorestoLogica.Mesa;
import obligatoriorestoLogica.MesaException;
import obligatoriorestoLogica.Mozo;
import obligatoriorestoLogica.Pedido;
import obligatoriorestoLogica.Producto;
import obligatoriorestoLogica.Transferencia;

/**
 *
 * @author tomas
 */
public class VistaMozo extends javax.swing.JFrame implements InterfaceVistaMozo {

    private Mozo mozo;
    private ControladorVistaMozo controlador;
    private Cliente cliente;
    private Mesa mesa;

    /**
     * Creates new form VistaMozo
     */
    public VistaMozo(Mozo mo) {
        initComponents();
        mozo = mo;
        controlador = new ControladorVistaMozo(this, mo);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMesa1 = new javax.swing.JLabel();
        jLabelMesa4 = new javax.swing.JLabel();
        jLabelMesa2 = new javax.swing.JLabel();
        jLabelMesa5 = new javax.swing.JLabel();
        jLabelMesa3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableServicio = new javax.swing.JTable();
        jButtonCerrarMesa = new javax.swing.JButton();
        jButtonTransferir = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonAbrirMesa = new javax.swing.JButton();
        jSpinnerCantidad = new javax.swing.JSpinner();
        jComboBoxProductos = new javax.swing.JComboBox<>();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxMesas = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableServicio);

        jButtonCerrarMesa.setText("Cerrar Mesa");
        jButtonCerrarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarMesaActionPerformed(evt);
            }
        });

        jButtonTransferir.setText("Transferir Mesa");
        jButtonTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransferirActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir del Sistema");

        jButtonAbrirMesa.setText("Abrir Mesa");
        jButtonAbrirMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirMesaActionPerformed(evt);
            }
        });

        jLabel6.setText("Productos");

        jLabel7.setText("Cantidad");

        jLabel8.setText("Descripcion");

        jButton4.setText("Agregar Producto");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Manejo de Clientes en Resto");

        jComboBoxMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMesasActionPerformed(evt);
            }
        });

        jLabel10.setText("Seleccionar Mesa:");

        jLabel1.setText("Pedidos Mesa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabelMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(93, 93, 93)
                                        .addComponent(jLabelMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBoxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(92, 92, 92)
                                        .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabelMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonCerrarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonAbrirMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel6)
                        .addGap(187, 187, 187)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel9)
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMesa3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jButtonAbrirMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCerrarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMesasActionPerformed
        mesa=(Mesa) jComboBoxMesas.getSelectedItem();
        mostrarPedidosMesa(mesa);
    }//GEN-LAST:event_jComboBoxMesasActionPerformed

    private void jButtonAbrirMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirMesaActionPerformed
        mesa=(Mesa) jComboBoxMesas.getSelectedItem();
        abrirMesa(mesa);
    }//GEN-LAST:event_jButtonAbrirMesaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Producto prod=(Producto)jComboBoxProductos.getSelectedItem();
        int cantidad=(Integer)jSpinnerCantidad.getValue();
        String descripcion=jTextFieldDescripcion.getText();
        controlador.verificarMesa(mesa);
        hacerPedido(prod,cantidad,descripcion,mesa);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonCerrarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarMesaActionPerformed
           if(!mesa.isEstadoMesa()){
               this.mostrarMensaje("La mesa no está abierta");
           }//else if(tiene pedido pendiente){
              // this.mostrarMensaje(“Tiene pedidos pendientes”);
          // }
           else if(cliente == null){
               this.mostrarMensaje("No se encontró al cliente");
           }else{
                new VistaCerrarMesa(null, false,mesa.getServicio(),cliente).setVisible(true);
           }
       
        
    }//GEN-LAST:event_jButtonCerrarMesaActionPerformed

    private void jButtonTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransferirActionPerformed
        transferirMesa();
    }//GEN-LAST:event_jButtonTransferirActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAbrirMesa;
    private javax.swing.JButton jButtonCerrarMesa;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonTransferir;
    private javax.swing.JComboBox<String> jComboBoxMesas;
    private javax.swing.JComboBox<String> jComboBoxProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMesa1;
    private javax.swing.JLabel jLabelMesa2;
    private javax.swing.JLabel jLabelMesa3;
    private javax.swing.JLabel jLabelMesa4;
    private javax.swing.JLabel jLabelMesa5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTable jTableServicio;
    private javax.swing.JTextField jTextFieldDescripcion;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cargarMesas(Mozo unMozo) {

        for (Mesa me : unMozo.getMesas()) {
            jComboBoxMesas.addItem(me+"");
        }

        jLabelMesa1.setText("Mesa - " + unMozo.getMesas().get(0).getNumeroMesa());
        jLabelMesa2.setText("Mesa - " + unMozo.getMesas().get(1).getNumeroMesa());
        jLabelMesa3.setText("Mesa - " + unMozo.getMesas().get(2).getNumeroMesa());
        jLabelMesa4.setText("Mesa - " + unMozo.getMesas().get(3).getNumeroMesa());
        jLabelMesa5.setText("Mesa - " + unMozo.getMesas().get(4).getNumeroMesa());

    }

    @Override
    public void mostrarPedidosMesa(Mesa unaMesa) {
        DefaultTableModel lista = new DefaultTableModel();
        
        lista.addColumn("Nombre Producto");
        lista.addColumn("Cantidad");
        lista.addColumn("Precio unitario");
        lista.addColumn("Subtotal");
        lista.addColumn("Estado");
        
        int fila = 0;
            lista.setNumRows(unaMesa.getServicio().getItems().size());
            
            for(Pedido p:unaMesa.getServicio().getItems()){
                lista.setValueAt(p.getProducto().getNombre(), fila, 0);
                lista.setValueAt(p.getCantidad(), fila, 1);
                lista.setValueAt(p.getProducto().getPrecio(), fila, 2);
                lista.setValueAt(p.subTotal(), fila, 3);
                lista.setValueAt(p.getEstado(), fila, 4);
                fila++;
            }
            jTableServicio.setModel(lista);
    }

    @Override
    public void abrirMesa(Mesa unaMesa) {
            controlador.abrirMesa(unaMesa);  
    }

    @Override
    public void cerrarMesa(Mesa unaMesa,Cliente unCliente) {
            controlador.cerrarMesa(unaMesa,unCliente);
    }

    @Override
    public void transferirMesa() {
        new TransferenciaMesa(controlador.mozosConectados(),mesa).setVisible(true);
    }

    @Override
    public void hacerPedido(Producto unProducto, int cantidad, String descripcion, Mesa unaMesa) {
        controlador.hacerPedido(unProducto,cantidad,descripcion,unaMesa);
        mostrarPedidosMesa(unaMesa);
    }

    @Override
    public void salirSistema() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this,mensaje);
    }

    @Override
    public void opcionTransferencia(Transferencia trans) {
        DecisionTransferencia tran=new DecisionTransferencia(this,false,trans);
        tran.setVisible(true);
    }

}
