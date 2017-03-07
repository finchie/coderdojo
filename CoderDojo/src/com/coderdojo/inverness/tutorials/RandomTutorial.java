package com.coderdojo.inverness.tutorials;

import java.util.Random;

public class RandomTutorial {

	public static void main(String[] args) {
		
		int min = 0, max = 5;
		
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
		
		Random random = new Random();
		
		return random.nextInt(max - min) + min + 1;
	}
	

	
	public static int[] getRandomArray(int min, int max, int length) {
		
		Random random = new Random();
		int[] array = new int[length];
		
		for (int index = 0; index < length; index++)
		{
			array[index] = random.nextInt(max - min) + min + 1;
		}
		return array;
	}

}
