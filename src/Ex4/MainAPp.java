package Ex4;

import java.util.Random;

public class MainAPp {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(31);
        int b = rand.nextInt(31);
        System.out.println("a = " + a + " & b = " + b);
        int r;
        while(b>0)
        {
            r = a%b;
            a = b;
            b = r;
        }
        System.out.println("cmmdc = " + a);
    }
}
