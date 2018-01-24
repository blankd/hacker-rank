package com.hackerrank.algorithms.game.arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
  private static final String BOB = "BOB";
  private static final String ANDY = "ANDY";
  
  public String runSolution(String[] vals) {
    String ret = BOB;
    Integer turns = this.playGame(vals);
    
    if((turns % 2) == 0) {
      ret = ANDY;
    }
    
    return ret;
  }
  
  private Integer playGame(String[] vals) {
    Integer turns = Integer.valueOf(0);
    Integer curMax = Integer.MIN_VALUE;
    
    for(Integer i = Integer.valueOf(0); i < vals.length; i++) {
      Integer num = Integer.parseInt(vals[i]);
      
      if(num > curMax) {
        curMax = num;
        turns = turns + 1;
      }
    }
    
    return turns;
  }
  
  public static void main(String[] args) {
    BufferedReader txt = null;
    try {
      txt = new BufferedReader(new InputStreamReader(System.in));
      
      Integer cases = Integer.parseInt(txt.readLine());
      while(cases > 0) {
        txt.readLine();
        String vals[] = txt.readLine().split(" ");
        
        Solution sol = new Solution();
        System.out.println(sol.runSolution(vals));
        
        cases = cases - 1;
      }
      
      
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      if(txt != null) {
        try {
          txt.close();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    }
  }

}
