package com.hackerrank.algorithms.impl.socks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
  private static Integer START_VAL = Integer.valueOf(1);
  private static Integer PAIR_VAL = Integer.valueOf(2);
  public static void main(String args[]) {
    BufferedReader txt = null;
    try {
    txt = new BufferedReader(new InputStreamReader(System.in));
      Integer total = Integer.parseInt(txt.readLine());
      Map<String, Integer> pairs = new HashMap<String, Integer>();
      String numLine = txt.readLine();
      String nums[] = numLine.split(" ");
      for(Integer s = 0; s < nums.length; s++) {
        String num = nums[s];
        if(!pairs.containsKey(num)) {
          pairs.put(num, START_VAL);
        } else {
          Integer numVal = pairs.get(num) + 1;
          pairs.put(num, numVal);
        }
      }
      
      Integer thePairs = Integer.valueOf(0);
      for(String key : pairs.keySet()) {
        Integer items = pairs.get(key);
        if((items % PAIR_VAL) == 0) {
          thePairs += (items/PAIR_VAL);
        } else {
          Integer aPair = Integer.valueOf(0);
          while(items > START_VAL) {
            aPair += START_VAL;
            items -= PAIR_VAL;
          }
          thePairs += aPair;
        }
      }
      
      System.out.println(thePairs);
    } catch (NumberFormatException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
