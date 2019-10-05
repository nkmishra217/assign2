package main;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int b = scanner.nextInt();
        System.out.print(a.substring(b));
    }
}
