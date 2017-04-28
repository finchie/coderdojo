package com.coderdojo.inverness.tutorials.battleships;

public class Game {
	private Board board;

	public static void main(String[] args) {
		Game game = new Game();
		game.start();
	}

	public Game() {
		board = new Board();
		board.setMine();
	}
	
	public void start() {

		System.out.println(board);
	}
}
