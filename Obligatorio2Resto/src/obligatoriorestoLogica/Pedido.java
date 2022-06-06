
package obligatoriorestoLogica;
import obligatorio2Observador.Observable;



public class Pedido extends Observable{
    
    private Producto producto;
    private int cantidad;
    private String descripcion;
    private String estado;

    public Pedido(Producto producto, int cantidad, String descripcion) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }
    
    public Pedido(){
    }
    
    public enum eventos{nuevoPedido};

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

    public float total (){
        return this.getCantidad()* this.getProducto().getPrecio();
    }
    
    
    
    

    public void enviarPedido(){
        producto.getUnidadProcesadora().recibirPedido(this);
        avisar(eventos.nuevoPedido);
        Fachada.getInstancia().avisar(Fachada.eventos.cambioListaPedidos);
    }

    public float subTotal(){
        return producto.getPrecio()*cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
