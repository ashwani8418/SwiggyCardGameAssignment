package com.swiggycardgameproject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("........Welcome to Swiggy Card Game........");
        System.out.println("To start the game, please choose player between 2 to 4");
        int numberOfPlayer = sc.nextInt();
        while (numberOfPlayer < 2 || numberOfPlayer > 4){
            System.out.println("Invalid numbers of players, please try again");
            System.out.println("Please choose player between 2 to 4");
            numberOfPlayer = sc.nextInt();
        }
        String[] player = new String[numberOfPlayer];
        for(int i = 0; i < numberOfPlayer; i++){
            System.out.println("Enter name of " + (i + 1) + " player : ");
            player[i] = sc.next();
        }

        System.out.println("..........Starting Your Game!!!..............");
    }
}