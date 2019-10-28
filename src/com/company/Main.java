package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Welcome to Zork! Type QUIT at any time to quit the game.");

    }
    public static void foyer() {
        Scanner k = new Scanner(System.in);
        System.out.println("You are in the foyer. You can choose which direction to move in next: ");
        String d = k.next();
        if(d.equalsIgnoreCase("north")){

        else{
            return -1;
        }
    }
}
