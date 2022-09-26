import java.util.Scanner;

public class feladat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy pozitív valós számot: ");
        double pvs = sc.nextDouble();

        double also_hatar = Math.floor(pvs);
        double felso_hatar = Math.ceil(pvs);
        double kerekitett = Math.round(pvs);

        System.out.printf("A megadott szám a %f és a %f egész számok között van, és ezek közül a %f számhoz van közelebb.%n", also_hatar, felso_hatar, kerekitett);
        System.out.printf("A szám egész része: %.0f%n", pvs);
        System.out.printf("A szám törtrésze: %f%n", (pvs - Math.floor(pvs)));
    }



}
