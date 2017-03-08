package com.coderdojo.inverness.tutorials.cards;

import java.util.Random;

public class Card {
	
	public int rank;
	public String suit;
	
	public Card (int rank, String suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	@Override
	public String toString() {
		return (rank == 1 ? "A" : rank == 11 ? "J" : rank == 12 ? "Q" : rank == 13 ? "K" : rank) + suit;
	}

	private static final Random random = new Random();
	private static final String[] SUITS = {"♥", "♣", "♦", "♠"};
	
	public static Card getRandomCard() {
		int rank = random.nextInt(13) + 1;
		String suit = SUITS[random.nextInt(4)];
		return new Card(rank, suit);
	}
	
	public static Card[] getRandomArrayWithNoDuplicates(int length) {
		
		Card[] array = new Card[length];
		
		for (int index = 0; index < length; index++)
		{
			array[index] = getRandomCard();
			if (index > 0 && array[index].rank == array[index - 1].rank) {
				index--; // repeat loop iteration
			}
		}
		return array;
	}

}
