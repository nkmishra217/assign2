package main;

import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int b = inputString.length();
        int c = 0;
        for (int i = 0; i < b; i++) {
            c += (int) (inputString.charAt(i));
        }
        System.out.print(c);
    }
}
