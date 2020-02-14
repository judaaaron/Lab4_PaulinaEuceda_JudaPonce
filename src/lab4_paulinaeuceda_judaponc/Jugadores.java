package lab4_paulinaeuceda_judaponc;

public abstract class Jugadores {

    private String nombre, anio, casa;
    private int numUniforme;

    public Jugadores() {
    }

    public Jugadores(String nombre, String anio, String casa, int numUniforme) {
        this.nombre = nombre;
        this.anio = anio;
        this.casa = casa;
        this.numUniforme = numUniforme;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public int getNumUniforme() {
        return numUniforme;
    }

    public void setNumUniforme(int numUniforme) {
        this.numUniforme = numUniforme;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", anio=" + anio + ", casa=" + casa + ", numUniforme=" + numUniforme + '}';
    }
    
    
     public abstract int ataque();
    

}
