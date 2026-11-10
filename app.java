import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String paraula = "PAELLA";
        String lletres = "ABCDEFGHIJKLMNOPQSRTUVWYZ";

        int mida = paraula.length();
        int columnaAleatoria = random.nextInt(mida);

        System.out.println("==== TROBA LA PARAULA ====");

        for (int fila = 0; fila < mida; fila++) {
            for (int columna = 0; columna < mida; columna++) {

                if (fila == columnaAleatoria) {
                    System.out.print(paraula.charAt(columna) + " ");
                } else {
                    char lletra = lletres.charAt(random.nextInt(lletres.length()));
                    System.out.print(lletra + " ");
                }
            }
            System.out.println();
        }

        System.out.println("===========================");

        for (int fila = 0; fila < mida; fila++) {
            for (int columna = 0; columna < mida; columna++) {

                if (columna == columnaAleatoria) {
                    System.out.print(paraula.charAt(fila) + " ");
                } else {
                    char lletra = lletres.charAt(random.nextInt(lletres.length()));
                    System.out.print(lletra + " ");
                }

            }
            System.out.println();
        }

        System.out.println("===========================");

        for (int fila = 0; fila < mida; fila++) {
            for (int columna = 0; columna < mida; columna++) {

                if (fila == columna) {
                    System.out.print(paraula.charAt(fila) + " ");
                } else {
                    char lletra = lletres.charAt(random.nextInt(lletres.length()));
                    System.out.print(lletra + " ");
                }

            }
            System.out.println();
        }

        int opcio = 0;
        while (opcio != 6) {
            System.out.println("==== MENU PRINCIPAL ====");
            System.out.println("1. Descobrir la longitud de la paraula");
            System.out.println("2. Descobrir lletra inicial");
            System.out.println("3. Descobrir lletra final");
            System.out.println("4. Descobrir lletra");
            System.out.println("5. Comptar el nombre de vocals");
            System.out.println("6. Rendir-se");
            System.out.println("========================");
            try {
                System.out.print("Opció: ");
                opcio = scanner.nextInt();
                scanner.nextLine();

                if (opcio < 1 || opcio > 6) {
                    throw new IllegalArgumentException("Error, posa un numero del 1 al 6");
                }

            } catch (IllegalArgumentException e) { // PERO SABER QUE HA DE POSAR UN NUMERO ENTRE L'1 I EL 6
                System.out.println(e.getMessage());

            } catch (InputMismatchException e) { // PER QUE SAPIGA QUE S'HA DE POSAR UN NUMERO
                System.out.println("ERROR, has de posar un numero");
                scanner.nextLine();
                

            } catch (Exception e) {
                System.out.println("ERROR");
                scanner.nextLine();
            }

            switch (opcio) {
                case 1:
                    System.out.println("La llonguitut es de 6 paraules");
                    break;

                case 2:
                    System.out.println("La primera lletra es la P");
                    break;

                case 3:
                    System.out.println("L'ultima lletra es la A");
                    break;

                case 4:

                    System.out.print("Posa un lletra: ");
                    String lletraDescoberta = scanner.nextLine();

                    if (lletraDescoberta.equalsIgnoreCase("A")) {
                        System.out.println("Esta en la 2a i 6a lletra");

                    } else if (lletraDescoberta.equalsIgnoreCase("P")) {
                        System.out.println("Es la 1a lletra");

                    } else if (lletraDescoberta.equalsIgnoreCase("E")) {
                        System.out.println("Es la 3a lletra");

                    } else if (lletraDescoberta.equalsIgnoreCase("L")) {
                        System.out.println("Esta en la 4a i 5a lletras");

                    } else {
                        System.out.println("La lletra no esta a la paraula");
                    }
                    break;

                case 5:
                    System.out.println("La paraula te 3 vocals");
                    break;

                case 6:
                    System.out.println("La paraula es PAELLA!!!!");
                    break;

                default:
                    break;
            }

            String encertada;
            System.out.print("Quina paraula es: ");
            encertada = scanner.nextLine();
            if (encertada.equalsIgnoreCase(paraula)) {
                System.out.println("Correcteeee!!!! La paraula es PAELLA");
                break;

            } else {
                System.out.println("Incorrecte!!");
                scanner.nextLine();
            }
        }

    }
}