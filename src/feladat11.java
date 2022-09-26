import java.util.Scanner;

public class feladat11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy pozitív egész számot");
        int bekert = sc.nextInt();
        int szamlalo = 0;
        for(int i = 1; i <= bekert; i+=2){
            szamlalo += i;
        }
        System.out.printf("A megadott számnál nem nagyobb páratlan, pozitív, egész számok összege: %d", szamlalo);
    }
}
