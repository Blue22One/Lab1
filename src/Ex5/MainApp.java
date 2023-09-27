package Ex5;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(21);
        int x,y,s;
        x = y = 1;
        while(y<=20)
        {
            s = x + y;
            if(a == y)
            {
                System.out.println("Nr se afla in Sirul lui Fibonacci");
                return;
            }
            x = y;
            y = s;
        }
        System.out.println("Nr nu se afla in Sirul lui Fibonacci");
    }
}
