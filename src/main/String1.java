package main;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int b = a.length();
        for (int i = 0; i <= b; i++) {
            System.out.println("index:");
            System.out.println(a.charAt(i));
        }

    }


}
