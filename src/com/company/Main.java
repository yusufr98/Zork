package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Welcome to Zork! Type QUIT at any time to quit the game.");

    }
    public static int foyer(String direction) {
        Scanner k = new Scanner(System.in);
        System.out.println("You are in the foyer. You can choose which direction to move in next: ");
        String d = k.next();
        if(direction.equalsIgnoreCase("north")){
            return 2;
        }
        else{
            return -1;
        }
    }
}
