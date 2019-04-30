package main;

import java.util.Random;

public class RandomCharsGenerator {
    public static void main(String[] arg){
        Random r = new Random();

        String str = "abcdefghijklmnoprstuwyz0123456789ABCDEFGHIJKLMNOPRSTQUWYZ";

        int strLength = str.length();

        System.out.println("Length chars: " + strLength);

        String code = "";

        for(int x=0; x<12; x++){
            int pos = r.nextInt(strLength);
            code = code + str.charAt(pos);
        }

        System.out.println("Generated code: " + code);
    }
}