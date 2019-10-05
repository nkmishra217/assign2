package main;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int b = a.length();
        System.out.print("index:");
        System.out.print(" " + 0 + "  ");
        for (int i = 1; i < b; i++) {
            System.out.print("   ");
            System.out.print(i);

        }
        System.out.println("");
        System.out.print("chars:");
        System.out.print(" " + a.charAt(0) + "  ");
        for (int j = 1; j < b; j++) {
            System.out.print("   ");
            System.out.print(a.charAt(j));
        }

    }


}
