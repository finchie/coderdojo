package com.coderdojo.inverness.tutorials.battleships;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Board {
	
	public static final String[] ROW_NAMES = "ABCDEFGHIJ".split("");
	public static final String[] COL_NAMES = "0123456789".split("");
	public static final String EMPTY = " ";
	public static final String MINE = "M";
	public static final String DESTROYER = "D";

	private Map<String, String> board;
	private static Random random = new Random();

	public Board() {
		initialise();
	}
	
	private void initialise() {
		board = new HashMap<String, String>();
		for(String row : ROW_NAMES) {
			for (String column : COL_NAMES) {
				board.put(row + column, EMPTY);
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder(" ");
		for (String column : COL_NAMES) {
			s.append(" " + column);
		}
		s.append(" \n");
		s.append(horizontalLine());
		
		for (String row : ROW_NAMES) {
			s.append(row);
			for (String column : COL_NAMES) {
				s.append("|" + board.get(row + column));
			}
			s.append("|\n");
			s.append(horizontalLine());
		}
		
		return s.toString();
	}
	
	private String horizontalLine() {
		StringBuilder s = new StringBuilder(" ");
		for (int i = 0; i< COL_NAMES.length; i++) {
			s.append("--");
		}
		s.append("-\n");
		return s.toString();
	}

	public void reset() {
		initialise();
	}
	
	public void set(String coordinates, String value) {
		board.put(coordinates, value);
	}
	
	public boolean isEmpty(String coordinates) {
		return EMPTY.equals(board.get(coordinates));
	}
	
	private String findRandomEmpty() {
		boolean isEmpty = false;
		String rowIndex = null, colIndex = null;
		while (!isEmpty) {
			rowIndex = ROW_NAMES[random.nextInt(ROW_NAMES.length)];
			colIndex = COL_NAMES[random.nextInt(COL_NAMES.length)];
			isEmpty = isEmpty(rowIndex + colIndex);
		}
		return rowIndex + colIndex;
	}
	
	public void setMine() {
		board.put(findRandomEmpty(), MINE);
	}
	
	public void setDestroyer() {
		
	}
}
