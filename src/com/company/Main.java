package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("This is a directional adventure game. The goal is to find the secret room. " +
                "From your starting room in the foyer you can move in any direction using" + "N,S, E, or W." + "Any other key will cause an error, good luck!");

        System.out.println("Welcome to Zork! Type QUIT at any time to quit the game.");

        boolean repeat = true;

        int next = 1;
        while(repeat){
            if(next == 1){
                int n = foyer();
                while(n == -1){
                    System.out.println("You have reached a dead-end. Choose another direction. ");
                    n = foyer();
                }
                next = n;
            }
            else if(next == 2){
                int n = frontroom();
                while(n == -1){
                    System.out.println("You have reached a dead-end. Choose another direction. ");
                    n = frontroom();
                }
                next = n;
            }
            else if(next == 3){
                int n = library();
                while(n == -1){
                    System.out.println("You have reached a dead-end. Choose another direction. ");
                    n = library();
                }
                next = n;
            }
            else if(next == 4){
                int n = kitchen();
                while(n == -1){
                    System.out.println("You have reached a dead-end. Choose another direction. ");
                    n = kitchen();
                }
                next = n;
            }
            else if(next == 5){
                int n = diningroom();
                while(n == -1){
                    System.out.println("You have reached a dead-end. Choose another direction. ");
                    n = diningroom();
                }
                next = n;
            }
            else if(next == 6){
                int n = vault();
                while(n == -1){
                    System.out.println("You have reached a dead-end. Choose another direction. ");
                    n = vault();
                }
                next = n;
            }
            else if(next == 7){
                int n = parlor();
                while(n == -1){
                    System.out.println("You have reached a dead-end. Choose another direction. ");
                    n = parlor();
                }
                next = n;
            }
            else if(next == 8){
                int n = secret();
                while(n == -1){
                    System.out.println("You have reached a dead-end. Choose another direction. ");
                    n = secret();
                }
                next = n;
            }
            else if(next == -2){
                repeat = false;
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
    public static int foyer(String direction) {
        Scanner k = new Scanner(System.in);
        System.out.println("You are in the foyer. There is a dead scorpion.");
        System.out.println("Which direction do you want to go?");
        direction = k.next();
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
}
