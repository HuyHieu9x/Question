package entity;

import java.util.Scanner;

public class Menu {

    public static int showMenu(){
        int choice ;
        System.out.println("--------MENU---------");
        System.out.println("1. Junior");
        System.out.println("2. Mid Senior");
        System.out.println("3. Senior");
        System.out.println("4. Exit");

        System.out.println("Choose :");
        Scanner sc = new Scanner(System.in);
        choice = Integer.parseInt(sc.nextLine());

        return choice;
    }

    public static int showLanguage(){
        int choice ;
        System.out.println("--------MENU---------");
        System.out.println("1. Java");
        System.out.println("2. ReactJS");
        System.out.println("3. Exit");

        System.out.println("Choose :");
        Scanner sc = new Scanner(System.in);
        choice = Integer.parseInt(sc.nextLine());

        return choice;
    }

}
