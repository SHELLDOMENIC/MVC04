
package espoch.edu.ec.mvc04febrero2025.Modelo;

/**
 *
 * @author and_jshell>Dominik
 */
public class Tarea {
    //atributos
    private int id;
    private String titulo;
    private String descripcion;
    private boolean TareaCompleta;

    public Tarea(int id, String titulo, String descripcion, boolean TareaCompleta) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.TareaCompleta = TareaCompleta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isTareaCompleta() {
        return TareaCompleta;
    }

    public void setTareaCompleta(boolean TareaCompleta) {
        this.TareaCompleta = TareaCompleta;
    }
    
    
}
