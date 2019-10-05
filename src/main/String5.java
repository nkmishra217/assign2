package main;

import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();
        String d = sc.nextLine();
        s = s.replace(d, p);
        System.out.print(s);
    }
}
