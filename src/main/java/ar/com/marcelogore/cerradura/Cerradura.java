package ar.com.marcelogore.cerradura;


public class Cerradura {

    private int clave = 0;
    
    public Cerradura(int clave, int numeroDeIntentos) {
        
        this.clave = clave;
    }
    
    public boolean abrio(int clave) {
        
        return this.clave == clave;
    }
}
