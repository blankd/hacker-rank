package com.hackerrank.ai.bots.cleaner.large;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.hackerrank.ai.bots.cleaner.CleanerBot;

public class Solution {
	private final static Integer BOT_ROW = Integer.valueOf(0);
	private final static Integer BOT_COL = Integer.valueOf(1);
	private final static Integer GRID_HEIGHT = Integer.valueOf(0);
	private final static Integer GRID_WIDTH = Integer.valueOf(1);
	public static void main(String[] args) {
		BufferedReader txt = null;
		try {
		  txt = new BufferedReader(new InputStreamReader(System.in));
	    String botPos[] = txt.readLine().split("\\s+");
	    Integer botRow = Integer.parseInt(botPos[BOT_ROW]);
	    Integer botCol = Integer.parseInt(botPos[BOT_COL]);
	    String gridDims[] = txt.readLine().split("\\s+");
	    Integer gridH = Integer.parseInt(gridDims[GRID_HEIGHT]);
	    Integer gridW = Integer.parseInt(gridDims[GRID_WIDTH]);
	    String board[] = new String[gridH];
	    for(Integer b = Integer.valueOf(0); b < gridH; b++) {
	    	board[b] = txt.readLine();
	    }
	    CleanerBot bot = new CleanerBot(botRow, botCol, gridH, gridW);
	    
	    bot.getCleaning();
		} catch(IOException f) {
    	f.printStackTrace();
    }
	}

}
