package com.hackerrank.ai.bots.cleaner;

public class CleanerBot {
	private Integer botCol, botRow, boardRowSize, boardColSize;
	private String[] board;
	
	private final static Integer INVALID = Integer.valueOf(-1);
	
	private final static String DIRT = "d";
	private final static String BOT = "b";
	private final static String UP = "UP";
	private final static String DOWN = "DOWN";
	private final static String LEFT = "LEFT";
	private final static String RIGHT = "RIGHT";
	private final static String CLEAN = "CLEAN";
	
	public CleanerBot(Integer botCol, Integer botRow, Integer boardRowSize, Integer boardColSize) {
		this.botCol = botCol;
		this.botRow = botRow;
		this.boardRowSize = boardRowSize;
		this.boardColSize = boardColSize;
	}
	
	public CleanerBot(String[] board) {
		this.board = board;
		this.boardRowSize = board.length;
		this.boardColSize = board[0].length();
		
		for(int b = 0; b < board.length; b++) {
			if(this.board[b].contains(BOT)) {
				this.botCol = this.board[b].indexOf(BOT);
				this.botRow = b;
				break;
			}
		}
	}
	
	public void getCleaning() {
		Integer nextColDirt = this.board[this.botRow].indexOf(DIRT);
		Integer nextRowDirt = this.getNextRowDirt();
		
		String botPos = this.getBotData();
		
		if(botPos.equalsIgnoreCase(DIRT)) {
			System.out.println(CLEAN);
		} else if(nextColDirt == INVALID && nextRowDirt == INVALID) {
			this.findNearestDirtRow();
		} else if(nextColDirt != INVALID && nextRowDirt == INVALID) {
			this.moveHoriziontally(nextColDirt);
		} else if(nextRowDirt != INVALID && nextColDirt == INVALID) {
			System.out.println("No Col");
			this.moveVertically(nextRowDirt);
		} else {
			this.findNearestDirt(nextRowDirt, nextColDirt);
		}
	}
	
	private void findNearestDirt(Integer dirtRow, Integer dirtCol) {
		Integer rowDist = Math.abs(this.botRow - dirtRow);
		Integer colDist = Math.abs(this.botCol - dirtCol);
		
		if(rowDist <= colDist) {
			this.moveVertically(dirtRow);
		} else {
			this.moveHoriziontally(dirtCol);
		}
	}
	private void findNearestDirtRow() {
		Integer nearestDirtRow = INVALID;
		for(int d = 0; d < this.board.length; d++) {
			Integer posDirtRow = board[d].indexOf(DIRT);
			if(posDirtRow != INVALID) {
				if(nearestDirtRow == INVALID) {
					nearestDirtRow = d;
				} else {
					nearestDirtRow = this.checkIsNearestDirt(d, nearestDirtRow);
				}
			}
		}
		this.moveVertically(nearestDirtRow);
	}
	
	private void moveHoriziontally(Integer nextCol) {
		if(this.botCol < nextCol) {
			System.out.println(RIGHT);
		} else {
			System.out.println(LEFT);
		}
	}
	
	private void moveVertically(Integer nextRow) {
		if(this.botRow < nextRow) {
			System.out.println(DOWN);
		} else {
			System.out.println(UP);
		}
	}
	private Integer checkIsNearestDirt(Integer row, Integer lastRow) {
		Integer ret = lastRow;
		Integer dirtDistance = Math.abs(row - this.botRow);
		Integer lastDirtDistance = Math.abs(lastRow - this.botRow);
		
		if(dirtDistance < lastDirtDistance) {
			ret = row;
		}
		
		return ret;
	}
	private String getBotData() {
		return this.board[this.botRow].substring(botCol, botCol + 1);
	}
	private Integer getNextRowDirt() {
		Integer ret = INVALID;
		
		for(int r = 0; r < board.length; r++) {
			String rowVal = this.board[r].substring(this.botCol, this.botCol + 1);
			if(rowVal.equalsIgnoreCase(DIRT)) {
				ret = r;
				break;
			}
		}
		
		return ret;
	}
	//Getters and Setters
	public Integer getBotCol() {
		return botCol;
	}

	public void setBotCol(Integer botCol) {
		this.botCol = botCol;
	}

	public Integer getBotRow() {
		return botRow;
	}

	public void setBotRow(Integer botRow) {
		this.botRow = botRow;
	}

	public Integer getBoardRowSize() {
		return boardRowSize;
	}

	public void setBoardRowSize(Integer boardSize) {
		this.boardRowSize = boardSize;
	}

	public String[] getBoard() {
		return board;
	}

	public void setBoard(String[] board) {
		this.board = board;
	}
}
