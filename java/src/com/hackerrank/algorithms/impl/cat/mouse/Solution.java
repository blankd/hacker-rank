package com.hackerrank.algorithms.impl.cat.mouse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
  private static final Integer ZERO = Integer.valueOf(0);
  private static final Integer ONE = Integer.valueOf(1);
  private static final String CAT_A = "Cat A";
  private static final Integer CAT_A_POS = ZERO;
  private static final String CAT_B = "Cat B";
  private static final Integer CAT_B_POS = ONE;
  private static final String MOUSE = "Mouse C";
  private static final Integer MOUSE_POS = Integer.valueOf(2);
  
  public static void main(String[] args) {
    BufferedReader txt = null;
    try {
      txt = new BufferedReader(new InputStreamReader(System.in));
      Integer queries = Integer.valueOf(txt.readLine());
      while(!queries.equals(ZERO)) {
        String query[] = txt.readLine().split(" ");
        Integer catAPos = Integer.parseInt(query[CAT_A_POS]);
        Integer catBPos = Integer.parseInt(query[CAT_B_POS]);
        Integer mousePos = Integer.parseInt(query[MOUSE_POS]);
        
        Integer catAMove = catAPos - mousePos;
        Integer catBMove = catBPos - mousePos;
        
        if(Math.abs(catAMove) < Math.abs(catBMove)) {
          System.out.println(CAT_A);
        } else if(Math.abs(catAMove) > Math.abs(catBMove)) {
          System.out.println(CAT_B);
        } else if(Math.abs(catAMove) == Math.abs(catBMove)) {
          System.out.println(MOUSE);
        }
        
        queries = queries - 1;
      }
    } catch (IOException bad) {
      bad.printStackTrace();
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
