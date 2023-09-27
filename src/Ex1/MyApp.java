package Ex1;

import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
//        System.out.println("helllo");
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("x=");
//        int x = scan.nextInt();
//        System.out.println("Valoarea e " + x);
//        scan.close();

        Scanner scan = new Scanner(System.in);
        System.out.println("Lungime = ");
        int L = scan.nextInt();
        System.out.println("Latime = ");
        int l = scan.nextInt();

        System.out.println("Perimetrul este " + 2*(L+l) + ", iar Aria este "+ L*l);
        scan.close();
    }
}
