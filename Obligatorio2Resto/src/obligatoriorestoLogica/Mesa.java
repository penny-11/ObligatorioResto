/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatoriorestoLogica;

import obligatorio2Observador.Observable;

/**
 *
 * @author tomas
 */
public class Mesa extends Observable{

    private int numeroMesa;
    private Mozo mozoAsignado;
    private Servicio servicioMesa;
    private boolean estadoMesa;
    private Cliente clienteMesa;

    public boolean isIsAsignada() {
        return isAsignada;
    }

    public void setIsAsignada(boolean isAsignada) {
        this.isAsignada = isAsignada;
    }
    private boolean isAsignada;

    public enum eventos{transferenciaMesa}
    
    public Mesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
        this.estadoMesa = false;
    }

    public Mesa() {
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public void addMozo(Mozo unMozo) {
        this.mozoAsignado = unMozo;
    }

    public Mozo getMozo() {
        return mozoAsignado;
    }

    public boolean isEstadoMesa() {
        return estadoMesa;
    }

    public void setEstadoMesa(boolean estadoMesa) {
        this.estadoMesa = estadoMesa;
    }

    public Servicio getServicio() {
        return servicioMesa;
    }
    public void addServicio(Servicio servicio){
        this.servicioMesa=servicio;
    }
    
    public Cliente getClienteMesa() {
        return clienteMesa;
    }

    public void addCliente(Cliente clienteMesa) {
        this.clienteMesa = clienteMesa;
    }
    
    public void transferirMesa(Mozo mozoDestino){
        avisar(eventos.transferenciaMesa);
    }
    
    @Override
    public String toString() {
        return "Mesa" + numeroMesa;
    }
}

