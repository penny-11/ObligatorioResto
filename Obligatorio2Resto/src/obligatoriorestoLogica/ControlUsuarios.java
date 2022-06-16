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
        }else if(mozo.isConectado()){
            throw new UsuarioException("Ud. ya está logueado");
        }
        mozo.setConectado(true);
        return mozo;
    }

    public Gestor loginGestor(String u, String p) throws UsuarioException{
        Gestor gestor=(Gestor) verificarUsuario(u, p, usuariosGestores);
        if(gestor==null){
            throw new UsuarioException("Nombre de usuario y/o contraseña incorrectos");
        }else if(gestor.isConectado()){
            throw new UsuarioException("Ud. ya está logueado");
        }
        gestor.setConectado(true);
        return gestor;
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

    public boolean crearUsuarioMozo(Mozo unMozo) {
        usuariosMozo.add(unMozo);
        return true;
    }

    public void crearUsuarioGestor(Gestor gestor) {
        usuariosGestores.add(gestor);
    }
    
    public ArrayList<Mozo> getMozos(){
        return usuariosMozo;
    }
    
    public ArrayList<Gestor> getGestores(){
        return usuariosGestores;
    }
    
    public ArrayList<Mozo> getMozosConectados(){
        int count=0;
        ArrayList<Mozo> mozosConectados=new ArrayList();
        for(Mozo mo:usuariosMozo){
            if(mo.isConectado()){
                for(Mesa me:mo.getMesas()){
                    if(me!=null){
                        count++;
                    }
                }
                if(count<5){
                    mozosConectados.add(mo);
                }
            }
        }
        return mozosConectados;
    }

}
