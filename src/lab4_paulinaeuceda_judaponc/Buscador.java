
package lab4_paulinaeuceda_judaponc;


public class Buscador extends Jugadores {
    
    int pesoBuscador;

    public Buscador() {
    }

    public Buscador(int pesoBuscador, String nombre, String anio, String casa, int numUniforme){
        super(nombre, anio, casa, numUniforme);
        this.pesoBuscador = pesoBuscador;
    }

    public int getPesoBuscador() {
        return pesoBuscador;
    }

    public void setPesoBuscador(int pesoBuscador) {
        this.pesoBuscador = pesoBuscador;
    }
    
    
    public int velocidadBuscador(){
        
        return (200/pesoBuscador)*7;
    }
    
    


    @Override
    public boolean ataque(int x) {
        boolean snitch=false;
        int velo=velocidadBuscador();
        if (velocidadBuscador()+14/14 > x) {
            snitch=true;
            System.out.println(" Atrapó el snitch");
            velo++;
           
            
        }else{
            System.out.println(" No atrapó el snitch");
        }
        return snitch;
    }

    @Override
    public boolean trampa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
