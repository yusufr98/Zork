/*package com.company;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("This is a directional adventure game. The goal is to find the secret room. " +
                "From your starting room in the foyer you can move in any direction using" + "N,S, E, or W." + "Any other key will cause an error, good luck!");

        System.out.println("Welcome to Zork! Type QUIT at any time to quit the game.");

        boolean repeat = true;

        int next = 1;
        while(repeat){
            if(next == 1){
                next = foyer();
            }
            else if(){

            }
        }
    }
    public static int foyer() {
        Scanner k = new Scanner(System.in);
        System.out.println("You are in the foyer. There is a dead scorpion.");
        System.out.println("Which direction do you want to go?");
        String direction = k.next();
        if(direction.equalsIgnoreCase("n")){
            return 2;
        }
        else if(direction.equalsIgnoreCase("quit")){
            return -2;
        }
        else{
            return -1;
        }
    }
    public static int frontroom() {
        Scanner k = new Scanner(System.in);
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
               return -  1;
            }
        }

    public static int library() {
        Scanner k = new Scanner(System.in);
        System.out.println("You are in the library. There are spiders in this room.");
            System.out.println("Which direction do you want to go?");
            String direction = k.next();
            if (direction.equalsIgnoreCase("n")) {
                return 5;
            }
            else if (direction.equalsIgnoreCase("e")){
                return 2;
            }
            else if (direction.equalsIgnoreCase("quit")) {
                return -2;
            } else {
                return -1;
            }
    }
    public static int kitchen(){
        Scanner k = new Scanner(System.in);
        System.out.println("You are in the kitchen. There are bats in this room.");
        System.out.println("Which direction do you want to go?");
        String direction = k.next();
        if (direction.equalsIgnoreCase("w")) {
            return 2;
        }
        else if (direction.equalsIgnoreCase("n")){
            return 7;
        }
        else if (direction.equalsIgnoreCase("quit")) {
            return -2;
        } else {
            return -1;
        }
    }
    public static int parlor() {
        Scanner k = new Scanner(System.in);
        System.out.println("You are in the parlor. There a treasure chest in this room.");
        System.out.println("Which direction do you want to go?");
        String direction = k.next();
        if (direction.equalsIgnoreCase("w")) {
            return 6;
        }
        else if (direction.equalsIgnoreCase("s")){
            return 4;
        }
        else if (direction.equalsIgnoreCase("quit")) {
            return -2;
        } else {
            return -1;
        }
    }
    public static int secretRoom() {
        Scanner k = new Scanner(System.in);
        System.out.println("You are in the Secret Room!!! There are piles of gold in this room!! Congrats!");
        System.out.println("Which direction do you want to go?");
        String direction = k.next();
        if (direction.equalsIgnoreCase("w")) {
            return 6;
        }
        else if (direction.equalsIgnoreCase("quit")) {
            return -2;
        } else {
            return -1;
        }
    }
}
*/