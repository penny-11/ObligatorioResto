/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemasensor;

/**
 *
 * @author tomas
 */
public class AlarmaSilenciosa implements EscuchadorSensor{

    @Override
    public void detectaMovimiento() {
        llamar("Se detecto movimiento");
        
    }

    @Override
    public void detectaReposo() {
        llamar("Ya no hay movimiento");
    }

    private void llamar(String mensaje) {
        System.out.print(mensaje);
    }

    
    
}
