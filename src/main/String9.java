package main;

import java.util.Scanner;

public class String9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String k = s.nextLine();
        int b = k.length();
        int c = 0;
        int g = 0;
        for (int i = 0; i < b; i++) {
            if (k.charAt(i) >= 65 || k.charAt(i) <= 90) {
                c += (int) (k.charAt(i));
                System.out.print(c);
            } else {
                g += (int) (k.charAt(i));
            }
        }
        int absoluteWeight = c - g;
        System.out.print(absoluteWeight);
    }

}
