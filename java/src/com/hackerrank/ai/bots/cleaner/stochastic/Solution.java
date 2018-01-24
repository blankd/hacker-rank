package com.hackerrank.ai.bots.cleaner.stochastic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.hackerrank.ai.bots.cleaner.CleanerBot;

public class Solution {
	private final static Integer BOT_ROW = Integer.valueOf(0);
	private final static Integer BOT_COL = Integer.valueOf(1);
	private final static Integer BOARD_SIZE = Integer.valueOf(5);
	private final static Integer INVALID = Integer.valueOf(-1);
	
	private final static String DIRT = "d";
	
	private final static String UP = "UP";
	private final static String DOWN = "DOWN";
	private final static String LEFT = "LEFT";
	private final static String RIGHT = "RIGHT";
	private final static String CLEAN = "CLEAN";
	public static void main(String[] args) {
		BufferedReader txt = null;
		Integer botRow, botCol;
		Integer curColDirt = INVALID;
		Integer curRowDirt = INVALID;
		String board[] = new String[BOARD_SIZE];
		try {
      txt = new BufferedReader(new InputStreamReader(System.in));
	    String botPos[] = txt.readLine().split("\\s+");
	    botRow = Integer.parseInt(botPos[BOT_ROW]);
	    botCol = Integer.parseInt(botPos[BOT_COL]);
	    for(Integer b = Integer.valueOf(0); b < BOARD_SIZE; b++) {
	    	board[b] = txt.readLine();
	    }
	    
	    CleanerBot bot = new CleanerBot(botCol, botRow, BOARD_SIZE, BOARD_SIZE);
	    bot.setBoard(board);
	    
	    bot.getCleaning();
    } catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
    }
	}

}
