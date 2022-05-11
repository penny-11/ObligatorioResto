/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemasensor;

/**
 *
 * @author tomas
 */
public class AlarmaSonora implements EscuchadorSensor{

    @Override
    public void detectaMovimiento() {
        sonido();
    }

    @Override
    public void detectaReposo() {
        silencio();
    }

    public void sonido() {
         System.out.println("WIU WIU WIU");
    }

    private void silencio() {
        System.out.print("....");
    }
    
}
