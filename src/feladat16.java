import java.util.Scanner;

public class feladat16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] tomb = new double[5];
        for (int i = 0; i < 5; i++){
            System.out.printf("Kérem adja meg a(z) %d. elemet a tömbben",i+1);
            tomb[i] = sc.nextDouble();
        }
        System.out.println("sorrend");
        for (int i = 0; i < tomb.length; i++){
            System.out.print(tomb[i] + ";");
        }
        System.out.println("fordított sorrend");
        for (int i = tomb.length-1; i > 0; i--){
            System.out.print(tomb[i] + ";");
        }

        System.out.println("minden második elem");
        for (int i = 0; i < tomb.length; i+=2){
            System.out.print(tomb[i] + ";");
        }
        System.out.println("\nKérem adja meg hanyadik elemet szeretné kiíratni a tömbből");
        int szam = sc.nextInt();
        System.out.println("Ez az elem: " + tomb[szam - 1]);
    }
}
