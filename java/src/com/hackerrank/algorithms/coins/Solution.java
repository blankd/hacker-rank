package com.hackerrank.algorithms.coins;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	private static final Integer TOTAL_IND = Integer.valueOf(0);
	public static void main(String[] args) {
		BufferedReader txt = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] data = txt.readLine().split("\\s");
			Integer maximum = Integer.parseInt(data[TOTAL_IND]);
	    Purse wallet = new Purse(txt.readLine());
    } catch (IOException e) {
	    e.printStackTrace();
    }
	}

}
