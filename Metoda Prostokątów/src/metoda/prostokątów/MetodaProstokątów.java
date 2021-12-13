package metoda.prostokątów;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Wojtek
 */
public class MetodaProstokątów {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Double> Liczby = new ArrayList<>();
        Scanner wejście = new Scanner(System.in);
        System.out.println("podaj ile liczb");
        int ileLiczb = wejście.nextInt();
        System.out.println("podaj szerokość przedziału");
        double dx = wejście.nextDouble();
        double suma = 0;
        for (int i = 0; i < ileLiczb; i++) {
            System.out.println("podaj kolejną wartość y" + (i + 1));
            Liczby.add(wejście.nextDouble());
            suma = suma + Liczby.get(i);
        }
        double całka = suma / ileLiczb * dx * (ileLiczb -1);
        System.out.println("wartość całki = " + całka);
    }

}
