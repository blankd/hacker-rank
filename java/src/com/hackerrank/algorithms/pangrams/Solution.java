package com.hackerrank.algorithms.pangrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

	public static void main(String[] args) {
		BufferedReader txt = new BufferedReader(new InputStreamReader(System.in));
		try {
	    String theStr = txt.readLine();
	    String lowerStr = theStr.toLowerCase();
	    char[] letters = lowerStr.toCharArray();
	    Set<Character> alpha = new TreeSet<Character>();
	    Boolean isPanagram = Boolean.FALSE;
	    
	    for(char letter : letters) {
	    	if(Character.isLetter(letter)) {
	    		alpha.add(letter);
	    		
	    		if(alpha.size() > 25) {
	    			isPanagram = Boolean.TRUE;
	    			break;
	    		}
	    	}
	    }
	    
	    if(isPanagram) {
	    	System.out.println("pangram");
	    } else {
	    	System.out.println("not pangram");
	    }
    } catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
    }
	}

}
