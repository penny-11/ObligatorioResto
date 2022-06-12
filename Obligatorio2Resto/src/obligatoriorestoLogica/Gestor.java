/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatoriorestoLogica;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author tomas
 */
public class Gestor extends Usuario{
    
    private Date ultimoIngreso;
    private ArrayList<Pedido> pedidosTomados;

    public Gestor(String usuario, String password, String nombreCompleto) {
        super(usuario, password, nombreCompleto);
        this.pedidosTomados=new ArrayList();
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

    public Date getUltimoIngreso() {
        return ultimoIngreso;
    }

    public void setUltimoIngreso(Date ultimoIngreso) {
        this.ultimoIngreso = ultimoIngreso;
    }

    public ArrayList<Pedido> getPedidosTomados() {
        return pedidosTomados;
    }

    public void addPedidoTomado(Pedido pedidoTomado) {
        pedidosTomados.add(pedidoTomado);
    }

    @Override
    public boolean isConectado() {
        return conectado;
    }

    @Override
    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }
    
    
}
