package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {
    static Scanner k = new Scanner(System.in);
    static Random r = new Random();
    //setting secret default boolean to false so that the secret room is kept available after finding it//
    public static boolean secret = false;
    //static to keep track of the number of rooms you enter//
    public static int count = 0;
    public static void main(String[] args) {
        System.out.println("This is a directional adventure game. The goal is to find the secret room. " +
                "From your starting room in the foyer you can move in any direction using" + "N,S, E, or W." + "Any other key will cause an error, good luck!");

        System.out.println("Welcome to Zork! Type QUIT at any time to quit the game.");
//boolean repeat = true is only to repeat the while loop, if it is false then it will exit the program//
        boolean repeat = true;

        int next = 1;
        while (repeat) {
            if (next == 1) {
                int n = foyer();
                while (n == -1) {
                    System.out.println("You have reached a dead-end. Choose another direction. ");
                    n = foyer();
                }
                count++;
                next = n;
            } else if (next == 2) {
                int n = frontroom();
                while (n == -1) {
                    System.out.println("You have reached a dead-end. Choose another direction. ");
                    n = frontroom();
                }
                count++;
                next = n;
            } else if (next == 3) {
                int n = library();
                while (n == -1) {
                    System.out.println("You have reached a dead-end. Choose another direction. ");
                    n = library();
                }
                count++;
                next = n;
            } else if (next == 4) {
                int n = kitchen();
                while (n == -1) {
                    System.out.println("You have reached a dead-end. Choose another direction. ");
                    n = kitchen();
                }
                count++;
                next = n;
            } else if (next == 5) {
                int n = diningroom();
                while (n == -1) {
                    System.out.println("You have reached a dead-end. Choose another direction. ");
                    n = diningroom();
                }
                count++;
                next = n;
            } else if (next == 6) {
                int n = vault();
                while (n == -1) {
                    System.out.println("You have reached a dead-end. Choose another direction. ");
                    n = vault();
                }
                count++;
                next = n;
            } else if (next == 7) {
                int n = parlor();
                while (n == -1) {
                    System.out.println("You have reached a dead-end. Choose another direction. ");
                    n = parlor();
                }
                count++;
                next = n;
            } else if (next == 8) {
                int n = secretRoom();
                while (n == -1) {
                    System.out.println("You have reached a dead-end. Choose another direction. ");
                    n = secretRoom();
                }
                count++;
                next = n;
            } else if (next == -2) {
                repeat = false;
            }
        }
        System.out.println("You have left the house. You visited "+ count + " rooms.");
        int ghost = 1 + r.nextInt(4);
        if(ghost == 1){
            System.out.println("You are being followed by a ghost. His name is Casper.");
        }
    }
//entering the house with each room as its own method//
    public static int foyer() {
        System.out.println("You are in the foyer. There is a dead scorpion.");
        System.out.println("Which direction do you want to go?");
        String direction = k.next();
        if (direction.equalsIgnoreCase("n")) {
            return 2;
        //way to exit the house//
            } else if (direction.equalsIgnoreCase("quit") || direction.equalsIgnoreCase("s")) {
            return -2;
        } else {
            return -1;
        }
    }

    public static int frontroom() {
        System.out.println("You are in the front room. There is a piano.");
        System.out.println("Which direction do you want to go?");
        String direction = k.next();
        if (direction.equalsIgnoreCase("s")) {
            return 1;
        } else if (direction.equalsIgnoreCase("w")) {
            return 3;
        } else if (direction.equalsIgnoreCase("e")) {
            return 4;
        } else if (direction.equalsIgnoreCase("quit")) {
            return -2;
        } else {
            return -1;
        }
    }

    public static int library() {
        System.out.println("You are in the library. There are spiders in this room.");
        System.out.println("Which direction do you want to go?");
        String direction = k.next();
        if (direction.equalsIgnoreCase("n")) {
            return 5;
        } else if (direction.equalsIgnoreCase("e")) {
            return 2;
        } else if (direction.equalsIgnoreCase("quit")) {
            return -2;
        } else {
            return -1;
        }
    }

    public static int kitchen() {
        System.out.println("You are in the kitchen. There are bats in this room.");
        System.out.println("Which direction do you want to go?");
        String direction = k.next();
        if (direction.equalsIgnoreCase("w")) {
            return 2;
        } else if (direction.equalsIgnoreCase("n")) {
            return 7;
        } else if (direction.equalsIgnoreCase("quit")) {
            return -2;
        } else {
            return -1;
        }
    }

    public static int parlor() {
        System.out.println("You are in the parlor. There a treasure chest in this room.");
        System.out.println("Which direction do you want to go?");
        String direction = k.next();
        if (direction.equalsIgnoreCase("w")) {
            return 6;
        } else if (direction.equalsIgnoreCase("s")) {
            return 4;
        } else if (direction.equalsIgnoreCase("quit")) {
            return -2;
        } else {
            return -1;
        }
    }

    public static int secretRoom() {
        System.out.println("You are in the Secret Room!!! There are piles of gold in this room!! Congrats!");
        System.out.println("Which direction do you want to go?");
        String direction = k.next();
        if (direction.equalsIgnoreCase("w")) {
            return 6;
        } else if (direction.equalsIgnoreCase("quit")) {
            return -2;
        } else {
            return -1;
        }
    }
    public static int vault() {
        Scanner k = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        System.out.println("You are in the vault. There are three walking skeletons.");
        System.out.println("Which direction do you want to go?");
        String direction = k.next();
        int sr = 1 + r.nextInt(4);
        if (direction.equalsIgnoreCase("e")) {
            if(secret){
                System.out.println("Would you like to go to the parlor or the secret room(P/S)?");
                String s = k.next();
                if(s.equalsIgnoreCase("s")){
                    return 8;
                }
                else{
                    return 7;
                }
            }
            else {
                if (sr == 1) {
                    secret = true;
                    return 8;
                } else {
                    return 7;
                }
            }
        }
        else if (direction.equalsIgnoreCase("quit")) {
            return -2;
        } else {
            return -1;
        }
    }

    public static int diningroom() {
        System.out.println("You are in the dining room. There is dust and an empty box.");
        System.out.println("Which direction do you want to go?");
        String direction = k.next();
        if (direction.equalsIgnoreCase("s")) {
            return 3;
        } else if (direction.equalsIgnoreCase("quit")) {
            return -2;
        } else {
            return -1;
        }
    }
}