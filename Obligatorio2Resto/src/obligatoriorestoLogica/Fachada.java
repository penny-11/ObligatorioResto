/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriorestoLogica;

import java.util.ArrayList;
import obligatorio2Observador.Observable;

/**
 *
 * @author admin
 */
public class Fachada extends Observable {
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
    
    public void agregarUnidadProcesadora() {
        cs.agregarUnidadProcesadora();
    }
    
    public void agregarCliente(Cliente unCliente) {
        cser.agregarCliente(unCliente);
    }

    public void asignarMesas(Mozo mozo) {
        cser.asignarMesas(mozo);
    }
    
    public void agregarMesa(Mesa unaMesa) {
        cser.agregarMesa(unaMesa);
    }
     public void agregarMozo(String us, String pwd, String nomCom, String tel) {
        cu.crearUsuarioMozo(us, pwd, nomCom, tel);
    }
     public void agregarGestor(String us, String pwd, String nomCom) {
        cu.crearUsuarioGestor(us, pwd, nomCom);
    }

    public void agregarServicio(Mesa unaMesa) {
        cser.agregarServicio(unaMesa);
    }
    public void agregarProducto(Producto prod1) {
        cs.agregar(prod1);
    }

    public Servicio buscarServicio(Mesa unaMesa) {
        return cser.buscarServicio(unaMesa);
    }
    public Cliente buscarCliente(int id) {
        return cser.buscarCliente(id);
    }
    
    public ArrayList<Cliente> getClientes() {
        return cser.getClientes();
    }
   
    public ArrayList<Mozo> getMozos() {
        return cu.getMozos();
    }
    
   

    public ArrayList<Gestor> getGestores() {
        return cu.getGestores();
    }
    
    public ArrayList<Servicio> getServicios() {
        return cser.getServicios();
    }

    public ArrayList<Mozo> getMozosConectados() {
        return cu.getMozosConectados();
    }
    
    public Producto buscarProducto(String productoNom ) {
        return cs.buscarProducto(productoNom);
    }
}
