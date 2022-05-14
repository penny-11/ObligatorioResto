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
public class ControlUsuarios {
    
    private ArrayList<Usuario> usuariosMozo = new ArrayList();
    private ArrayList<Usuario> usuariosGestores = new ArrayList();
    
    public Mozo loginMozo(String u,String p){
        return (Mozo) verificarUsuario(u, p, usuariosMozo);     
    }
    public Gestor loginGestor(String u,String p){
        return (Gestor) verificarUsuario(u, p, usuariosGestores);     
    }
     
     private Usuario verificarUsuario(String u,String p,ArrayList usuarios){
        Usuario usr;
        for(Object obj:usuariosMozo){
            usr = (Usuario) obj;
            if(usr.getUsuario().equalsIgnoreCase(u) && 
                    usr.getPassword().equals(p)){
                    return usr;
            }
        }
        return null;
    }
     
    public boolean crearUsuarioMozo(String us, String pwd,String nomCom,String tel){
        usuariosMozo.add(new Mozo(us,pwd, nomCom,tel));
        return true;
    }
    
    public boolean crearUsuarioGestor(String us, String pwd,String nomCom){
        usuariosMozo.add(new Gestor(us,pwd, nomCom));
        return true;
    }
    
}
