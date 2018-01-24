package com.hackerrank.algorithms.findnums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) {
		BufferedReader txt = null;
		try {
		  txt = new BufferedReader(new InputStreamReader(System.in));
	    Integer tests = Integer.parseInt(txt.readLine());
	    for(Integer t = Integer.valueOf(0); t < tests; t++) {
	    	String strNum = txt.readLine();
	    	Integer intNum = Integer.parseInt(strNum);
	    	Integer count = Integer.valueOf(0);
	    	for(Integer num = Integer.valueOf(0); num < strNum.length(); num++) {
	    		Integer exNum = Integer.parseInt(strNum.substring(num,num+1));
	    		if(exNum > 0 && intNum % exNum == 0) {
	    			count++;
	    		}
	    	}
	    	System.out.println(count);
	    }
    } catch (NumberFormatException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
    } catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
    }
	}

}
