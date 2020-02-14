package lab4_paulinaeuceda_judaponc;

import java.util.Scanner;

public class Exceptions extends Exception {

    static Scanner lea = new Scanner(System.in);
    private String casa, casa2;

    public Exceptions() {
        super();
    }

    public Exceptions(String casa, String casa2) {
        setCasa(casa);
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        boolean houses = false;

        while (casa.equals(casa2)) {
            houses = true;

        }

        if (houses == true) {

        } else {
            System.out.println(" El equipo y jugador deben de pertencer a la misma casa");
            System.out.println(" seleccione la casa correspondiente");
            System.out.println("1) Gryffindor");
            System.out.println("2) Slytherin");
            System.out.println("3) Ravenclaw");
            System.out.println("4) Hufflepuff");
            String newHouse = lea.next();
            this.casa = newHouse;
        }
    }

    @Override
    public String toString() {
        return "Exceptions{" + "casa=" + casa + '}';
    }

}
