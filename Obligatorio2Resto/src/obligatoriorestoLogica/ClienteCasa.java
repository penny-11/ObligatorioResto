/*
<<<<<<< HEAD
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
=======
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
>>>>>>> ae0ddfeffcf67d559ab9d2660f5f5d6ec16387be
 */
package obligatoriorestoLogica;


public class ClienteCasa extends Cliente {

    public ClienteCasa(int clienteId,String email, String nombre) {
        super(clienteId,email, nombre);
    }


    public ClienteCasa() {
    }

    @Override
    public int getClienteId() {
        return this.clienteId;
    }

    @Override
    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public int calculoTotalServicio(Servicio servicio) {
       int total =servicio.total()- 500;
       if(total<0){
           total=0;
       }
       return total;
    }

    @Override
    public String descripcionBeneficio() {
        return "500 pesos de descuento";
    }


}
