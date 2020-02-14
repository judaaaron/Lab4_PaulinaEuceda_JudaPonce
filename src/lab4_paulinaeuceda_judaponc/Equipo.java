package lab4_paulinaeuceda_judaponc;

import java.util.ArrayList;

public class Equipo {

    private String nameTeam, casa;
    private int cantGanados, cantPerdidos;
    private ArrayList <Jugadores> players= new ArrayList();

    public Equipo() {
    }

    public Equipo(String nameTeam, String casa, int cantGanados, int cantPerdidos) {
        this.nameTeam = nameTeam;
        this.casa = casa;
        this.cantGanados = cantGanados;
        this.cantPerdidos = cantPerdidos;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public int getCantGanados() {
        return cantGanados;
    }

    public void setCantGanados(int cantGanados) {
        this.cantGanados = cantGanados;
    }

    public int getCantPerdidos() {
        return cantPerdidos;
    }

    public void setCantPerdidos(int cantPerdidos) {
        this.cantPerdidos = cantPerdidos;
    }

    public ArrayList<Jugadores> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Jugadores> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nameTeam=" + nameTeam + ", casa=" + casa + ", cantGanados=" + cantGanados + ", cantPerdidos=" + cantPerdidos + ", players=" + players + '}';
    }
    
    
    
    
    
}
