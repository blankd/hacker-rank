package com.hackerrank.algorithms.impl.mini.max.sump;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

  public static void main(String[] args) {
    BufferedReader txt = null;
    
    try {
      txt = new BufferedReader(new InputStreamReader(System.in));
      String vals[] = txt.readLine().split(" ");
      Long min = Long.valueOf(Long.MAX_VALUE);
      Long max = Long.valueOf(0);
      for(Integer v = Integer.valueOf(0); v < vals.length; v++) {
        Long sum = Long.valueOf(0);
        
        for(Integer w = Integer.valueOf(0); w < vals.length; w++) {
          Long tick = Long.parseLong(vals[w]);
          if(!v.equals(w)) {
            sum = sum + tick;
          }
        }
        
        if(sum < min) {
          min = sum;
        } 
        
        if(sum > max) {
          max = sum;
        }
      }
      
      System.out.println(min + " " + max);
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
