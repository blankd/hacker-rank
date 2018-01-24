package com.hackerrank.algorithms.fib.mod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * https://www.hackerrank.com/challenges/fibonacci-modified
 * 
 * @author blankd
 */
public class Solution {
  private static final Integer TWO = Integer.valueOf(2);
  private static final Integer F_ONE_IND = Integer.valueOf(0);
  private static final Integer F_TWO_IND = Integer.valueOf(1);
  
  public BigInteger runSolution(String one, String two, Integer max) {
    BigInteger ret = BigInteger.ZERO;
    BigInteger fOne = new BigInteger(one);
    BigInteger fTwo = new BigInteger(two);
    
    for(Integer f = TWO; f < max; f++) {
      ret = fOne.add(fTwo.pow(TWO));
      fOne = fTwo;
      fTwo = ret;
    }
    
    return ret;
  }
  
  public static void main(String[] args) {
    BufferedReader txt = null;
    try {
      txt = new BufferedReader(new InputStreamReader(System.in));
      String vals[] = txt.readLine().split(" ");
      
      Solution sol = new Solution();
      System.out.println(sol.runSolution(vals[F_ONE_IND], vals[F_TWO_IND], Integer.parseInt(vals[TWO])));
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if(txt != null) {
        try {
          txt.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

}
