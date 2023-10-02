package Ex3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n = ");
        int n = scanner.nextInt();
        int nr = 0;
        for(int i = 1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
                nr++;
            }
        }
        if(nr==2)
            System.out.println("Nr este PRIM");
        scanner.close();
    }
}
