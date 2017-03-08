package com.coderdojo.inverness.tutorials.cards;

import java.util.Scanner;

public class HigherLowerCard {
	
	private Card[] cards;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int highScore = 0;
		HigherLowerCard game;
		String playAgain = null;
		do {
			game = new HigherLowerCard(10);
			int score = game.start();

			if (score > highScore) {
				highScore = score;
			}
			System.out.println("High score is " + highScore);
			System.out.println("Do you want to play again? (Y/N)");
			playAgain = scanner.next();
		}
		while ("Y".equalsIgnoreCase(playAgain));
		System.out.println("Bye!");
	}
	
	public HigherLowerCard(int size) {
		cards = Card.getRandomArrayWithNoDuplicates(size);
	}
	
	private int start() {
		boolean alive = true;
		int currentIndex = 0;
		
		while (alive && currentIndex < cards.length - 1) {
			System.out.println("Is the next number higher or lower than " + cards[currentIndex] + "?");
			
			String guess = null;
			while (!"H".equalsIgnoreCase(guess) && !"L".equalsIgnoreCase(guess)) {
				System.out.println("Enter H or L");
				guess = scanner.next();
			}
			
			alive = "H".equalsIgnoreCase(guess) && cards[currentIndex].rank < cards[currentIndex + 1].rank
					|| "L".equalsIgnoreCase(guess) && cards[currentIndex].rank > cards[currentIndex + 1].rank;
			System.out.print(alive ? "Right!" : "Wrong!");
			System.out.println(" the next number is " + cards[currentIndex + 1]);
			currentIndex++;
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~");
		if (!alive) {
			System.out.println("Bad luck!");
		}
		else {
			System.out.println("Congratulations!");
		}
		System.out.println("You scored " + currentIndex);
		
		return currentIndex;
	}
	
	

}
