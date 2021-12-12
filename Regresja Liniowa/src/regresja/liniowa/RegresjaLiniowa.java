package regresja.liniowa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Wojtek
 */
public class RegresjaLiniowa {

    public static void main(String[] args) {
        // tablice punktów
        ArrayList<Double> LiczbyX = new ArrayList<>();
        ArrayList<Double> LiczbyY = new ArrayList<>();

        double sumaX = 0;
        double sumaXX = 0;
        double sumaY = 0;
        double sumaYY = 0;
        double sumaXY = 0;

        Scanner wejście = new Scanner(System.in);
        System.out.println("podaj liczbę punktów");
        
        int liczbaPunktów = wejście.nextInt();
        //wypełnienie tablicy punktami i ich suma
        for (int i = 0; i < liczbaPunktów; i++) {
            System.out.println("podaj punkt x" + (i + 1));
            LiczbyX.add(wejście.nextDouble());
            sumaX = sumaX + LiczbyX.get(i);
            sumaXX = sumaXX + Math.pow(LiczbyX.get(i), 2);

        }
        //wypełnienie tablicy punktami i ich suma
        for (int i = 0; i < liczbaPunktów; i++) {
            System.out.println("podaj punkt y" + (i + 1));
            LiczbyY.add(wejście.nextDouble());
            sumaY = sumaY + LiczbyY.get(i);
            sumaYY = sumaYY + Math.pow(LiczbyY.get(i), 2);

        }
        //suma pomnożonych elementów tablic
        for (int i = 0; i < liczbaPunktów; i++) {

            sumaXY = sumaXY + LiczbyX.get(i) * LiczbyY.get(i);
        }

        double delta = liczbaPunktów * sumaXX - Math.pow(sumaX, 2);
        double a = (liczbaPunktów * sumaXY - sumaX * sumaY) / delta;
        double b = (sumaXX * sumaY - sumaX * sumaXY) / delta;
        double r = (liczbaPunktów * sumaXY - sumaX * sumaY) / (Math.sqrt((liczbaPunktów * sumaXX - Math.pow(sumaX, 2)) * (liczbaPunktów * sumaYY - Math.pow(sumaY, 2))));
        System.out.print("równanie regresji ");
        System.out.println("y=" + a + "x + " + b);
        System.out.print("współczynnik korelacji = ");
        System.out.format("%.4f", r);
    }
}
