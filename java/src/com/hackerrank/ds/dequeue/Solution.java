package com.hackerrank.ds.dequeue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
  private static final Integer ARR_SIZE = Integer.valueOf(0);
  private static final Integer SUB_ARR_SIZE = Integer.valueOf(1);
  
  public void runSolution(Integer subArr, String arr[]) {
    Integer max = Integer.MIN_VALUE;
    Deque<String> maxes = new ArrayDeque<String>();
    Set<String> subSet = new TreeSet<String>();
    
    for(String item : arr) {
      maxes.add(item);
      subSet.add(item);
      if(maxes.size() > subArr) {
        String out = maxes.pollFirst();
        if(!maxes.contains(out)) {
          subSet.remove(out);
        }
      }
      
      max = Math.max(max, subSet.size());
    }
    System.out.print(max);
  }
  
  public static void main(String vargs[]) {
    BufferedReader txt = null;
    try {
      txt = new BufferedReader(new InputStreamReader(System.in));
      String params[] = txt.readLine().split(" ");
      Integer arrSize = Integer.parseInt(params[ARR_SIZE]);
      Integer subArrSize = Integer.parseInt(params[SUB_ARR_SIZE]);
      String vals[] = txt.readLine().split(" ");
      
      Solution run = new Solution();
      run.runSolution(subArrSize, vals);
    } catch (IOException e) {
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
