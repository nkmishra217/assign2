package main;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int b = a.length();
        System.out.print("index:");
        for (int i = 0; i < b; i++) {
            System.out.print(" ");
            System.out.print(i);

        }
        System.out.println("");
        System.out.print("char:");
        for (int j = 0; j < b; j++) {
            System.out.print(" ");
            System.out.print(a.charAt(j));
        }

    }


}
