package lab4_paulinaeuceda_judaponc;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab4_PaulinaEuceda_JudaPonc {

    static Scanner lea = new Scanner(System.in);
    static Random ran = new Random();

    static ArrayList<Jugadores> jugadores = new ArrayList();
    static ArrayList<Equipo> equipos = new ArrayList();

    public static void main(String[] args) {
        char salida = 's';
        while (salida == 's') {
            System.out.println("1) Equipo");
            System.out.println("2) Jugadores");
            System.out.println("3) Simulacion");
            System.out.println("4) Salir");
            System.out.print("Ingrese la opcion que desea: ");
            int opcionMenu1 = lea.nextInt();

            String casa="";
            int partidosGanados = 0, partidosPerdidos = 0, promedioAgilidad, promedioVelocidad, promedioFuerza;
            boolean equipoCreado = false;

            String nombre, año;
            int numUniforme, peso, nivelMusculatura, nivelReflejo;

            switch (opcionMenu1) {
                case 1:
                    System.out.println("1) Crear equipo");
                    System.out.println("2) Modifcar equipo");
                    System.out.println("3) Eliminar equipo");
                    System.out.println("4) Listar equipos");
                    System.out.println("5) Mostrar stat");
                    System.out.print("Ingrese la opcion que desea: ");
                    int opcionMenuEquipo = lea.nextInt();
                    switch (opcionMenuEquipo) {
                        case 1://equipo
                            System.out.println("1) Gryffindor");
                            System.out.println("2) Slytherin");
                            System.out.println("3) Ravenclaw");
                            System.out.println("4) Hufflepuff");
                            System.out.print("Ingrese la casa de su equipo: ");
                            int casaEleccion = lea.nextInt();
                            switch (casaEleccion) {
                                case 1:
                                    casa = "Gryffindor";
                                    break;
                                case 2:
                                    casa = "Slytherin";
                                    break;
                                case 3:
                                    casa = "Ravenclaw";
                                    break;
                                case 4:
                                    casa = "Hufflepuff";
                                    break;
                                default:
                                    System.out.println("Opcion incorrecta");
                                    break;
                            }//fin menu casa
                            
                            ArrayList<Jugadores> listaJugador = new ArrayList();
                            equipos.add(new Equipo(casa, partidosGanados, partidosPerdidos));
                            
                            //despues de aqui se crea el equipo
                            equipoCreado = true;
                            break;
                        case 2://modificar equipo
                            break;
                        case 3://eliminar equipo
                            break;
                        case 4://listar equipo
                            break;
                        case 5://mostrar stats
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                    }
                    break;
                case 2://jugador
                    if (equipoCreado == false) {
                        System.out.println("No hay equipos creados");
                        break;
                    }
                    System.out.println("1) Crear jugador");
                    System.out.println("2) Modifcar jugador");
                    System.out.println("3) Eliminar jugador");
                    System.out.println("4) Listar jugador");
                    System.out.print("Ingrese la opcion que desea: ");
                    int opcionMenuJugador = lea.nextInt();
                    switch (opcionMenuJugador) {
                        case 1://crear jugador
                            System.out.print("Ingrese el nombre del jugador: ");
                            nombre = lea.next();

                            System.out.println("1) 1er");
                            System.out.println("2) 2do");
                            System.out.println("3) 3er");
                            System.out.println("4) 4to");
                            System.out.println("5) 5to");
                            System.out.println("6) 6to");
                            System.out.println("7) 7mo");
                            System.out.print("Ingrese la opcion que desea ");
                            int añoEleccion = lea.nextInt();

                            char resp = 's';
                            while (resp == 's') {

                                switch (añoEleccion) {
                                    case 1:
                                        año = "Primero";
                                        resp = 'n';
                                        break;
                                    case 2:
                                        año = "Segundo";
                                        resp = 'n';
                                        break;
                                    case 3:
                                        año = "Tercero";
                                        resp = 'n';
                                        break;
                                    case 4:
                                        año = "Cuarto";
                                        resp = 'n';
                                        break;
                                    case 5:
                                        año = "Quinto";
                                        resp = 'n';
                                        break;
                                    case 6:
                                        año = "Sexto";
                                        resp = 'n';
                                        break;
                                    case 7:
                                        año = "Septimo";
                                        resp = 'n';
                                        break;
                                    default:
                                        System.out.println("Opcion incorrecta");
                                        break;
                                }
                            }
                            
                            resp = 's';
                            
                            while(resp == 's'){
                            System.out.println("1) Gryffindor");
                            System.out.println("2) Slytherin");
                            System.out.println("3) Ravenclaw");
                            System.out.println("4) Hufflepuff");
                            System.out.print("Ingrese la casa de su equipo: ");
                            int casaEleccion = lea.nextInt();
                            switch (casaEleccion) {
                                case 1:
                                    casa = "Gryffindor";
                                    resp = 'n';
                                    break;
                                case 2:
                                    casa = "Slytherin";
                                    resp = 'n';
                                    break;
                                case 3:
                                    casa = "Ravenclaw";
                                    resp = 'n';
                                    break;
                                case 4:
                                    casa = "Hufflepuff";
                                    resp = 'n';
                                    break;
                                default:
                                    System.out.println("Opcion incorrecta");
                                    break;
                            }//fin menu casa
                            }
                            
                            System.out.print("Ingrese el numero de uniforme: ");
                            año = lea.next();
                            
                            resp = 's';
                            while(resp=='s'){
                                System.out.println("1) Guardian");
                                System.out.println("2) Golpeador");
                                System.out.println("3) Cazadores");
                                System.out.println("4) Buscador");
                                System.out.print("Ingrese el tipo de jugador: ");
                                int jugadorEleccion = lea.nextInt();
                                switch (jugadorEleccion) {
                                    case 1:
                                        System.out.print("Ingrese el peso: ");
                                        peso = lea.nextInt();
                                        resp = 'n';
                                        break;
                                    case 2:
                                        System.out.print("Ingrese el nivel de musculatura [1-15]: ");
                                        nivelMusculatura = lea.nextInt();
                                        while(nivelMusculatura<1 || nivelMusculatura>15){
                                            System.out.println("No esta dentro del rango");
                                            System.out.print("Ingrese el nivel de musculatura [1-15]: ");
                                            nivelMusculatura = lea.nextInt();
                                        }
                                        
                                        
                                        System.out.print("Ingrese el nivel de reflejos [1-10]: ");
                                        nivelReflejo = lea.nextInt();
                                        while(nivelReflejo<1 || nivelReflejo>15){
                                            System.out.println("No esta dentro del rango");
                                            System.out.print("Ingrese el nivel de reflejos [1-10]: ");
                                            nivelReflejo = lea.nextInt();
                                        }
                                        
                                        
                                        
                                        break;
                                    default:
                                        System.out.println("Opcion incorrecta");
                                        break;
                                }
                            
                            }
                            
                            break;
                        case 2://modificar jugador

                            break;
                        case 3://eliminar jugador

                            break;
                        case 4://listar jugadores

                            break;
                        default:
                            System.out.println("Opcion Incorrecta");
                            break;
                    }

                    break;
                case 3: //simulacion
                    break;
                case 4: //salir
                    salida = 'n';
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }//fin switch1
        }//fin while salida
    }//fin main

}
