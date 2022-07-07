package com.aurionpro.model;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
	private int guessedNumber;
	private int random;
	private int turn=1;
	static private int key=-1;
	static Scanner sc = new Scanner(System.in);

	public void play() {
		this.random = generateRandom();
		while (key==-1 &&  turn<=6 ) {
			takeUserInput();
		}
		displayDetails();
		
	}

	private void takeUserInput() {
		System.out.println("Guess your number :");
		this.guessedNumber = NumberGuess.sc.nextInt();
		if(this.guessedNumber>0 && this.guessedNumber<=100) {
			checkGuessNumber();
			incrementTurn();
		}else
			System.out.println("YOU HAVE ENTERED "+this.guessedNumber +" NUMBER SHOULD BE IN THE RANGE OF 1-100");
			
	}

	private void displayDetails() {
		System.out.println("***************** DETAILS *******************");
		if(turn==6)
			System.out.println("OOPS YOU COUDN'T GUESS THE RIGHT  NUMBER AND YOUR TURN IS 6");
		if(key==1)
			System.out.println("GUESSED NUMBER IS CORRECT "+this.random +" YOU FINISHED IS "+(turn -1)+ "turns");
		if(key==-1) {
			System.out.println("OOPS YOU COUDN'T WIN THE GAME\rYOU COUDN'T GUESS THE NUMBER\rNUMBER WAS "+this.random);
			System.out.println("YOU FINISHED THE GAME IN 6 TURNS");
			
		}
		
		System.out.println("*********************************************");

	}

	private void incrementTurn() {
		turn++;
		
	}

	private void  checkGuessNumber() {
		if (guessedNumber == random) {
			NumberGuess.key=1;
		}
		if (guessedNumber > random) {
			System.out.println("TOO HIGH ");
			NumberGuess.key=-1;
		}
		if (guessedNumber < random) {
			System.out.println("TOO LOW");
			NumberGuess.key=-1;
		}

	}

	private int generateRandom() {
		int upperBound = 1;
		int lowerBound = 100;
		Random rand = new Random();
		return rand.nextInt(lowerBound - upperBound) + 1;
	}

	

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public static void setKey(int key) {
		NumberGuess.key = key;
	}
	

}
