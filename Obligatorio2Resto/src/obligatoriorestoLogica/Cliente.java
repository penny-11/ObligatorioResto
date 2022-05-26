/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatoriorestoLogica;

/**
 *
 * @author tomas
 */
public abstract class Cliente {
    
    protected int clienteId;
    protected String email;
    protected String nombre;

    public Cliente(String email, String nombre) {
        this.email = email;
        this.nombre = nombre;
    }
    
    public Cliente(){
    }

    public abstract int getClienteId();

    public abstract void setClienteId(int clienteId);

    public abstract String getEmail();

    public abstract void setEmail(String email);

    public abstract String getNombre();

    public abstract void setNombre(String nombre);
    
    public abstract int calculoTotalServicio(Servicio servicio);
    
    
    
}
