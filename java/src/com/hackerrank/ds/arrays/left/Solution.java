package com.hackerrank.ds.arrays.left;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
  private static final Integer ZERO = Integer.valueOf(0);
  private static final Integer ONE = Integer.valueOf(1);
  private static final Integer ARR_SIZE_IND = ZERO;
  private static final Integer SHIFT_IND = ONE;
  private static final Character SPACE = ' ';
  
  private void doAShift(Integer arrSize, Integer shift, String intLines) {
    String nums[] = intLines.split(" ");
    
    for(Integer a = ZERO; a < nums.length; a++) {
      Integer shiftInd = a + shift;
      if(shiftInd >= nums.length) {
        shiftInd = shiftInd - nums.length;
      }
      System.out.print(nums[shiftInd]);
      System.out.print(SPACE);
    }
  }
  
  public static void main(String[] args) {
    BufferedReader txt = null;
    try {
      txt = new BufferedReader(new InputStreamReader(System.in));
      String props[] = txt.readLine().split(" ");
      Integer arrSize = Integer.parseInt(props[ARR_SIZE_IND]);
      Integer shift = Integer.parseInt(props[SHIFT_IND]);
      String vals = txt.readLine();
      Solution go = new Solution();
      go.doAShift(arrSize, shift, vals);
      
    } catch (IOException bad) {
      bad.printStackTrace();
    } finally {
      if (txt != null) {
        try {
          txt.close();
        } catch (IOException bad) {
          bad.printStackTrace();
        }
      }
    }

  }

}
