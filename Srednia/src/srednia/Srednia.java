package srednia;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Wojtek
 */
public class Srednia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tworzenie tablicy
        ArrayList<Double> Liczby = new ArrayList<Double>();
        Scanner wejście = new Scanner(System.in);
        System.out.println("podaj ile liczb");
        int ileLiczb = 0;
        while (true) {
            try {
                // z ilu liczb będzie liczona średniaj
                ileLiczb = Integer.parseInt(wejście.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("podawane wartości musza być liczbowe");
            }
        }
        double suma = 0;
        // pobieranie liczb z konsoli, dodanie do tablicy i obliczanie ich sumy
        for (int i = 0; i < ileLiczb; i++) {
            System.out.println("podaj Liczbę " + (i + 1));
            while (true) {
                try {
                    Liczby.add(Double.parseDouble(wejście.nextLine()));
                    suma = suma + Liczby.get(i);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("podawane wartości musza być liczbowe");
                }
            }
        }
        // obliczanie i wyświetlanie wartości średniej dla podanych liczb
        double średnia = suma / ileLiczb;
        System.out.println(średnia);
    }
}
