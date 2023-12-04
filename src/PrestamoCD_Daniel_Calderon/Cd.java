
package PrestamoCD_Daniel_Calderon;


public class Cd extends Articulo implements PrestarArticulo{
    
    private String artista;
    private int numPistas;
    private boolean prestado;

    public Cd(String artista, int numPistas, String titulo, int duracion, int anioLanzamiento) {
        super(titulo, duracion, anioLanzamiento);
        this.artista = artista;
        this.numPistas = numPistas;
        this.prestado = false;
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

    public boolean isPrestado() {
        return prestado;
    }
    
    

    @Override
    public void prestar() {
        this.prestado = true; 
    }

    @Override
    public void devolver() {
        this.prestado = false; 
    }
    
    
    
}
