import java.util.Scanner;

public class feladat12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy összeget (min 1, max 1000Ft): ");
        double osszeg = sc.nextInt();

        double ketszaz = 0;
        double szaz = 0;
        double otven = 0;
        double husz = 0;
        double tiz = 0;
        double ot = 0;

        if (osszeg >0 && osszeg<1000) {
            ketszaz = Math.floor(osszeg / 200);
            osszeg -= (ketszaz * 200);
            szaz = Math.floor(osszeg / 100);
            osszeg -= (szaz * 100);
            otven = Math.floor(osszeg / 50);
            osszeg -= (otven * 50);
            husz = Math.floor(osszeg / 20);
            osszeg -= (husz * 20);
            tiz = Math.floor(osszeg / 10);
            osszeg -= (tiz * 10);
            ot = Math.floor(osszeg / 5);
            osszeg -= (ot * 5);

            System.out.printf("A %.0f Ft-ot így lehet a lehető legkevesebb érméből összerakni \n", osszeg);
            System.out.printf("200 Ft-os: %.0f\n", ketszaz);
            System.out.printf("100 Ft-os: %.0f\n", szaz);
            System.out.printf("50 Ft-os: %.0f\n", otven);
            System.out.printf("20 Ft-os: %.0f\n", husz);
            System.out.printf("10 Ft-os: %.0f\n", tiz);
            System.out.printf("5 Ft-os: %.0f\n", ot);
            System.out.printf("Maradék: %.0f", osszeg);
        }else {
            System.out.println("Hibás adat!");
        }

    }
}
