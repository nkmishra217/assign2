package main;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String c = s.nextLine();
        int b = c.length();
        int d = 0;
        for (int i = 0; i < b; i++) {
            c = c.replaceFirst("[AaEeIiOoUu]", "*");
            c = c.replaceFirst("[AaEeIiOoUu]", "^");
            c = c.replaceFirst("[AaEeIiOoUu]", "!");
        }
        System.out.print(c);

    }
}

