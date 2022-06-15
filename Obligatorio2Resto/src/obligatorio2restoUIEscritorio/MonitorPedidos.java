/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package obligatorio2restoUIEscritorio;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import obligatorio2restoControladores.ControladorMonitoreo;
import obligatorio2restoControladores.InterfaceMonitorPedidos;
import obligatoriorestoLogica.Bar;
import obligatoriorestoLogica.Gestor;
import obligatoriorestoLogica.Pedido;
import obligatoriorestoLogica.UnidadProcesadora;

/**
 *
 * @author tomas
 */
public class MonitorPedidos extends javax.swing.JFrame implements InterfaceMonitorPedidos{

    private ArrayList<UnidadProcesadora> unidadesProcesadoras;
    private UnidadProcesadora unidadInicio;
    private Gestor gestor;
    private ControladorMonitoreo controlador;
    private Pedido pedidoSeleccionadoPendiente;
    private Pedido pedidoSeleccionadoTomado;

 
    public MonitorPedidos(Gestor user) {
        initComponents();
        controlador=new ControladorMonitoreo(this,user);
        this.gestor=user;
        this.unidadesProcesadoras=new ArrayList();
        controlador.mostrarPendientes();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePedidosPendientes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePedidosTomados = new javax.swing.JTable();
        jButtonTomarPedido = new javax.swing.JButton();
        jButtonFinalizarPedido = new javax.swing.JButton();
        jComboBoxUProcesadoras = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTablePedidosPendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePedidosPendientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePedidosPendientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePedidosPendientes);

        jTablePedidosTomados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePedidosTomados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePedidosTomadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablePedidosTomados);

        jButtonTomarPedido.setText("Tomar Pedido");
        jButtonTomarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTomarPedidoActionPerformed(evt);
            }
        });

        jButtonFinalizarPedido.setText("FinalizarPedido");
        jButtonFinalizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarPedidoActionPerformed(evt);
            }
        });

        jComboBoxUProcesadoras.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxUProcesadorasItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonTomarPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonFinalizarPedido)))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jComboBoxUProcesadoras, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jComboBoxUProcesadoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonFinalizarPedido))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonTomarPedido)))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTomarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTomarPedidoActionPerformed
        tomarPedido(pedidoSeleccionadoPendiente);
    }//GEN-LAST:event_jButtonTomarPedidoActionPerformed

    private void jButtonFinalizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarPedidoActionPerformed
        finalizarPedido(pedidoSeleccionadoTomado);
    }//GEN-LAST:event_jButtonFinalizarPedidoActionPerformed

    private void jTablePedidosPendientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePedidosPendientesMouseClicked
        pedidoSeleccionadoPendiente=seleccionarPedidoPendiente(jTablePedidosPendientes.getSelectedRow());
    }//GEN-LAST:event_jTablePedidosPendientesMouseClicked

    private void jTablePedidosTomadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePedidosTomadosMouseClicked
        pedidoSeleccionadoTomado=seleccionarPedidoTomado(jTablePedidosTomados.getSelectedRow());
    }//GEN-LAST:event_jTablePedidosTomadosMouseClicked

    private void jComboBoxUProcesadorasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxUProcesadorasItemStateChanged
        unidadInicio=(UnidadProcesadora)jComboBoxUProcesadoras.getSelectedItem();
        pedidosPendientes(unidadInicio);
    }//GEN-LAST:event_jComboBoxUProcesadorasItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFinalizarPedido;
    private javax.swing.JButton jButtonTomarPedido;
    private javax.swing.JComboBox jComboBoxUProcesadoras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePedidosPendientes;
    private javax.swing.JTable jTablePedidosTomados;
    // End of variables declaration//GEN-END:variables

    
    
    private Pedido seleccionarPedidoPendiente(int pos) {
        Pedido elegido = null;
        if (pos != -1) {
            elegido = unidadInicio.pedidosMostrar(false).get(pos);
        }
        return elegido;
    }
    
    private Pedido seleccionarPedidoTomado(int pos) {
        Pedido elegido = null;
        if (pos != -1) {
            elegido = gestor.getPedidosTomados().get(pos);
        }
        return elegido;
    }
    
    @Override
    public void mostrarPendientes(ArrayList<Pedido> pedidosPendientes) {
        DefaultTableModel lista = new DefaultTableModel();
        
        lista.addColumn("Nombre Producto");
        lista.addColumn("Cantidad");
        lista.addColumn("Descripcion");
        lista.addColumn("Numero mesa");
        lista.addColumn("Mozo");
        
        int fila = 0;
            lista.setNumRows(pedidosPendientes.size());
            
            for(Pedido p: pedidosPendientes){
                lista.setValueAt(p.getProducto().getNombre(), fila, 0);
                lista.setValueAt(p.getCantidad(), fila, 1);
                lista.setValueAt(p.getDescripcion(), fila, 2);
                lista.setValueAt(p.getServicio().getMesa().toString(), fila, 3);
                lista.setValueAt(p.getServicio().getMesa().getMozo().getNombreCompleto(), fila, 4);
                fila++;
            }
        jTablePedidosPendientes.setModel(lista);
    }

    @Override
    public void mostrarTomados(ArrayList<Pedido> pedidosTomados) {
        DefaultTableModel lista = new DefaultTableModel();
        
        lista.addColumn("Nombre Producto");
        lista.addColumn("Cantidad");
        lista.addColumn("Descripcion");
        lista.addColumn("Numero mesa");
        lista.addColumn("Mozo");
        
        int fila = 0;
            lista.setNumRows(pedidosTomados.size());
            
            for(Pedido p: pedidosTomados){
                lista.setValueAt(p.getProducto().getNombre(), fila, 0);
                lista.setValueAt(p.getCantidad(), fila, 1);
                lista.setValueAt(p.getDescripcion(), fila, 2);
                lista.setValueAt(p.getServicio().getMesa().toString(), fila, 3);
                lista.setValueAt(p.getServicio().getMesa().getMozo().getNombreCompleto(), fila, 4);
                fila++;
            }
        jTablePedidosTomados.setModel(lista);
    }
    
    @Override
    public void tomarPedido(Pedido pedidoPendiente) {
        if(pedidoPendiente!=null){
            controlador.tomarPedido(pedidoPendiente);
            controlador.mostrarPendientes();
            controlador.mostrarTomados();
        }else{
            JOptionPane.showMessageDialog(this,"Debes seleccionar un pedido.");
        }
    }
    
    @Override
    public void finalizarPedido(Pedido pedidoTomado) {
        if(pedidoTomado!=null){
            controlador.finalizarPedido(pedidoTomado);
            controlador.mostrarTomados();
        }else{
            JOptionPane.showMessageDialog(this,"Debes seleccionar un pedido.");
        }
    }

    @Override
    public void cargarUnidades(ArrayList<UnidadProcesadora> unidades) {
        unidadesProcesadoras=unidades;
        for(UnidadProcesadora up: unidades){
            jComboBoxUProcesadoras.addItem(up);
        }
    }

    private void pedidosPendientes(UnidadProcesadora unidad) {
        if(controlador!=null){
            controlador.mostrarPendientes();
            controlador.cambiarUnidad(unidad);
        }
    }

  
    
   
}
