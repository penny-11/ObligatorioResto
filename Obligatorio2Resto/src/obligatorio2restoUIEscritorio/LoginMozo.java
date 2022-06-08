/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatorio2restoUIEscritorio;

import java.awt.Frame;
import obligatoriorestoLogica.Fachada;
import obligatoriorestoLogica.Mozo;
import obligatoriorestoLogica.Usuario;
import obligatoriorestoLogica.UsuarioException;

/**
 *
 * @author tomas
 */
public class LoginMozo extends LoginGeneral{
    
    public LoginMozo(Frame parent, boolean modal){
        super(parent, modal);
    }
    
    @Override
    public Usuario Logear(String u, String pwd) throws UsuarioException{
       return Fachada.getInstancia().loginMozo(u, pwd);
    }

    @Override
    public void proxCasoUso(Object obj) {
        new VistaMozo((Mozo)obj).setVisible(true);
    }
    
}
