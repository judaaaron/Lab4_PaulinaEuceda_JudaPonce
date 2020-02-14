package lab4_paulinaeuceda_judaponc;

public class golpeador extends Jugadores {

    private int musculatura, reflejos;

    public golpeador() {
        super();
    }

    public golpeador(int musculatura, int reflejos, String nombre, String anio, String casa, int numUniforme) {
        super(nombre, anio, casa, numUniforme);
        this.musculatura = musculatura;
        this.reflejos = reflejos;
        
    }

    public int getMusculatura() {
        return musculatura;
    }

    public void setMusculatura(int musculatura) {
        this.musculatura = musculatura;
    }

    public int getReflejos() {
        return reflejos;
    }

    public void setReflejos(int reflejos) {
        this.reflejos = reflejos;
    }

    public int agilidad(){
        
        return reflejos+7;
    }
    
    public int fuerza() {
        return (musculatura * 2) - 7;
    }

    @Override
    public String toString() {
        return "golpeador{" + "musculatura=" + musculatura + ", reflejos=" + reflejos ;
    }
    
    

    @Override
    public int ataque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
