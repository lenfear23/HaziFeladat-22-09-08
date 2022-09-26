import java.util.Scanner;

public class feladat6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a dolgozaton elért összes pontot: ");
        double pont = sc.nextDouble();

        if (0<=pont && pont<=42){
            System.out.println("elégtelen");
        }else if (pont<=57){
            System.out.println("elégséges");
        } else if (pont<=72) {
            System.out.println("közepes");
        }else if (pont <=87){
            System.out.println("jó");
        }else{
            System.out.println("jeles");
        }
    }
}
