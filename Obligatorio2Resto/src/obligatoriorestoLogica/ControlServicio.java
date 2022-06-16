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
public class ControlServicio{

    

    private ArrayList<Mesa> mesasSinAsignar = new ArrayList();
    private ArrayList<Cliente> clientes=new ArrayList();
    private ArrayList<Servicio> servicios=new ArrayList();
   
    
    public ControlServicio(){
        
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }
    
    public void agregarMesa(Mesa unaMesa){
        mesasSinAsignar.add(unaMesa);
    }
    
     public void eliminarMesaDeSinAsignar(Mesa unaMesa){
        mesasSinAsignar.remove(unaMesa);
    }
    
    public void agregarCliente(Cliente unCliente){
        clientes.add(unCliente);
    }
    
      public ArrayList<Cliente> getClientes(){
        return clientes;
    }
      
    public Cliente buscarCliente(int id){
        for(Cliente cli:clientes){
            if(cli.clienteId == id){
                return cli;
            }
        }
        return null;
    }
    
    public void agregarServicio(Mesa unaMesa){
        Servicio unServicio=new Servicio(unaMesa,unaMesa.getMozo());
        servicios.add(unServicio);
    }
    
    public void actualizarServicio(Servicio unServicio){
        for(Servicio se:servicios){
            if(unServicio.equals(se)){
                se=unServicio;
                break;
            }
        }
    }
    
}
