package main;

import java.util.Scanner;

public class String8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int b = s.length();
        int c = 0;
        for (int i = 0; i < b; i++) {
            if ((s.charAt(i) >= 65) || (s.charAt(i) <= 90)) {
                c += (int) (s.charAt(i));
            }
        }
        System.out.print(c);
    }
}
