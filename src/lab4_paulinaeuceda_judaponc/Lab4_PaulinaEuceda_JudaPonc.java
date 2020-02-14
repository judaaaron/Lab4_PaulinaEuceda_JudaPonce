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

            String casa = "";
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

                            if (equipos.isEmpty()) {
                                System.out.println(" No hay equipos registrados hasta el momento");
                                System.out.println();
                                break;

                            }
                            String endi = "";
                            for (Object o : equipos) {

                                endi += " [" + equipos.indexOf(o) + "] " + o + "\n";

                            }
                            System.out.println();
                            System.out.println(endi);
                            System.out.print(" Seleccione la posicion para modificar la casa del equipo: ");
                            int posi = lea.nextInt();
                            boolean value = false;
                            for (int i = 0; i < equipos.size(); i++) {
                                if (posi == i) {
                                    value = false;
                                    break;
                                } else {
                                    value = true;
                                }

                            }

                            if (value == false) {
                                String newCasa = "";
                                System.out.println(" Ingrese un nueva casa: ");
                                System.out.println("1) Gryffindor");
                                System.out.println("2) Slytherin");
                                System.out.println("3) Ravenclaw");
                                System.out.println("4) Hufflepuff");
                                int opciones = lea.nextInt();
                                switch (opciones) {
                                    case 1:
                                        newCasa = "Gryffindor";
                                        break;

                                    case 2:
                                        newCasa = "Slytherin";
                                        break;

                                    case 3:
                                        newCasa = "Ravenclaw";
                                        break;

                                    case 4:
                                        newCasa = "Hufflepuff";
                                        break;
                                    default:
                                        System.out.println(" Opcion incorrecta");
                                        System.out.println("");
                                }

                                equipos.get(posi).setCasa(newCasa);
                                System.out.println(" Casa del equipo ha modificada con exito");
                                System.out.println();

                            } else {
                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                System.out.println();

                            }

                            break;
                        case 3://eliminar equipo

                            if (equipos.isEmpty()) {
                                System.out.println(" No hay equipos registrados hasta el momento");
                                System.out.println();
                                break;

                            }
                            String salidass = "";
                            for (Object o : equipos) {

                                salidass += " [" + equipos.indexOf(o) + "] " + o + "\n";

                            }
                            System.out.println();
                            System.out.println(salidass);
                            System.out.println(" Seleccione la posicion para eliminar el equipo");
                            int posicion = lea.nextInt();
                            boolean name = false;
                            for (int i = 0; i < equipos.size(); i++) {
                                if (posicion == i) {
                                    name = false;
                                    break;
                                } else {
                                    name = true;
                                }

                            }
                            if (name == false) {
                                equipos.remove(posicion);
                                System.out.println(" El equipo ha sido eliminado con exito");
                                System.out.println();

                            } else {
                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                System.out.println();

                            }

                            break;
                        case 4://listar equipo
                            if (equipos.isEmpty()) {
                                System.out.println(" No hay equipos registrados hasta el momento");
                                System.out.println();
                                break;

                            }

                            String salidas = "";
                            for (Object o : equipos) {

                                salidas += " [" + equipos.indexOf(o) + "] " + o + "\n";

                            }
                            System.out.println(salidas);

                            break;
                        case 5://mostrar stats
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                            System.out.println("");
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

                            while (resp == 's') {
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
                            while (resp == 's') {
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
                                        while (nivelMusculatura < 1 || nivelMusculatura > 15) {
                                            System.out.println("No esta dentro del rango");
                                            System.out.print("Ingrese el nivel de musculatura [1-15]: ");
                                            nivelMusculatura = lea.nextInt();
                                        }

                                        System.out.print("Ingrese el nivel de reflejos [1-10]: ");
                                        nivelReflejo = lea.nextInt();
                                        while (nivelReflejo < 1 || nivelReflejo > 15) {
                                            System.out.println("No esta dentro del rango");
                                            System.out.print("Ingrese el nivel de reflejos [1-10]: ");
                                            nivelReflejo = lea.nextInt();
                                        }
                                        resp = 'n';

                                        break;
                                    case 3:
                                        System.out.print("Ingrese el peso: ");
                                        peso = lea.nextInt();

                                        System.out.print("Ingrese el nivel de reflejos [1-10]: ");
                                        nivelReflejo = lea.nextInt();
                                        while (nivelReflejo < 1 || nivelReflejo > 15) {
                                            System.out.println("No esta dentro del rango");
                                            System.out.print("Ingrese el nivel de reflejos [1-10]: ");
                                            nivelReflejo = lea.nextInt();
                                        }
                                        resp = 'n';
                                        break;
                                    default:
                                        System.out.println("Opcion incorrecta");
                                        break;
                                }

                            }

                            break;
                        case 2://modificar jugador

                            if (equipos.isEmpty()) {
                                System.out.println(" No hay Jugadores registrados hasta el momento");
                                System.out.println();
                                break;

                            }
                            String endi = "";
                            for (Object o : jugadores) {

                                endi += " [" + jugadores.indexOf(o) + "] " + o + "\n";

                            }
                            System.out.println();
                            System.out.println(endi);

                            System.out.println(" Seleccione la posicion de la lista de jugadores");
                            int position = lea.nextInt();
                            boolean playerss = false;
                            for (int i = 0; i < jugadores.size(); i++) {
                                if (position == i) {
                                    playerss = false;
                                    break;
                                } else {
                                    playerss = true;
                                }

                            }

                            if (playerss == false) {
                                System.out.println(" Seleccione que desea modificar del jugadore");
                                System.out.println(" 1. Nombre");
                                System.out.println(" 2. Curso");
                                System.out.println(" 3. Casa");
                                System.out.println(" 4. Numero de unifome");
                                int opi = lea.nextInt();
                                switch (opi) {
                                    case 1:
                                        System.out.println(" Opcion modificar: Nombre del jugador");
                                        System.out.print(" Ingrese un nuevo nombre: ");
                                        String newNombre = lea.next();
                                        jugadores.get(position).setNombre(newNombre);
                                        System.out.println(" Nombre del jugadores ha sido modificado con exito");
                                        System.out.println();
                                        break;

                                    case 2:
                                        String newCurso = "";
                                        System.out.println(" Opcion modificar: curso del jugador");
                                        System.out.print(" seleccione un nuevo curso para ser modificado: ");
                                        System.out.println("1) 1er");
                                        System.out.println("2) 2do");
                                        System.out.println("3) 3er");
                                        System.out.println("4) 4to");
                                        System.out.println("5) 5to");
                                        System.out.println("6) 6to");
                                        System.out.println("7) 7mo");
                                        System.out.print("Ingrese la opcion que desea ");
                                        int curso = lea.nextInt();
                                        switch (curso) {
                                            case 1:
                                                newCurso = "Primero";
                                                break;

                                            case 2:
                                                newCurso = "Segundo";

                                                break;

                                            case 3:
                                                newCurso = "Tercero";

                                                break;

                                            case 4:
                                                newCurso = "Cuarto";

                                                break;

                                            case 5:
                                                newCurso = "Quinto";

                                                break;

                                            case 6:
                                                newCurso = "Sexto";

                                                break;

                                            case 7:
                                                newCurso = "Septimo";
                                                break;
                                            default:
                                                System.out.println(" Opcion incorrecta");
                                                System.out.println();
                                        }

                                        jugadores.get(position).setAnio(newCurso);
                                        System.out.println(" Curso del jugador ha sido modicado con exito");
                                        System.out.println();

                                        break;

                                    case 3:// modificar casa
                                        String newCasa = "";
                                        System.out.println(" Opcion modificar: Casa del jugador");
                                        System.out.print(" seleccione un nueva casa para ser modificado: ");
                                        System.out.println("1. Gryffindor");
                                        System.out.println("2. Slytherin");
                                        System.out.println("3. Ravenclaw");
                                        System.out.println("4. Hufflepuff");
                                        int house = lea.nextInt();
                                        switch (house) {
                                            case 1:
                                                newCasa = "Gryffindor";
                                                break;

                                            case 2:
                                                newCasa = "Slytherin";
                                                break;

                                            case 3:
                                                newCasa = "RavenClaw";
                                                break;

                                            case 4:
                                                newCasa = "Hufflepuff";
                                                break;
                                            default:
                                                System.out.println(" Opcion incorrecta");
                                                System.out.println();
                                        }

                                        jugadores.get(position).setCasa(newCasa);
                                        System.out.println(" Casa del jugador ha sido modificada con exito");
                                        System.out.println();

                                        break;

                                    case 4:// modificar numero 
                                        System.out.println(" Opcion modificar: Numero de uniforme");
                                        System.out.print(" Ingrese numero que desea");
                                        int newNum = lea.nextInt();
                                        jugadores.get(position).setNumUniforme(newNum);
                                        System.out.println(" Numero de uniforme ha sido modificado con exito");
                                        System.out.println();

                                        break;
                                    default:
                                        System.out.println(" Opcion incorrecta");
                                        System.out.println();
                                }

                            } else {
                                System.out.println(" Error!! posicion seleccionada esta vacia");
                                System.out.println();
                            }

                            break;
                        case 3://eliminar jugador
                            if (jugadores.isEmpty()) {
                                System.out.println(" No hay jugadores registrados hasta el momento");
                                System.out.println();
                                break;

                            }
                            String salidass = "";
                            for (Object o : jugadores) {

                                salidass += " [" + jugadores.indexOf(o) + "] " + o + "\n";

                            }
                            System.out.println(salidass);
                            System.out.println(" Seleccione la posicion para eliminar el jugador");
                            int posicion = lea.nextInt();
                            boolean name = false;
                            for (int i = 0; i < jugadores.size(); i++) {
                                if (posicion == i) {
                                    name = false;
                                    break;
                                } else {
                                    name = true;
                                }

                            }
                            if (name == false) {
                                jugadores.remove(posicion);
                                System.out.println(" El jugador ha sido eliminado con exito");
                                System.out.println();

                            } else {
                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                System.out.println();

                            }

                            break;
                        case 4://listar jugadores
                            String salid = "";
                            for (Object o : jugadores) {

                                salid += " [" + jugadores.indexOf(o) + "] " + o + "\n";

                            }
                            System.out.println(salid);

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
