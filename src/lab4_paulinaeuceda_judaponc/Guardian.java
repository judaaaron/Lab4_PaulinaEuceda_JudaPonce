package lab4_paulinaeuceda_judaponc;

public class Guardian extends Jugadores {

    private int reflejo;

    public Guardian() {
        super();
    }


    public Guardian(int reflejo, String nombre, String anio, String casa, int numUniforme) throws Exception {


        super(nombre, anio, casa, numUniforme);
        this.reflejo = reflejo;
    }

    public double getReflejo() {
        return reflejo;
    }

    public void setReflejo(int reflejo) {
        this.reflejo = reflejo;
    }

    public int agilidadGuardian() {
        return reflejo + 7;

    }

    
    public boolean ataque(int velocidad) {
        boolean guardi;
        int agiGuardia = agilidadGuardian();
        if (agilidadGuardian() > velocidad) {
            guardi = true;
            agiGuardia += 7;
            System.out.println(" Atajó el gol");

        } else {
            guardi = false;
            System.out.println(" Recibió gol");
        }
        return guardi;
    }

    @Override
    public boolean trampa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    

}
