/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatoriorestoLogica;

/**
 *
 * @author tomas
 */
public class Mesa {
    
    private int numeroMesa;
    private Mozo mozoAsignado;
    private Cliente clienteMesa;

    public Mesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
    
    public Mesa(){
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
    
    public void addMozo(Mozo unMozo){
        this.mozoAsignado=unMozo;
    }
    
    public void addCliente(Cliente unCliente){
        this.clienteMesa=unCliente;
    }
    
}
