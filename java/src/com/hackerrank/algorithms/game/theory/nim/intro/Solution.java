package com.hackerrank.algorithms.game.theory.nim.intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/challenges/nim-game-1
 * @author blankd
 *
 */
public class Solution {
  private static final Integer ZERO = Integer.valueOf(0);
  private static final String FIRST = "First";
  private static final String SECOND = "Second";
  
  public Boolean playerOneWins(String[] heaps) {
    Integer theGame = ZERO;
    for(String heap : heaps) {
      theGame = theGame ^ Integer.parseInt(heap);
    }
    return (theGame > ZERO);
  }
  public static void main(String[] args) {
    BufferedReader txt = null;
    Solution game = new Solution();
    try {
      txt = new BufferedReader(new InputStreamReader(System.in));
      Integer games = Integer.parseInt(txt.readLine());
      for(Integer g = ZERO; g < games; g++){
        txt.readLine();//No need for this
        String heaps[] = txt.readLine().split(" ");
        if(game.playerOneWins(heaps)) {
          System.out.println(FIRST);
        } else {
          System.out.println(SECOND);
        }
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
