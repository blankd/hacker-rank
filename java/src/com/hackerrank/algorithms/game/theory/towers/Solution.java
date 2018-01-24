package com.hackerrank.algorithms.game.theory.towers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/challenges/tower-breakers-1
 * @author blankd
 *
 */
public class Solution {
  private static final Integer ZERO = Integer.valueOf(0);
  private static final Integer ONE = Integer.valueOf(1);
  private static final Integer TWO = Integer.valueOf(2);
  private static final Integer TOWERS_IND = ZERO;
  private static final Integer SIZE_IND = ONE;
  public static void main(String[] args) {
    BufferedReader txt = null;
    try {
      txt = new BufferedReader(new InputStreamReader(System.in));
      Integer games = Integer.parseInt(txt.readLine());
      for(Integer g = ZERO; g < games; g++) {
        String towersData[] = txt.readLine().split(" ");
        Integer towers = Integer.parseInt(towersData[TOWERS_IND]);
        Integer sizes = Integer.parseInt(towersData[SIZE_IND]);
        
        System.out.println((towers % TWO == ZERO || sizes == ONE) ? "2" : "1");
        
      }
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
