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
public class Cocina extends UnidadProcesadora{

    public Cocina(String nombre) {
        super(nombre);
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public ArrayList<Pedido> getPedidos() {
        return this.pedidos;
    }
    
}
