package com.arczo.jnecessary.basic.math;

import java.util.ArrayList;
import java.util.List;


/**
 * This class handles all Prime Number based math
 * @author Jon McLean (jon@arczo.com)
 * @since 20/2/15
 */
public class PrimeNumberMath {
	
	private PrimeNumberMath() { }
	
	/**
	 * Checks if parameter is a prime number
	 * @param n Input
	 * @return True or false
	 */
	public static boolean isPrime(int n) {
		if(n % 2 == 0) return false;
		for(int i = 3; i * i <= n; i+=2) {
			if(n%i==0) { 
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Gets all of the prime numbers under the input limit.
	 * @param limit Limit of how many prime numbers are returned
	 * @return Returns List<Integer>
	 */
	public static List<Integer> generatePrime(int limit) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < limit; i++) {
			boolean isPrime = true;
			
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				list.add(i);
			}
		}
		
		return list;
	}
}
