package com.hackerrank.ai.bots.saveprincesstwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	private static final Integer PLAYER_ROW = Integer.valueOf(0);
	private static final Integer PLAYER_COL = Integer.valueOf(1);
	
	private static final String PRINCESS = "p";
	public static void main(String[] args) {
		BufferedReader txt = null;
		try {
	    txt = new BufferedReader(new InputStreamReader(System.in));
	    Integer maxGrid = Integer.parseInt(txt.readLine());
	    String mPos[] = txt.readLine().split("\\s+");
	    Integer playerRow = Integer.parseInt(mPos[PLAYER_ROW]);
	    Integer playerCol = Integer.parseInt(mPos[PLAYER_COL]);
	    Integer princessRow = Integer.valueOf(-1);
	    Integer princessCol = Integer.valueOf(-1);
	    
	    for(Integer a = Integer.valueOf(0); a < maxGrid; a++) {
	    	String dungeonArea = txt.readLine();
	    	if(dungeonArea.contains(PRINCESS)) {
	    		princessRow = a;
	    		princessCol = dungeonArea.indexOf(PRINCESS);
	    	}
	    }
	    if(playerRow != princessRow) {
	    	if(playerRow < princessRow) {
	    		playerRow++;
	    		System.out.println("DOWN");
	    	} else if(playerRow > princessRow) {
	    		playerRow--;
	    		System.out.println("UP");
	    	}
	    } else if(playerCol != princessCol) {
	    	if(playerCol < princessCol) {
	    		playerCol++;
	    		System.out.println("RIGHT");
	    	} else if(playerCol > princessCol) {
	    		playerCol--;
	    		System.out.println("LEFT");
	    	}
	    }
    } catch(IOException e) {
    	e.printStackTrace();
    } catch(NumberFormatException e) {
    	e.printStackTrace();
    }
	}

}
