import java.util.Scanner;

public class feladat1 {
    public static void main(String[] args) {

        /*A beolvasáshoz szükséges*/
        Scanner sc = new Scanner(System.in);


        System.out.print("Kérem adja meg a medence átmérőjét: ");
        /*Bekérjük a medence átmérőjét*/
        double atmero = sc.nextDouble();

        System.out.print("Kérem adja meg a medence magasságát: ");
        double magassag = sc.nextDouble();

        /*Számítások*/
        double sugar = atmero / 2;
        double terulet = sugar * sugar * Math.PI;
        double terfogat = terulet * magassag;

        /*Kiiratás*/
        System.out.printf("A medence térfogata %.3f köbméter", terfogat);


    }
}
