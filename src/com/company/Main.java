package com.company;
import java.util.ArrayList;
import java.util.HashMap;
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
        ArrayList<Room> list = new ArrayList<>();
        //Initilaize all the rooms and add them to an arryalist
        list.add(new Room("foyer",1,2,-2,-1,-1));
        list.add(new Room("front room",2,-1,1,4,3));
        list.add(new Room("library",3,5,-1,2,-1));
        list.add(new Room("kitchen",4,7,-1, -1,2));
        list.add(new Room("dining room",5,-1,3,-1,-1));
        list.add(new Room("vault",6,-1,-1,7,-1));
        list.add(new Room("parlor",7,-1,4,-1,6));
        list.add(new Room("secret room",8,-1,-1,-1,6));
        //Randomly assign teddy to a room
        int t = r.nextInt(8);
        list.get(t).setTeddy(true);
        System.out.println("This is a directional adventure game. The goal is to find the secret room. " +
                "From your starting room in the foyer you can move in any direction using N,S, E, or W. Any other key will cause an error, good luck!");
        System.out.println("Welcome to Zork! Type QUIT at any time to quit the game.");

        boolean repeat = true;
        int next = 1;
        int userMoney = 0;
        String d;

        while (repeat) {
            int x = -1;
            Room current = list.get(next-1);
            //set isVisit to true if the room has been entered
            if(!current.isVisit()){
                list.get(next-1).setVisit(true);
            }
            System.out.println("You are in the " + current.getName() + ". You have " + userMoney + " dollars.");
            if(current.isTeddy()){
                System.out.println("Teddy is here to steal all your money! He laughs maniacally as he takes all your hard earned cash.");
                list.get(next-1).setTeddy(false);
                userMoney = 0;
            }
            else if(current.getMoney() != 0){
                System.out.println("You found " +  current.getMoney() + " dollars!");
                System.out.println("Would you like to take the money(yes/no)?");
                String s = k.next();
                if(s.equalsIgnoreCase("yes")){
                    userMoney+=current.getMoney();
                    list.get(next-1).setMoney(0);
                }
            }
            do {
                System.out.println("Which direction would you like to go in?");
                d = k.next();
                if (d.equalsIgnoreCase("n")) {
                    x = current.getNorth();
                } else if (d.equalsIgnoreCase("s")) {
                    x = current.getSouth();
                } else if (d.equalsIgnoreCase("w")) {
                    x = current.getWest();
                } else if (d.equalsIgnoreCase("e")) {
                    x = current.getEast();
                } else if (d.equalsIgnoreCase("quit")) {
                    repeat = false;
                    x = -2;
                } else {
                    x = -1;
                }
                if(x == -1){
                    System.out.println("You've reached a dead end. Choose another direction.");
                }
            } while (x == -1);
            if(x == 7 && current.getIndex() == 6){
                if(secret){
                    System.out.println("Would you like to enter the parlor or the secret room(P/S)?");
                    String c = k.next();
                    if(c.equalsIgnoreCase("s")){
                        x = 8;
                    }
                }
                else{
                    int chance = r.nextInt(4);
                    if(chance == 0){
                        x = 8;
                    }
                }
            }
            next = x;
        }
        for(Room r : list){
            if(r.isVisit()){
                count++;
            }
        }
        System.out.println("You have left the house. You visited "+ count + " rooms.");
        int ghost = 1 + r.nextInt(4);
        if(ghost == 1){
            System.out.println("You are being followed by a ghost. His name is Casper.");
        }
    }
}