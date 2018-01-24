package com.hackerrank.algorithms.impl.cut.sticks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

  public static void main(String[] args) {
    BufferedReader txt = null;
    try {
      txt = new BufferedReader(new InputStreamReader(System.in));
      Integer N = Integer.parseInt(txt.readLine());
      String nums[] = txt.readLine().split("\\s+");
      Integer arr[] = new Integer[N];
      Integer min = Integer.MAX_VALUE;
      for(int a = 0; a < N; a++) {
        Integer newItem = Integer.parseInt(nums[a]);
        arr[a] = newItem;
        if(min > newItem) {
          min = newItem;
        }
      }
      
      Boolean keepGoing = Boolean.TRUE;
      
      while(keepGoing) {
        Integer nextMin = Integer.MAX_VALUE;
        Integer cuts = 0;
        for(int z = 0; z < N; z++) {
          Integer taken = arr[z];
          if(taken > 0) {
            cuts++;
            Integer diff = taken - min;
            arr[z] = diff;
            if(diff > 0 && diff < nextMin) {
              nextMin = diff;
            }
          }
        }
        
        if(cuts > 0) {
          min = nextMin;
          System.out.println(cuts);
        } else {
          keepGoing = Boolean.FALSE;
        }
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
