package com.coderdojo.inverness.tutorials;

public class ArrayTutorial {

	public static void main(String[] args) {
		
		int[] integers1 = new int[3];
		integers1[0] = 15;
		integers1[1] = 30;
		integers1[2] = 45;
		
		int[] integers2 = {11, 22, 33, 44, 55};
		
		boolean[] bools = {true, false, true, false};
		float[] floats = {1.2f, 3.14159f, 6.67f};
		String[] names = new String[3];
		names[0] = "Dominic";
		names[1] = "Vasily";
		names[2] = "Brian";
		
		for (int index = 0; index < integers1.length; index++)
		{
			System.out.println(integers1[index]);
		}
		
		for (int val : integers2)
		{
			System.out.println(val);
		}
		
		for (boolean val : bools)
		{
			System.out.println(val);
		}
		
		for (float val : floats)
		{
			System.out.println(val);
		}

	}

}
