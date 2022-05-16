/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriorestoLogica;

/**
 *
 * @author admin
 */
public class Fachada {
    private ControlUsuarios cu = new ControlUsuarios();
    
    
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
     
     
    
    
}
