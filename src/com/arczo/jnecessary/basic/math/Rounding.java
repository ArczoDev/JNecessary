package com.arczo.jnecessary.basic.math;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is in charge of all rounding based operations.
 * @author Jon McLean (jon@arczo.com)
 * @since 23/2/15
 */
public class Rounding {
	
	
	private Rounding() { }
	
	public static double ceil(double n) {
		String str = Double.toString(n);
		List<String> dlist = new  ArrayList<String>();
		String[] a = str.split("\\.");
		for(int i = 0; i < a.length; i++) {
			dlist.add(a[i]);
		}
		
		for(int x = 0; x < dlist.size(); x++) {
			String current = dlist.get(x);
			if(current.contains(".")) {
				dlist.remove(x);
				break;
			}
		}
		
		String ret = dlist.get(0);
		return Double.parseDouble(ret) + 1;
	
	}
	
	public static double floor(double n) {
		return (double)(int)n;
	}
	
}
