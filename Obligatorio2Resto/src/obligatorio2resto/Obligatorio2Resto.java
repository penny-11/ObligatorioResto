/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package obligatorio2resto;

import obligatorio2restoUIEscritorio.LoginGestor;
import ObligatorioInicio.DatosPrueba;

/**
 *
 * @author tomas
 */
public class Obligatorio2Resto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         DatosPrueba.cargar();
        LoginGestor inicio = new LoginGestor();
        inicio.setVisible(true);
    }
    
}
