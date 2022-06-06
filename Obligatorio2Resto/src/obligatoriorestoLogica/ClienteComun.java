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



public class ClienteComun extends Cliente{

    public ClienteComun(String email, String nombre) {
        super(email, nombre);
    }

    public ClienteComun() {
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
        int total = 0;
        for(Pedido s: servicio.getItems()){
            if(s.getProducto().equals("Agua")){
                total = total;
            }else{
                total += s.total();
            }
        }
        return total;
    }
    
}
