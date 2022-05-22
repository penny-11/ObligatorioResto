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
public class Servicio {
    
    private ArrayList<Pedido> items;
    private Mesa mesa;
    private Mozo mozoAtencion;

    public Servicio(Mesa mesa, Mozo mozoAtencion) {
        this.mesa = mesa;
        this.mozoAtencion = mozoAtencion;
    }
    
    public Servicio(){
    }

    public ArrayList<Pedido> getItems() {
        return items;
    }

    public void addItem(Pedido item) {
        this.items.add(item);
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Mozo getMozoAtencion() {
        return mozoAtencion;
    }

    public void setMozoAtencion(Mozo mozoAtencion) {
        this.mozoAtencion = mozoAtencion;
    }
    
    
    
}
