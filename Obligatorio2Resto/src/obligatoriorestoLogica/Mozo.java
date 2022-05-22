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

    public Mozo(String usuario, String password, String nombreCompleto,String telefono) {
        super(usuario, password, nombreCompleto);
        this.telefono = telefono;
        this.mesas=new ArrayList(5);
        this.conectado=false;
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
    
    public void addMesa(Mesa unaMesa){
        this.mesas.add(unaMesa);
    }
    
    public void setConexion(){
        this.conectado=true;
    }
    
    public boolean getConexion(){
        return conectado;
    }
    
}
