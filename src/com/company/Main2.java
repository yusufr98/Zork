package com.company;

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
        boolean repeat = false;
        do {
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
    }
    public static int foyer(String direction) {
        Scanner k = new Scanner(System.in);
        System.out.println("You are in the foyer. There is a dead scorpion.");
        boolean repeat = false;
        do {
            System.out.println("Which direction do you want to go?");
            direction = k.next();
            if (direction.equalsIgnoreCase("n")) {
                return 2;
            } else if (direction.equalsIgnoreCase("quit")) {
                return -2;
            } else {
                System.out.println("Choose another diretion");
                repeat = true;
            }
        }while (repeat);
    }
}
