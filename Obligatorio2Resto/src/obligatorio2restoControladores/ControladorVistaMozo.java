/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatorio2restoControladores;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import obligatorio2Observador.Observable;
import obligatorio2Observador.Observador;
import obligatoriorestoLogica.Cliente;
import obligatoriorestoLogica.Fachada;
import obligatoriorestoLogica.Mesa;
import obligatoriorestoLogica.MesaException;
import obligatoriorestoLogica.Mozo;
import obligatoriorestoLogica.Producto;
import obligatoriorestoLogica.Servicio;
import obligatoriorestoLogica.ServicioException;
import obligatoriorestoLogica.Transferencia;

/**
 *
 * @author tomas
 */
public class ControladorVistaMozo implements Observador {

    private InterfaceVistaMozo vistaMozo;
    private Fachada sistema = Fachada.getInstancia();
    private Mozo mozo;

    public ControladorVistaMozo(InterfaceVistaMozo vista, Mozo mo) {
        this.vistaMozo = vista;
        this.mozo = mo;
        mozo.agregar(this);
    }

    @Override
    public void actualizar(Object evento, Observable aThis) {
        if (evento.equals(Mozo.Eventos.transferirMesa)) {
            opcionTransferencia(mozo.getTransferencia());
        } else if (evento.equals(Mozo.Eventos.aceptarTransferencia)) {
            vistaMozo.mostrarMensaje("Transferencia confirmada!");
            vistaMozo.cargarMesas(mozo.getMesas());
        } else if (evento.equals(Mozo.Eventos.rechazarTransferencia)) {
            vistaMozo.mostrarMensaje("Transferencia rechazada!");
        }else if(evento.equals(Mozo.Eventos.pedidoFinalizado)){
            vistaMozo.opcionPedidoFinalizado(mozo.getPedidoFinalizado());
            vistaMozo.mostrarPedidosMesa(mozo.getPedidoFinalizado().getServicio());
        }
    }

    public void abrirMesa(Mesa unaMesa) {
        try {
            mozo.abrirMesa(unaMesa);
            sistema.agregarServicio(unaMesa);
            vistaMozo.mostrarMensaje("Mesa abierta con exito.");
            vistaMozo.cargarMesas(mozo.getMesas());
        } catch (MesaException ex) {
            vistaMozo.mostrarMensaje(ex.getMessage());
        }
    }

    public void cerrarMesa(Mesa unaMesa, Cliente unCliente) {
        try {
            mozo.cerrarMesa(unaMesa, unCliente);
            vistaMozo.mostrarMensaje("Mesa cerrada con exito.");
            vistaMozo.cargarMesas(mozo.getMesas());
            mostrarPedidosMesa(unaMesa);
            vistaMozo.borrarDetalleCliente();
        } catch (MesaException ex) {
            vistaMozo.mostrarMensaje(ex.getMessage());
        }
    }

    public void hacerPedido(Producto unProducto, int cantidad, String descripcion, Mesa unaMesa) {
        Servicio serv = unaMesa.getServicio();
        try {
            if (serv != null) {
                serv.hacerPedido(unProducto, cantidad, descripcion);
                sistema.actualizarServicio(serv);
                vistaMozo.mostrarMensaje("Pedido realizado con exito.");
                vistaMozo.mostrarPedidosMesa(serv);
            } else {
                vistaMozo.mostrarMensaje("No se puede abrir servicio de una mesa cerrada.");
            }
        } catch (ServicioException ex) {
            vistaMozo.mostrarMensaje(ex.getMessage());
        }

    }

    public void transferirMesa(Mesa mesaTransferir,Mozo mozoOrigen,Mozo mozoDestino) {
        Transferencia transf = new Transferencia(mozoOrigen, mozoDestino, mesaTransferir);
        mozoOrigen.setTransferencia(transf);
        mozo=mozoOrigen;
        mozoDestino.transferirMesa(transf);
    }

    public Cliente buscarCliente(int idCliente) {
        return sistema.buscarCliente(idCliente);
    }

    private void opcionTransferencia(Transferencia transferencia) {
        vistaMozo.opcionTransferencia(transferencia);
    }

    public void mostrarPedidosMesa(Mesa mesa) {
        if(mesa!=null){
            vistaMozo.mostrarPedidosMesa(mesa.getServicio());
        }
    }

    public void mostrarMozosConectados(ArrayList<Mozo> mozosConectados) {
        vistaMozo.mostrarMozosConectados(mozosConectados);
    }

    public ArrayList<Mozo> mozosConectados() {
        return sistema.getMozosConectados();
    }

    public void mostrarDatosCliente(Cliente cliente) {
        vistaMozo.mostrarDatos(cliente);
    }

    public void mostrarMesas() {
        vistaMozo.cargarMesas(mozo.getMesas());
    }

    public void mostrarProductos() {
        vistaMozo.mostrarProductos(sistema.getProductos());
    }
}
