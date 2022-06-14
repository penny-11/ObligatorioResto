/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatoriorestoLogica;

/**
 *
 * @author tomas
 */
public class ClientePreferencial extends Cliente {

    public ClientePreferencial(int clienteId,String email, String nombre) {
        super(clienteId,email, nombre);
    }

    public ClientePreferencial() {
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
        this.nombre = nombre;
    }

    @Override
    public int calculoTotalServicio(Servicio servicio) {
        int total = 0;
        for (Pedido p : servicio.getItems()) {
            if (!p.getProducto().getNombre().contains("Agua")) {
                total += p.subTotal();
                if (total > 2000) {
                    total = (total / 95) * 100;
                }
            }
        }
        return total;
    }

    @Override
    public String descripcionBeneficio() {
        return "Agua de la casa - Si es mayor a 2000 tiene descuento";
    }
        
}
