/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatorio2restoUIEscritorio;

import java.awt.Frame;
import obligatoriorestoLogica.Fachada;
import obligatoriorestoLogica.Gestor;
import obligatoriorestoLogica.UnidadProcesadora;
import obligatoriorestoLogica.Usuario;

/**
 *
 * @author tomas
 */
public class LoginGestor extends LoginGeneral{
    
    public LoginGestor(Frame parent, boolean modal){
        super(parent, modal);
    }
    
    @Override
    public Usuario Logear(String usuario, String pwd) {
        return Fachada.getInstancia().loginGestor(usuario, pwd);
    }

    @Override
    public void proxCasoUso(Object obj) {
        new MonitorPedidos((Gestor)obj).setVisible(true);
    }
    
    
}
