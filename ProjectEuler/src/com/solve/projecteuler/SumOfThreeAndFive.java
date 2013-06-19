package com.solve.projecteuler;

public class SumOfThreeAndFive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		long startTime = System.nanoTime();
		System.out.println("====>"+loopCompute());
		long endTime = System.nanoTime();
		System.out.println("DURATION::"+(endTime - startTime));
		
		
		startTime = System.nanoTime();
		System.out.println("====>"+mathCompute());
		endTime = System.nanoTime();
		System.out.println("DURATION::"+(endTime - startTime));

	}
	
	
	private static int loopCompute() {
		
		int sum =0;
		for (int i=0; i < 1000; i++) {
			if (i%3 ==0 || i %5 ==0) {
				sum+=i;
			}
		}
		
		return sum;
	}
	
	private static int mathCompute() {
		
		int sum3 = ((3+3*((int)(999/3)))*((int)(999/3)))/2; 
		
		int sum5 = ((5+5*((int)(999/5)))*((int)(999/5)))/2;
		
		int sum15 = ((15+15*((int)(999/15)))*((int)(999/15)))/2;
		
		return sum3+sum5-sum15;
		
	}
	
}
