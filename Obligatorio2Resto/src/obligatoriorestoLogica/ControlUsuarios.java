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

    private ArrayList<Mozo> usuariosMozo = new ArrayList();
    private ArrayList<Gestor> usuariosGestores = new ArrayList();

    public Mozo loginMozo(String u, String p) throws UsuarioException {
        Mozo mozo=(Mozo) verificarUsuario(u, p, usuariosMozo);
        if(mozo==null){
            throw new UsuarioException("Nombre de usuario y/o contraseña incorrectos");
        }else if(mozo.getConexion()==true){
            throw new UsuarioException("Ud. ya está logueado");
        }
        return mozo;
    }

    public Gestor loginGestor(String u, String p) {
        return (Gestor) verificarUsuario(u, p, usuariosGestores);
    }

    private Usuario verificarUsuario(String u, String p, ArrayList usuarios) {
        Usuario usr;
        for (Object obj : usuarios) {
            usr = (Usuario) obj;
            if (usr.getUsuario().equalsIgnoreCase(u)
                    && usr.getPassword().equals(p)) {
                return usr;
            }
        }
        return null;
    }

    public boolean crearUsuarioMozo(String us, String pwd, String nomCom, String tel) {
        usuariosMozo.add(new Mozo(us, pwd, nomCom, tel));
        return true;
    }

    public boolean crearUsuarioGestor(String us, String pwd, String nomCom) {
        usuariosGestores.add(new Gestor(us, pwd, nomCom));
        return true;
    }
    
    public ArrayList<Mozo> getMozos(){
        return usuariosMozo;
    }
    
    public ArrayList<Gestor> getGestores(){
        return usuariosGestores;
    }
    
    public ArrayList<Mozo> getMozosConectados(){
        ArrayList<Mozo> mozosConectados=new ArrayList();
        for(Mozo mo:usuariosMozo){
            if(mo.getConexion()){
                mozosConectados.add(mo);
            }
        }
        return mozosConectados;
    }

}
