package lab4_paulinaeuceda_judaponc;

public class golpeador extends Jugadores {

    private int musculatura, reflejos;

    public golpeador() {
        super();
    }

    public golpeador(int musculatura, int reflejos, String nombre, String anio, String casa, int numUniforme) throws Exception {
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

    public int agilidadGolpeador() {

        return reflejos + 7;
    }

    public int fuerzaGolpeador() {
        return (musculatura * 2) - 7;
    }

    @Override
    public String toString() {
        return super.toString()+ "golpeador{" + "musculatura=" + musculatura + ", reflejos=" + reflejos;
    }

    @Override
    public boolean ataque(int sumaFuerzas) {
        boolean exito = false;
        int force = fuerzaGolpeador();
        int agilidad = agilidadGolpeador();
        if (fuerzaGolpeador() * 2 > sumaFuerzas) {
            exito = true;
            System.out.println(" Logró atacó con exito");
            force += 10;
        } else if (agilidadGolpeador() / 2 > sumaFuerzas) {
            agilidad += 10;
            System.out.println(" Logró defender con exito");
            exito = false;
        }
        return exito;
    }

    @Override
    public boolean trampa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
