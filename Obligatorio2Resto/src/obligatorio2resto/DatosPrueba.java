/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2resto;

import obligatoriorestoLogica.Bar;
import obligatoriorestoLogica.ClienteCasa;
import obligatoriorestoLogica.ClienteComun;
import obligatoriorestoLogica.ClientePreferencial;
import obligatoriorestoLogica.Cocina;
import obligatoriorestoLogica.Fachada;
import obligatoriorestoLogica.Fachada;
import obligatoriorestoLogica.Gestor;
import obligatoriorestoLogica.Mesa;
import obligatoriorestoLogica.Mozo;
import obligatoriorestoLogica.Mozo;
import obligatoriorestoLogica.Producto;
import obligatoriorestoLogica.Servicio;


/**
 *
 * @author admin
 */
public class DatosPrueba {
    
    public static void cargar(){
        Fachada logica = Fachada.getInstancia();
        
        Bar bar=new Bar("Bar");
        Cocina cocina=new Cocina("Cocina");
        
        logica.addUnidadProcesadora(cocina);
        logica.addUnidadProcesadora(bar);
        
        Mozo mozo1 = new Mozo("Juan", "Juan1234","Juan Perez", "099 854 784");
        Mozo mozo2 = new Mozo("Lucas", "Lucas1234","Lucas Perez", "099 854 111");
        Mozo mozo3 = new Mozo("Martin", "Martin1234","Martin Gonzalez", "099 457 549");
        Mozo mozo4 = new Mozo("Sofia", "Sofia1234","Sofia Martinez", "099 222 748");
        Mozo mozo5 = new Mozo("Lucia", "Lucia1234","Lucia Rodriguez", "094 333 487");
        
         //USUARIOS GESTORES
         
         Gestor gestor1=new Gestor("Camila", "Camila1234","Camila Perez");
         Gestor gestor2=new Gestor("x", "x","Camila Perez");
         Gestor gestor3=new Gestor("Martina", "Martina1234","Martina Gonzalez");
         Gestor gestor4=new Gestor("Jorge", "Jorge1234","Jorge Martinez");
         
         /*gestor1.addUnidadProcesadora(bar);
         gestor2.addUnidadProcesadora(bar);
         gestor3.addUnidadProcesadora(bar);
         gestor4.addUnidadProcesadora(bar);
         gestor1.addUnidadProcesadora(cocina);
         gestor2.addUnidadProcesadora(cocina);
         gestor3.addUnidadProcesadora(cocina);
         gestor4.addUnidadProcesadora(cocina);*/
         
         
        logica.agregarGestor(gestor1);
        logica.agregarGestor(gestor2);
        logica.agregarGestor(gestor3);
        logica.agregarGestor(gestor4);
        
        
        //CLIENTES PREFERENCIALES
        
        ClientePreferencial clientePref1 = new ClientePreferencial(10,"lucas@rodriguez.com", "Lucas Preferencial");
        ClientePreferencial clientePref2 = new ClientePreferencial(11,"xim@xim.com", "Ximena Preferencial");
        logica.agregarCliente(clientePref1);
        logica.agregarCliente(clientePref2);
        //CLIENTES COMUNES
        
        ClienteComun clienteCom1 = new ClienteComun(12,"jorge@jorge.com", "Jorge Comun");
        ClienteComun clienteCom2 = new ClienteComun(13,"sof@sof.com", "Sofia Comun");
        logica.agregarCliente(clienteCom1);
        logica.agregarCliente(clienteCom2);
        
        //CLIENTES CASA
        
        ClienteCasa clienteCasa1 = new ClienteCasa(14,"martina@mart.com", "Martina Casa");
        ClienteCasa clienteCasa2 = new ClienteCasa(15,"nic@nic.com", "Nicolas Casa");
        logica.agregarCliente(clienteCasa1);
        logica.agregarCliente(clienteCasa2);
        
     
        
        
        //MESAS
        Mesa mesa1 = new Mesa(1);
        Mesa mesa2 = new Mesa(2);
        Mesa mesa3 = new Mesa(3);
        Mesa mesa4 = new Mesa(4);
        Mesa mesa5 = new Mesa(5);
        Mesa mesa6 = new Mesa(6);
        Mesa mesa7 = new Mesa(7);
        Mesa mesa8 = new Mesa(8);
        Mesa mesa9 = new Mesa(9);
        Mesa mesa10 = new Mesa(10);
        Mesa mesa11 = new Mesa(11);
        
        
        
        logica.agregarMesa(mesa1);
        logica.agregarMesa(mesa2);
        logica.agregarMesa(mesa3);
        logica.agregarMesa(mesa4);
        logica.agregarMesa(mesa5);
        logica.agregarMesa(mesa6);
        logica.agregarMesa(mesa7);
        logica.agregarMesa(mesa8);
        logica.agregarMesa(mesa9);
        logica.agregarMesa(mesa10);
        logica.agregarMesa(mesa11);
        
        mozo1.addMesa(mesa1);
        mozo1.addMesa(mesa3);
        mozo1.addMesa(mesa7);
        
        mozo2.addMesa(mesa2);
        mozo2.addMesa(mesa5);
        mozo2.addMesa(mesa11);
        
        mozo3.addMesa(mesa4);
        mozo3.addMesa(mesa6);
        mozo3.addMesa(mesa8);
        mozo3.addMesa(mesa9);
        mozo3.addMesa(mesa10);
        
        //USUARIOS MOZOS
        logica.agregarMozo(mozo1);
        logica.agregarMozo(mozo2);
        logica.agregarMozo(mozo3);
        logica.agregarMozo(mozo4);
        logica.agregarMozo(mozo5);
        
        //PRODUCTOS
        
        Producto prod1 = new Producto("Hamburgesa", 250,30);
        Producto prod2 = new Producto("Tarta de pollo", 130,15);
        Producto prod3 = new Producto("Milanesa de carne", 180,60);
        Producto prod4 = new Producto("Milanesa de pollo", 220,20);
        Producto prod5 = new Producto("Ravioles", 400,40);
        Producto prod6 = new Producto("Daikiri", 420,20);
        Producto prod7 = new Producto("Fernet", 120,50);
        Producto prod8 = new Producto("Cerveza", 110,30);
        Producto prod9 = new Producto("Vino", 50,30);
        Producto prod10=new Producto("Cafe", 50,30);
        Producto prod11=new Producto("Agua", 50,30);
        
        prod6.setUnidadProcesadora(bar);
        prod7.setUnidadProcesadora(bar);
        prod8.setUnidadProcesadora(bar);
        prod9.setUnidadProcesadora(bar);
        prod10.setUnidadProcesadora(bar);
        prod11.setUnidadProcesadora(bar);
       
         
        prod1.setUnidadProcesadora(cocina);
        prod2.setUnidadProcesadora(cocina);
        prod3.setUnidadProcesadora(cocina);
        prod4.setUnidadProcesadora(cocina);
        prod5.setUnidadProcesadora(cocina);
        
        logica.agregar(prod1);
        logica.agregar(prod2);
        logica.agregar(prod3);
        logica.agregar(prod4);
        logica.agregar(prod5);
        logica.agregar(prod6);
        logica.agregar(prod7);
        logica.agregar(prod8);
        logica.agregar(prod9);
        logica.agregar(prod10);
        logica.agregar(prod11);
        
    }
    
}
