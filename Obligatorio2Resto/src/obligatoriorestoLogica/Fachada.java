/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriorestoLogica;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Fachada {
    private ControlUsuarios cu = new ControlUsuarios();
    private ControlStock cs=new ControlStock();
    private ControlServicio cser=new ControlServicio();
    
    
   private static Fachada instancia = new Fachada();
   
   public static Fachada getInstancia() {
        return instancia;
    }
    
    
   private Fachada() {
   }
   
   public Mozo loginMozo(String u, String p) throws UsuarioException {
        return cu.loginMozo(u, p);
   }
   
    public Gestor loginGestor(String u, String p) {
        return cu.loginGestor(u, p);
    }

    public boolean agregar(Producto unProducto) {
        return cs.agregar(unProducto);
    }

    public ArrayList<Producto> getProductos() {
        return cs.getProductos();
    }

    public void asignarMesas(Mozo mozo) {
        cser.asignarMesas(mozo);
    }

    public void abrirMesa(Mesa unaMesa, Mozo unMozo) throws MesaException{
        unMozo.abrirMesa(unaMesa);
       
    }

    public void cerrarMesa(Mesa unaMesa,Cliente unCliente,Mozo unMozo) throws MesaException{
       unMozo.cerrarMesa(unaMesa, unCliente);
    }
     
    
    
    
    
     
    
    
}
