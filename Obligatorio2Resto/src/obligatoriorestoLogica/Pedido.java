package obligatoriorestoLogica;

import java.util.ArrayList;

public class Pedido {

    private Producto producto;
    private int cantidad;
    private String descripcion;
    private boolean estado;
    private Servicio servicio;
    private ArrayList<Pedido> pedidosPendientes;


    public Pedido(Producto producto, int cantidad, String descripcion, Servicio serv) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.servicio = serv;
    }

    public Pedido() {
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void enviarPedido() {
        producto.getUnidadProcesadora().recibirPedido(this);
    }

    public float subTotal() {
        return producto.getPrecio() * cantidad;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public boolean validarProducto() {
        return producto != null
                && producto.getStock() >= cantidad;
    }
    
    public boolean validarCantidad(){
        return cantidad >= 1; 
    }
    
    public ArrayList<Pedido> pedidosPendientes(){
        for(Pedido p: pedidosPendientes){
            if(p.estado == false){
                pedidosPendientes.add(p);
            }
        }
        return pedidosPendientes;
    }

}
