package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main3 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("This is a directional adventure game. The goal is to find the secret room. " +
                "From your starting room in the foyer you can move in any direction using" + "N,S, E, or W." + "Any other key will cause an error, good luck!");

        System.out.println("Welcome to Zork! Type QUIT at any time to quit the game.");

        boolean repeat = true;

        int next = 1;
        while (repeat) {
            if (next == 1) {
                next = foyer();
            } else if (next == 2) {
                next = frontroom();
            } else if (next == 3) {
                next = library();
            } else if (next == 4) {
                next = kitchen();
            } else if (next == 5) {
                next = diningroom();
            } else if (next == 6) {
                next = vault();
            } else if (next == 7) {
                next = parlor();
            } else if (next == 8) {
                next = secretroom();
            }
        }
    }

    public static int foyer() {
        Scanner k = new Scanner(System.in);
        System.out.println("You are in the foyer. There is a dead scorpion.");
        System.out.println("Which direction do you want to go?");
        String direction = k.next();
        if (direction.equalsIgnoreCase("n")) {
            return 2;
        } else if (direction.equalsIgnoreCase("quit")) {
            return -2;
        } else {
            return -1;
        }
    }

    public static int frontroom() {
        Scanner k = new Scanner(System.in);
        System.out.println("You are in the front room. There is a piano.");
        System.out.println("Which direction do you want to go?");
        String direction = k.next();
        if (direction.equalsIgnoreCase("n")) {
            return 2;
        } else if (direction.equalsIgnoreCase("quit")) {
            return -2;
        } else {
            return -1;
        }
    }

    public static int foyer(String direction) {
        Scanner k = new Scanner(System.in);
        System.out.println("You are in the foyer. There is a dead scorpion.");
        System.out.println("Which direction do you want to go?");
        direction = k.next();
        if (direction.equalsIgnoreCase("n")) {
            return 2;
        } else if (direction.equalsIgnoreCase("quit")) {
            return -2;
        } else {
            return -1;
        }
    }

    public static int diningroom(String direction) {
        Scanner k = new Scanner(System.in);
        System.out.println("You are in the dining room. There is dust and an empty box.");
        System.out.println("Which direction do you want to go?");
        direction = k.next();
        if (direction.equalsIgnoreCase("s")) {
            return 3;
        } else if (direction.equalsIgnoreCase("quit")) {
            return -2;
        } else {
            System.out.println("Choose another direction");
            repeat = true;
        }
        return -1;
    }

    public static int vault(String direction) {
        Scanner k = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        System.out.println("You are in the vault. There are three walking skeletons.");
        System.out.println("Which direction do you want to go?");
        direction = k.next();
        int sr = num.nextInt();
        sr = 1;
        if (direction.equalsIgnoreCase("e")) {
            return 7;
            if (direction.equalsIgnoreCase("e")) {
                return 8;
                if (sr == 1); {
                System.out.println("You are in the Secret Room. There are piles of gold.");}
                else if (sr == 2); {
                    System.out.println("You are still in the vault. There are three walking skeletons.");}
                    else if (sr == 3); {
                    System.out.println("You are still in the vault. There are three walking skeletons.");}
                    else if (sr == 4); {
                    System.out.println("You are still in the vault. There are three walking skeletons.");}
            } else if (direction.equalsIgnoreCase("quit")) {
                return -2;
            } else {
                System.out.println("Choose another direction");
                repeat = true;
            }
        }
    } return -1;

    public static int secretroom(String direction) {
        Scanner k = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        System.out.println("You are in the secret room. There are piles of gold.");
        System.out.println("Which direction do you want to go?");
        direction = k.next();
        if (direction.equalsIgnoreCase("s")) {
            return 6;
            } else if (direction.equalsIgnoreCase("quit")) {
                return -2;
            } else {
                System.out.println("Choose another direction");
                repeat = true;
            }
        }
    }
    return = -1;
}
