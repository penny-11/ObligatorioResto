/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatoriorestoLogica;

import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class ControlStock {
    
    private int proxIdProd = 1;

    private ArrayList<Producto> productos = new ArrayList();
    private ArrayList <UnidadProcesadora> unidadesProcesadoras=new ArrayList();
    
    public boolean agregar(Producto unProducto) {
        if (!unProducto.validar()) {
            return false;
        }
        unProducto.setCodigo(proxIdProd);
        proxIdProd++;
        productos.add(unProducto);
        return true;
    }
    
    public ArrayList<Producto> getProductos() {
        return productos;
    }
     public ArrayList<UnidadProcesadora> getUnidadProcesadoras() {
        return unidadesProcesadoras;
    }
    
    public void agregarUnidadProcesadora(){
        unidadesProcesadoras.add(new Bar("Barra Bar"));
        unidadesProcesadoras.add(new Cocina("Barra Cocina"));
        
    }
    
    public Producto buscarProducto(String productoNom) {
        for(Producto p: productos){
            if(p.getNombre()==productoNom){
                return p;
            }
        }
        return null;
    }
    
    public UnidadProcesadora buscarUP(String upNom) {
        for(UnidadProcesadora up: unidadesProcesadoras){
            if(up.getNombre()==upNom){
                return up;
            }
        }
        return null;
    }

    
}
