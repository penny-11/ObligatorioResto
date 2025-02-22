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

    
}
