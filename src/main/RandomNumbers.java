package main;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] arg){
        Random r = new Random();

        int a = r.nextInt();
        System.out.println(a);

        int b = r.nextInt(11);
        System.out.println(b);

        int c = r.nextInt(10) +1;
        System.out.println(c);

        float d = r.nextFloat();
        System.out.println(d);

        double e = r.nextDouble();
        System.out.println(e);

        boolean f = r.nextBoolean();
        System.out.println(f);
    }
}
