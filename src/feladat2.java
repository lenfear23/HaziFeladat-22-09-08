import java.util.Scanner;

public class feladat2 {
    public static void main(String[] args) {
        /*A beolvasáshoz szükséges*/
        Scanner sc = new Scanner(System.in);


        System.out.print("Kérem adja meg a terület szélességét(m): ");
        /*Bekérjük a medence átmérőjét*/
        double teruletSz = sc.nextDouble();

        System.out.print("Kérem adja meg a terület magasságát(m): ");
        double teruletM = sc.nextDouble();

        double csempeDb = Math.round((teruletSz*teruletM*1.1) / (20*20));

        System.out.printf("%.0f farab csempére van szükség.");
    }
}
