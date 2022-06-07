/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package obligatorio2restoUIEscritorio;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import obligatorio2restoControladores.ControladorMonitoreo;
import obligatorio2restoControladores.InterfaceMonitorPedidos;
import obligatoriorestoLogica.Gestor;
import obligatoriorestoLogica.Mozo;
import obligatoriorestoLogica.Pedido;
import obligatoriorestoLogica.UnidadProcesadora;

/**
 *
 * @author tomas
 */
public class MonitorPedidos extends javax.swing.JFrame implements InterfaceMonitorPedidos{
    
    private UnidadProcesadora unidad;
    private Pedido pedidoSeleccionadoPendiente;
    private Pedido pedidoSeleccionadoTomado;
    private ControladorMonitoreo controlador;
    private Gestor gestor;

    /**
     * Creates new form MonitorPedidos
     */
    public MonitorPedidos(UnidadProcesadora lugar,Gestor user) {
        initComponents();
        this.unidad=lugar;
        controlador=new ControladorMonitoreo(this,user,lugar);
        this.gestor=user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePedidosPendientes = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTablePedidosTomados = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pedidos pendientes");

        jButton1.setText("Tomar pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Finalizar pedido");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Pedidos tomados");

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
        jScrollPane3.setViewportView(jTablePedidosPendientes);

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
        jScrollPane4.setViewportView(jTablePedidosTomados);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Monitor de Pedidos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jLabel1))
                                .addGap(324, 324, 324)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton2)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel3)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(125, 125, 125))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTablePedidosPendientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePedidosPendientesMouseClicked
        pedidoSeleccionadoPendiente=seleccionarPedidoPendiente(jTablePedidosPendientes.getSelectedRow());
    }//GEN-LAST:event_jTablePedidosPendientesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tomarPedido(pedidoSeleccionadoPendiente);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        finalizarPedido(pedidoSeleccionadoTomado);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTablePedidosTomadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePedidosTomadosMouseClicked
        
    }//GEN-LAST:event_jTablePedidosTomadosMouseClicked

    /**
     * @param args the command line arguments
     */
    private Pedido seleccionarPedidoPendiente(int pos) {
        Pedido elegido = null;
        if (pos != -1) {
            elegido = unidad.pedidosMostrar(false).get(pos);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTablePedidosPendientes;
    private javax.swing.JTable jTablePedidosTomados;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarPendientes() {
        
       DefaultTableModel lista = new DefaultTableModel();
        
        lista.addColumn("Nombre Producto");
        lista.addColumn("Cantidad");
        lista.addColumn("Descripcion");
        lista.addColumn("Numero mesa");
        lista.addColumn("Mozo");
        
        int fila = 0;
            lista.setNumRows(unidad.pedidosMostrar(false).size());
            
            for(Pedido p: unidad.pedidosMostrar(false)){
                lista.setValueAt(p.getProducto().getNombre(), fila, 0);
                lista.setValueAt(p.getCantidad(), fila, 0);
                lista.setValueAt(p.getDescripcion(), fila, 0);
                lista.setValueAt(p.getServicio().getMesa().toString(), fila, 0);
                lista.setValueAt(p.getServicio().getMesa().getMozo().getNombreCompleto(), fila, 0);
                fila++;
            }
        jTablePedidosPendientes.setModel(lista);
    }

    private void tomarPedido(Pedido pedidoPendiente) {
        if(pedidoPendiente!=null){
            controlador.tomarPedido(pedidoPendiente);
            mostrarPendientes();
            mostrarTomados();
        }else{
            JOptionPane.showMessageDialog(this,"Debes seleccionar un pedido.");
        }
    }

    @Override
    public void mostrarTomados() {
        DefaultTableModel lista = new DefaultTableModel();
        
        lista.addColumn("Nombre Producto");
        lista.addColumn("Cantidad");
        lista.addColumn("Descripcion");
        lista.addColumn("Numero mesa");
        lista.addColumn("Mozo");
        
        int fila = 0;
            lista.setNumRows(gestor.getPedidosTomados().size());
            
            for(Pedido p: gestor.getPedidosTomados()){
                lista.setValueAt(p.getProducto().getNombre(), fila, 0);
                lista.setValueAt(p.getCantidad(), fila, 0);
                lista.setValueAt(p.getDescripcion(), fila, 0);
                lista.setValueAt(p.getServicio().getMesa().toString(), fila, 0);
                lista.setValueAt(p.getServicio().getMesa().getMozo().getNombreCompleto(), fila, 0);
                fila++;
            }
        jTablePedidosTomados.setModel(lista);
    }

    private void finalizarPedido(Pedido pedidoTomado) {
        if(pedidoTomado!=null){
            controlador.finalizarPedido(pedidoTomado);
            mostrarTomados();
        }else{
            JOptionPane.showMessageDialog(this,"Debes seleccionar un pedido.");
        }
    }


}
