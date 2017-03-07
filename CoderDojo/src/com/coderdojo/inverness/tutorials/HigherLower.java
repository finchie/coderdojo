package com.coderdojo.inverness.tutorials;

import java.util.Scanner;

public class HigherLower {
	
	private int[] numbers;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int highScore = 0;
		HigherLower game;
		String playAgain = null;
		do {
			game = new HigherLower(10);
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
	
	public HigherLower(int size) {
		numbers = RandomTutorial.getRandomArrayWithNoDuplicates(0, 10, size);
	}
	
	private int start() {
		boolean alive = true;
		int currentIndex = 0;
		
		while (alive && currentIndex < numbers.length - 1) {
			System.out.println("Is the next number higher or lower than " + numbers[currentIndex] + "?");
			
			String guess = null;
			while (!"H".equalsIgnoreCase(guess) && !"L".equalsIgnoreCase(guess)) {
				System.out.println("Enter H or L");
				guess = scanner.next();
			}
			
			alive = "H".equalsIgnoreCase(guess) && numbers[currentIndex] < numbers[currentIndex + 1]
					|| "L".equalsIgnoreCase(guess) && numbers[currentIndex] > numbers[currentIndex + 1];
			System.out.print(alive ? "Right!" : "Wrong!");
			System.out.println(" the next number is " + numbers[currentIndex + 1]);
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
