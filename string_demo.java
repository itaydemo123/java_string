package com.company;

public class Main
{
    public static void main(String[] args)
    {
        // [type] [invented-name] = [value];
        int x = 1;
        // [type] [invented-name];
        int y;

        char lett = 'A';
        String first_name = "Danny";
        String one_char = "A";
        String last_name = "Cohen";
        String number = "5.5";
        // int kaful2 = number * 2; //ERROR
        int x1 = 1;
        int kaful2 = x1 * 2;
        int sum2 = 1 + 1; // 2

        System.out.print(first_name);
        System.out.print(" ");
        System.out.println(last_name);

        String sentence = "Good " + "morning!"; // "Good morning!" Concat

        System.out.println("Hello world!");

        System.out.println(first_name + " " + last_name);

        String full_name = first_name + " " + last_name;
        System.out.println(full_name);

    }
}
