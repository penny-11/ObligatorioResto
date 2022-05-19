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
public class ControlServicio {

    private ArrayList<Mesa> mesas = new ArrayList();

    public void asignarMesas(Mozo mozo) {
        for (Mesa me : mesas) {
            if (mozo.getMesas().isEmpty()) {
                mozo.addMesa(me);
            }
        }
    }
    
    
}
