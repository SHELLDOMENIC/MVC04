
package espoch.edu.ec.mvc04febrero2025.Controlador;

import espoch.edu.ec.mvc04febrero2025.Modelo.GestorTarea;
import espoch.edu.ec.mvc04febrero2025.Vista.Vista;

/**
 *
 * @author and_jshell>Dominik
 */
public class Controlador {
    //lineas de coneccion con vista 
  private Vista vista; 
  private GestorTarea modelo;

    public Controlador(Vista vista, GestorTarea modelo) {
        this.vista = vista;
        //lineas de conexion
        this.modelo = new GestorTarea();
    }
    public void procesoGestorTarea (){
    //si los datos son corectos pasa el modelo, caso contrario los devuelve a la vista
    }
  
    
}
