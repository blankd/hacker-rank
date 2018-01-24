package com.hackerrank.ai.bots.saveprincessone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	private static final String ME = "m";
	private static final String PRINCESS = "p";
	private static final String FLOOR = "-";
	private static final String LEFT = "LEFT";
	private static final String RIGHT = "RIGHT";
	private static final String UP = "UP";
	private static final String DOWN = "DOWN";
	public static void main(String[] args) {
		BufferedReader txt = null;
		try {
	    txt = new BufferedReader(new InputStreamReader(System.in));;
	    Integer gridSize = Integer.parseInt(txt.readLine());
	    Integer meRow = Integer.valueOf(-1);
	    Integer meCol = Integer.valueOf(-1);
	    Integer princessRow = Integer.valueOf(-1);
	    Integer princessCol = Integer.valueOf(-1);
	    
	    String map[] = new String[gridSize];
	    for(Integer ind = Integer.valueOf(0); ind < gridSize; ind++) {
	    	String readLine = txt.readLine();
	    	if(readLine.contains(ME)) {
	    		meRow = ind;
	    		meCol = readLine.indexOf(ME);
	    	} else if(readLine.contains(PRINCESS)) {
	    		princessRow = ind;
	    		princessCol = readLine.indexOf(PRINCESS);
	    	}
	    	
	    	map[ind] = readLine;
	    }
	    
	    while(meRow != princessRow) {
	    	if(meRow < princessRow) {
	    		meRow++;
	    		System.out.println(DOWN);
	    	} else if(meRow > princessRow) {
	    		meRow--;
	    		System.out.println(UP);
	    	}
	    }
	    
	    //String princessPath = map[princessRow];
	    
	    while(meCol != princessCol) {
	    	if(meCol < princessCol) {
	    		meCol++;
	    		System.out.println(RIGHT);
	    	} else if(meCol > princessCol) {
	    		System.out.println(LEFT);
	    		meCol--;
	    	}
	    }
    } catch (NumberFormatException | IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
    }
	}
}
