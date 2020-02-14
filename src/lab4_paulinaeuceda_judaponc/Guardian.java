package lab4_paulinaeuceda_judaponc;

public class Guardian extends Jugadores {

    private double peso;

    public Guardian() {
        super();
    }

    public Guardian(double peso, String nombre, String anio, String casa, int numUniforme) {
        super(nombre, anio, casa, numUniforme);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double velocidad() {
        return (200 / peso) * 7;
    }

    @Override
    public int ataque() {
        return 0;
    }
    
    

}
