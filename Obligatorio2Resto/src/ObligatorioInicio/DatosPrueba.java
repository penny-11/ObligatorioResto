/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObligatorioInicio;

import obligatoriorestoLogica.ClienteCasa;
import obligatoriorestoLogica.ClienteComun;
import obligatoriorestoLogica.ClientePreferencial;
import obligatoriorestoLogica.Fachada;
import obligatoriorestoLogica.Fachada;
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
        //USUARIOS MOZOS
        logica.agregarMozo("Juan", "Juan1234","Juan Perez", "099 854 784");
        logica.agregarMozo("Lucas", "Lucas1234","Lucas Perez", "099 854 111");
        logica.agregarMozo("Martin", "Martin1234","Martin Gonzalez", "099 457 549");
        logica.agregarMozo("Sofia", "Sofia1234","Sofia Martinez", "099 222 748");
        logica.agregarMozo("Lucia", "Lucia1234","Lucia Rodriguez", "094 333 487");
        
        Mozo mozo1 = new Mozo("Juan", "Juan1234","Juan Perez", "099 854 784");
        Mozo mozo2 = new Mozo("Lucas", "Lucas1234","Lucas Perez", "099 854 111");
        Mozo mozo3 = new Mozo("Martin", "Martin1234","Martin Gonzalez", "099 457 549");
        Mozo mozo4 = new Mozo("Sofia", "Sofia1234","Sofia Martinez", "099 222 748");
        Mozo mozo5 = new Mozo("Lucia", "Lucia1234","Lucia Rodriguez", "094 333 487");
        
         //USUARIOS GESTORES
        logica.agregarGestor("Camila", "Camila1234","Camila Perez");
        logica.agregarGestor("Martina", "Martina1234","Martina Gonzalez");
        logica.agregarGestor("Jorge", "Jorge1234","Jorge Martinez");
        
        //CLIENTES PREFERENCIALES
        
        ClientePreferencial clientePref1 = new ClientePreferencial("lucas@rodriguez.com", "Lucas Preferencial");
        ClientePreferencial clientePref2 = new ClientePreferencial("xim@xim.com", "Ximena Preferencial");
        
        //CLIENTES COMUNES
        
        ClienteComun clienteCom1 = new ClienteComun("jorge@jorge.com", "Jorge Comun");
        ClienteComun clienteCom2 = new ClienteComun("sof@sof.com", "Sofia Comun");
        
        //CLIENTES CASA
        
        ClienteCasa clienteCasa1 = new ClienteCasa("martina@mart.com", "Martina Casa");
        ClienteCasa clienteCasa2 = new ClienteCasa("nic@nic.com", "Nicolas Casa");
        
        
        //MESAS
        Mesa mesa1 = new Mesa(1);
        Mesa mesa2 = new Mesa(2);
        Mesa mesa3 = new Mesa(3);
        Mesa mesa4 = new Mesa(4);
        Mesa mesa5 = new Mesa(5);
        
        logica.agregarMesa(mesa1);
        logica.agregarMesa(mesa2);
        logica.agregarMesa(mesa3);
        logica.agregarMesa(mesa4);
        logica.agregarMesa(mesa5);
        
        //PRODUCTOS
        
        Producto prod1 = new Producto(1,"Hamburgesa", 250,30);
        Producto prod2 = new Producto(2,"Tarta de pollo", 130,15);
        Producto prod3 = new Producto(3,"Milanesa de carne", 180,60);
        Producto prod4 = new Producto(1,"Milanesa de pollo", 220,20);
        Producto prod5 = new Producto(1,"Ravioles", 400,40);
        Producto prod6 = new Producto(1,"Ñoquis", 420,20);
        Producto prod7 = new Producto(1,"Strogonoff", 120,50);
        Producto prod8 = new Producto(1,"Guiso", 110,30);
        Producto prod9 = new Producto(1,"Pascualina", 50,30);
        
        logica.agregar(prod1);
        logica.agregar(prod2);
        logica.agregar(prod3);
        logica.agregar(prod4);
        logica.agregar(prod5);
        logica.agregar(prod6);
        logica.agregar(prod7);
        logica.agregar(prod8);
        logica.agregar(prod9);
        
        //SERVICIOS 
        
        Servicio serv1 = new Servicio(mesa1,mozo1);
        Servicio serv2 = new Servicio(mesa2,mozo3);
        
        
        
        
        
               
        
           
        
       
    }
    
}
