import java.util.Scanner;

public class feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy szöveget");

        String szoveg = sc.nextLine();
        String menuPont = "";
        while(!menuPont.equals("f")) {
            System.out.println("Adja meg, hogy mit szeretne csinálni a szöveggel:");
            System.out.println("\t1 - nagybetűssé alakítás");
            System.out.println("\t2 - Kisbetűssé alakítani");
            System.out.println("\t3 - lekérdezni a hosszát");
            System.out.println("\t4 - Összehasonlítani a másik szöveggel");
            System.out.println("\t5 - A szöveg egy részét kiíratni");
            System.out.println("\t6 - Kilépés");
            System.out.println("Adja meg a menüpontot: ");
            menuPont = sc.nextLine();
            switch (menuPont) {
                case "1":
                    System.out.println(szoveg.toUpperCase());
                    break;
                case "2":
                    System.out.println(szoveg.toLowerCase());
                    break;
                case "3":
                    System.out.printf("A szöveg hossza %d karakter\n", szoveg.length());
                    break;
                case "4":
                    System.out.println("Kérem adja meg a másik szöveget: ");
                    String szoveg2 = sc.nextLine();
                    int osszehasonlitas = szoveg.compareToIgnoreCase(szoveg2);
                    if (osszehasonlitas < 0) {
                        System.out.println("Az első szöveg előrébb van az ABC-ben");
                    } else if (osszehasonlitas > 0) {
                        System.out.println("A második szöveg előrébb van az ABC-ben");
                    } else {
                        System.out.println("A két szöveg ugyan az");
                    }
                    break;
                case "5":
                    System.out.println(szoveg.split(" "));
                    break;
                case "6":
                    break;
                default:

                    break;
            }
        }
    }
}
