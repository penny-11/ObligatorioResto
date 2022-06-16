/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatoriorestoLogica;

/**
 *
 * @author tomas
 */
public class Producto {
    
    private int codigo;
    private String nombre;
    private float precio;
    private int stock;
    private UnidadProcesadora unidadProcesadora;

    public Producto(String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    public Producto(){
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public UnidadProcesadora getUnidadProcesadora() {
        return unidadProcesadora;
    }

    public void setUnidadProcesadora(UnidadProcesadora unidadProcesadora) {
        this.unidadProcesadora = unidadProcesadora;
    }
    
    public boolean validar() {
        return validarNombre(nombre) && validarPrecio(precio) && validarUnidades(stock);
    }
    
    private boolean validarUnidades(int unidades) {
        return unidades>0;
    }

    private boolean validarPrecio(float precio) {
        return precio>0;
       
    }

    private boolean validarNombre(String nombre) {
        return nombre!=null && !nombre.trim().equals("");
     }

    public void modificarStock(int cantidad) {
        stock=stock-cantidad;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
