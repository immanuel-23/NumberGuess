package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.NumberGuess;

public class NumberGuessTest {

	public static void main(String[] args) {
		NumberGuess ng= new NumberGuess();
		int startGame;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to start the game: ");
		startGame=sc.nextInt();
		if(startGame==1) {
		System.out.println("Guess The number between 1 - 100:");
		System.out.println("YOU HAVE GOT ONLY 6 TURNS");
		}
		else
			System.out.println("Thank you ");
		while(startGame==1) {
			ng.play();
			System.out.println("Enter 1 to start the game:");
			startGame=sc.nextInt();
			ng.setTurn(1);
			ng.setKey(-1);
		}

	}

}
