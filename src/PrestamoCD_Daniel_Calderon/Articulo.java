
package PrestamoCD_Daniel_Calderon;


public class Articulo {
    
        private int id;
    private String titulo;
    private int duracion;
    private int anioLanzamiento;

    public Articulo(int id, String titulo, int duracion, int anioLanzamiento) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = duracion;
        this.anioLanzamiento = anioLanzamiento;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }
    
    
    
}
