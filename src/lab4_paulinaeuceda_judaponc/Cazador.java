
package lab4_paulinaeuceda_judaponc;


public class Cazador extends Jugadores {
    
    private int peso, reflejo;

    public Cazador() {
    }
    
    

    public Cazador(int peso, int reflejo, String nombre, String anio, String casa, int numUniforme){
        super(nombre, anio, casa, numUniforme);
        this.peso = peso;
        this.reflejo = reflejo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getReflejo() {
        return reflejo;
    }

    public void setReflejo(int reflejo) {
        this.reflejo = reflejo;
    }
    
    
    public int velocidadCazador(){
        
        return (200/peso)*7;
        
    }
    
    public int agilidadCazador(){
        
        return reflejo+7;
    }

    @Override
    public boolean ataque(int x) {
        boolean gol;
        int sumaCazador=velocidadCazador()+agilidadCazador();
        int puntoVelocidad=velocidadCazador(), puntoAgilidad=agilidadCazador();
        if (sumaCazador>=x) {
            gol=true;
            System.out.println(" Anotó gol");
            puntoVelocidad+=6;
            puntoAgilidad+=6;
        }else{
            gol=false;
            System.out.println(" Falló gol");
        }
        
        return gol;
       
    }

    @Override
    public boolean trampa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

 
    
    
    
}
