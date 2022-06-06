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
    private boolean conectado;
    private ArrayList<Transferencia> transferencias; 
    
    public enum eventos{aceptarTransferencia,rechazarTransferencia}

    public Mozo(String usuario, String password, String nombreCompleto, String telefono) {
        super(usuario, password, nombreCompleto);
        this.telefono = telefono;
        this.mesas = new ArrayList(5);
        this.conectado = false;
        this.transferencias=new ArrayList();
    }

    @Override
    public String getUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getPassword() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getNombreCompleto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public void setConexion() {
        this.conectado = true;
    }

    public boolean getConexion() {
        return conectado;
    }
    

    public void abrirMesa(Mesa unaMesa) throws MesaException {
        Mesa mesaAux = buscarMesa(unaMesa.getNumeroMesa());
        if (!mesaAux.isEstadoMesa()) {
            mesaAux.setEstadoMesa(true);
        } else {
            throw new MesaException("La Mesa ya esta abierta.");
        }
    }

    public void cerrarMesa(Mesa unaMesa, Cliente unCliente) throws MesaException {
        if (unaMesa.isEstadoMesa()) {
            if (unCliente != null) {
                unaMesa.addCliente(unCliente);
                unaMesa.setEstadoMesa(false);
            }
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

    public void respuestaTransferencia(Transferencia trans, boolean state) {
         trans.setEstado(state);
         if(state){
             transferencias.add(trans);
             avisar(eventos.aceptarTransferencia);
         }else{
             avisar(eventos.rechazarTransferencia);
         }
    }
   
}
