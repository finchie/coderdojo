package com.coderdojo.inverness.tutorials;

public class ArrayTutorial {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 5;
		int c = 173621735;
		
		int[] array1 = new int[3];
		array1[0] = 15;
		array1[1] = 30;
		array1[2] = 45;
		
		int[] array2 = {11, 22, 33, 44, 55};
		
		boolean[] bools = {true, false, true, false};
		float[] floats = {1.2f, 3.14159f, 6.67f};
		String[] names = new String[3];
		names[0] = "Dominic";
		names[1] = "Vasily";
		names[2] = "Brian";
		
		for (int index = 0; index < array1.length; index++)
		{
			System.out.println(array1[index]);
		}
		
		for (int val : array2)
		{
			System.out.println(val);
		}

	}

}
