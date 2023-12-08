
package PrestamoCD_Daniel_Calderon;


public class Cd extends Articulo implements PrestarArticulo{
    
    private String artista;
    private int numPistas;
    private int prestado;

    public Cd(String artista, int numPistas, int id, String titulo, int duracion, int anioLanzamiento) {
        super(id, titulo, duracion, anioLanzamiento);
        this.artista = artista;
        this.numPistas = numPistas;
        this.prestado = 0;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getNumPistas() {
        return numPistas;
    }

    public void setNumPistas(int numPistas) {
        this.numPistas = numPistas;
    }

    public int isPrestado() {
        return prestado;
    }
    
    

    @Override
    public void prestar() {
        this.prestado = 1; 
    }

    @Override
    public void devolver() {
        this.prestado = 0; 
    }
    
    
    
}
