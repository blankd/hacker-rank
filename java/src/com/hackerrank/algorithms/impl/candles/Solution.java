package com.hackerrank.algorithms.impl.candles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {

  public static void main(String[] args) {
    BufferedReader txt = null;
    try {
      txt = new BufferedReader(new InputStreamReader(System.in));
      
      txt.readLine();
      String cSize[] = txt.readLine().split(" ");
      Integer max = Integer.MIN_VALUE;
      Map<Integer, Integer> candles = new HashMap<Integer, Integer>();
      for(String size : cSize) {
        Integer sizeInt = Integer.parseInt(size);
        if(candles.containsKey(sizeInt)) {
          Integer increase = candles.get(sizeInt) + 1;
          candles.put(sizeInt, increase);
        } else {
          candles.put(sizeInt, Integer.valueOf(1));
        }
        
        if(sizeInt > max) {
          max = sizeInt;
        }
      }
      
      System.out.print(candles.get(max));
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      if(txt != null) {
        try {
          txt.close();
        } catch(IOException bad) {
          bad.printStackTrace();
        }
      }
    }
  }
}
