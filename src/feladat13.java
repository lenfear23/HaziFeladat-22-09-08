import java.util.Scanner;

public class feladat13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rnd = Math.round(Math.random()*100);
        System.out.print("tippeljen egy egész számot 1 és 100 között: " + rnd);
        int talalom = sc.nextInt();
        while (talalom != rnd){
            if (talalom > rnd){
                System.out.println("A kitallálandó szám kisebb mint a tipp");
            }else{
                System.out.println("A kitallálandó szám nagyobb mint a tipp");
            }
            System.out.print("\nkérem tippeljen egy egész számot 1 és 100 között:");
            talalom = sc.nextInt();
        }
        System.out.print("\nÖn nyert");
    }
}
