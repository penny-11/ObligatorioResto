package ObligatorioInicio;



import obligatorio2restoUIEscritorio.UnidadesProcesadoras;
import obligatorio2restoUIEscritorio.Login;
import obligatorio2restoUIEscritorio.LoginGestor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Main {
     public static void main(String[] args) throws Exception {
        DatosPrueba.cargar();
        new LoginGestor().setVisible(true);
       
      } 
     
    
    
}
