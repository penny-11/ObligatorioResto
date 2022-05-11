/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemasensor;

/**
 *
 * @author tomas
 */
public class MecanismoTrampa implements EscuchadorSensor{

    @Override
    public void detectaMovimiento() {
        abrirFosa();
    }

    @Override
    public void detectaReposo() {
        cerrarFosa();
    }

    private void abrirFosa() {
        System.out.print("Se abre Fosa");
    }

    private void cerrarFosa() {
        System.out.print("Se cierra Fosa");
    }
    
    
    
}
