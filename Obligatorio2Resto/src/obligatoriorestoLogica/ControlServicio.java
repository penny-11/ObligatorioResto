/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatoriorestoLogica;

import java.util.ArrayList;
import obligatorio2Observador.Observable;
import obligatorio2Observador.Observador;

/**
 *
 * @author tomas
 */
public class ControlServicio{

    private ArrayList<Mesa> mesasSinAsignar = new ArrayList();
    private ArrayList<Cliente> clientes=new ArrayList();
    private ArrayList<Servicio> servicios=new ArrayList();

    public void asignarMesas(Mozo mozo) {
        for (Mesa me : mesasSinAsignar) {
            if (mozo.getMesas().isEmpty()) {
                mozo.addMesa(me);
                mesasSinAsignar.remove(me);
            }
        }
    }
    
    public void agregarMesa(Mesa unaMesa){
        mesasSinAsignar.add(unaMesa);
    }
    
    public void agregarCliente(Cliente unCliente){
        clientes.add(unCliente);
    }
    
    public void agregarServicio(Mesa unaMesa){
        Servicio unServicio=new Servicio(unaMesa,unaMesa.getMozo());
        servicios.add(unServicio);
    }
    
    public Servicio buscarServicio(Mesa unaMesa){
        for(Servicio se:servicios){
            if(se.getMesa().getNumeroMesa()==unaMesa.getNumeroMesa() && se.getMesa().isEstadoMesa()){
                return se;
            }
        }
        return null;
    }
    
}
