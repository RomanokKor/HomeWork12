package com.roma;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите: I like Java!!!");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if (str.contains("Java") & str.startsWith("I like") & str.endsWith("!!!")) {
            System.out.println(str.toUpperCase());
            String str1 = str.substring(7, 11);
            System.out.println(str1.replace("a",  "o"));
        }
    }
}

