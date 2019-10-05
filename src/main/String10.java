package main;

import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        char d = sc.next().charAt(0);
        int g = k.indexOf(d);
        System.out.print(g);
    }
}
