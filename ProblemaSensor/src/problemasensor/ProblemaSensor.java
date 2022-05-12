/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemasensor;

/**
 *
 * @author tomas
 */
public class ProblemaSensor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sensor s = new Sensor();
        s.agregarEscuchador(new AlarmaSonora());
        s.agregarEscuchador(new AlarmaSilenciosa());
        s.agregarEscuchador(new MecanismoTrampa());
        s.activa();
        s.desactiva();
        

    }
    
}
