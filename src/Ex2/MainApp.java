package Ex2;

import javax.lang.model.type.NullType;
import java.io.*;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException {
        int x, suma;
        int nr = 0;
        int minim, maxim;
        Scanner scanner=new Scanner(new File("D:\\Facultate\\Anul III\\Semestrul I\\PJ\\Laborator\\Lab1\\src\\Ex2\\in.txt"));
        x = scanner.nextInt();
        maxim = minim = suma = x;
        while(scanner.hasNext())
        {
            x = scanner.nextInt();
            nr++;
            if(x>maxim)
                maxim=x;
            if(x<minim)
                minim=x;
            suma += x;
        }
        PrintStream flux_out = new PrintStream ("D:\\Facultate\\Anul III\\Semestrul I\\PJ\\Laborator\\Lab1\\src\\Ex2\\out.txt");
        flux_out.println("Suma = " + suma);
        flux_out.println("Media aritmetica = " + (float)suma/nr);
        flux_out.println("Minim = " + minim);
        flux_out.println("Maxim = " + maxim);
        scanner.close();
    }
}
