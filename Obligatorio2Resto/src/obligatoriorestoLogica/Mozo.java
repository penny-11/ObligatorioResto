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
public class Mozo extends Usuario{

    private String telefono;
    private ArrayList<Mesa> mesas;
   
    private Transferencia transferencia; 
    
    public enum Eventos{transferirMesa,aceptarTransferencia,rechazarTransferencia}

    public Mozo(String usuario, String password, String nombreCompleto, String telefono) {
        super(usuario, password, nombreCompleto);
        this.telefono = telefono;
        this.mesas = new ArrayList(5); 
        this.transferencia=null;
    }

    @Override
    public String getUsuario() {
        return this.usuario;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }
    
    @Override
    public boolean isConectado() {
        return conectado;
    }

    @Override
    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public String getTelefono() {
        return telefono;
    }

    public ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public void addMesa(Mesa unaMesa) {
        this.mesas.add(unaMesa);
    }

    public Transferencia getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(Transferencia transferencia) {
        this.transferencia = transferencia;
    }
    
    public void abrirMesa(Mesa unaMesa) throws MesaException {
        if (!unaMesa.isEstadoMesa()) {
            Servicio serv=new Servicio(unaMesa,unaMesa.getMozo());
            unaMesa.addServicio(serv);
            unaMesa.setEstadoMesa(true);
        } else {
            throw new MesaException("La Mesa ya esta abierta.");
        }
    }

    public void cerrarMesa(Mesa unaMesa, Cliente unCliente) throws MesaException {
        if (unaMesa.isEstadoMesa()) {
            if (unCliente != null) {
                unaMesa.addCliente(unCliente);
            }
            unaMesa.setEstadoMesa(false);
        } else {
            throw new MesaException("La Mesa no esta abierta");
        }
    }

    public Mesa buscarMesa(int numeroMesa) {
        for (Mesa m : mesas) {
            if (m.getNumeroMesa() == numeroMesa) {
                return m;
            }
        }
        return null;
    }
    
    public void transferirMesa(){
        avisar(Eventos.transferirMesa);
    }

    public void respuestaTransferencia(Transferencia trans, boolean state) {
         trans.setEstado(state);
         if(state){
             trans.getMozoDestino().addMesa(trans.getMesa());
             trans.getMozoOrigen().getMesas().remove(trans.getMesa());
             avisar(Eventos.aceptarTransferencia);
         }else{
             avisar(Eventos.rechazarTransferencia);
         }
    }
   
}
