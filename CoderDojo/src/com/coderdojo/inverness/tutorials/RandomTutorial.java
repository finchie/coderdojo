package com.coderdojo.inverness.tutorials;

import java.util.Random;

public class RandomTutorial {
	
	private static Random random = new Random();

	public static void main(String[] args) {
		
		int min = 0, max = 100;
		
//		for(int index = 0; index < 5; index++)
//		{
//			System.out.println(getRandom(min, max));
//		}
		
		int[] nums = getRandomArray(min, max, 20);
		for (int num : nums)
		{
			System.out.println(num);
		}
	}
	
	public static int getRandom(int min, int max) {
		
		return random.nextInt(max - min) + min + 1;
	}
	

	
	public static int[] getRandomArray(int min, int max, int length) {
		
		int[] array = new int[length];
		
		for (int index = 0; index < length; index++)
		{
			array[index] = random.nextInt(max - min) + min + 1;
		}
		return array;
	}
	
	public static int[] getRandomArrayWithNoDuplicates(int min, int max, int length) {
		
		int[] array = new int[length];
		
		for (int index = 0; index < length; index++)
		{
			array[index] = random.nextInt(max - min) + min + 1;
			if (index > 0 && array[index] == array[index - 1]) {
				index--; // repeat loop iteration
			}
		}
		return array;
	}

}
