/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatoriorestoLogica;

/**
 *
 * @author tomas
 */
public abstract class UnidadProcesadora {
    
    protected String nombre;

    public UnidadProcesadora(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract String getNombre();
    
}
