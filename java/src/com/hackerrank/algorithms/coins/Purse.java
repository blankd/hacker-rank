package com.hackerrank.algorithms.coins;

import java.util.ArrayList;
import java.util.List;

public class Purse {
	private List<Integer> coins;
	
	public Purse(List<Integer> coins) {
		this.coins = coins;
	}
	
	public Purse(String input) {
		coins = new ArrayList<Integer>();
		String[] items = input.split("\\s");
		for(String item : items) {
			coins.add(Integer.parseInt(item));
		}
	}
	
	public Purse(String[] input) {
		coins = new ArrayList<Integer>();
		for(String in : input) {
			coins.add(Integer.parseInt(in));
		}
	}
	
	public Purse(Integer[] input) {
		coins = new ArrayList<Integer>();
		for(Integer in : input) {
			coins.add(in);
		}
	}
	
	public Purse() {
		coins = new ArrayList<Integer>();
	}
	
	public Integer modMax(Integer max) {
		Integer ret = Integer.valueOf(0);
		
		for(Integer coin : coins) {
			if(max % coin  == 0) {
				ret++;
			}
		}
		
		return ret;
	}

	public List<Integer> getCoins() {
		return coins;
	}

	public void setCoins(List<Integer> coins) {
		this.coins = coins;
	}
	
	public void setCoins(String input) {
		String[] items = input.split("\\s");
		for(String item : items) {
			coins.add(Integer.parseInt(item));
		}
	}
	
	public void setCoins(String[] input) {
		for(String in : input) {
			coins.add(Integer.parseInt(in));
		}
	}
	
	public void setCoins(Integer[] input) {
		for(Integer in : input) {
			coins.add(in);
		}
	}
}
