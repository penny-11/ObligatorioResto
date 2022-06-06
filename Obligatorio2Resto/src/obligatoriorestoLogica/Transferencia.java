/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatoriorestoLogica;

/**
 *
 * @author tomas
 */
public class Transferencia {
    
    private Mozo mozoOrigen;
    private Mozo mozoDestino;
    private Mesa mesa;

    public Transferencia(Mozo mozoOrigen, Mozo mozoDestino, Mesa mesa) {
        this.mozoOrigen = mozoOrigen;
        this.mozoDestino = mozoDestino;
        this.mesa = mesa;
    }

    public Mozo getMozoOrigen() {
        return mozoOrigen;
    }

    public void setMozoOrigen(Mozo mozoOrigen) {
        this.mozoOrigen = mozoOrigen;
    }

    public Mozo getMozoDestino() {
        return mozoDestino;
    }

    public void setMozoDestino(Mozo mozoDestino) {
        this.mozoDestino = mozoDestino;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
    
    
}
