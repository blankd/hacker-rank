package com.hackerrank.algorithms.string.anagram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Solution {
  private static final String ANAGRAMS = "Anagrams";
  private static final String NOT_ANAGRAMS = "Not Anagrams";
  private static final Integer ZERO = Integer.valueOf(0);
  
  private Boolean isAnagram(String one, String two) {
    Boolean ret = Boolean.TRUE;
    
    if(one != null && two != null) {
      String lOne = one.toLowerCase();
      String lTwo = two.toLowerCase();
      if(lOne.length() == lTwo.length()) {
        char[] oneChars = lOne.toCharArray();
        //The following line does not work in java for some reason
        //Set<Character> chars = new HashSet<Character>(Arrays.asList(one.toCharArray()));
        Set<Character> chars = new HashSet<Character>();
        for(Integer c = ZERO; c < one.length(); c++) {
          if(!chars.contains(oneChars[c])) {
            chars.add(oneChars[c]);
            Integer oneCount = this.countChars(oneChars[c], lOne);
            Integer twoCount = this.countChars(oneChars[c], lTwo);
     
            if(oneCount != twoCount) {
              ret = Boolean.FALSE;
              break;
            }
          }
        }
      } else {
        ret = Boolean.FALSE;
      }
    } else { 
      ret = Boolean.FALSE;
    }
    
    return ret;
  }
  
  private Integer countChars(Character c, String word) {
    Integer ret = ZERO;
    Integer lastInd = word.indexOf(c);

    while(lastInd != -1) {
      lastInd = word.indexOf(c, lastInd + 1);
      ret = ret + 1;
    }
    
    return ret;
  }
  public static void main(String args[]) {
    BufferedReader txt = null;
    try {
      txt = new BufferedReader(new InputStreamReader(System.in));
      String wordOne = txt.readLine();
      String wordTwo = txt.readLine();
      
      Solution sol = new Solution();
      if(sol.isAnagram(wordOne, wordTwo)) {
        System.out.println(ANAGRAMS);
      } else {
        System.out.println(NOT_ANAGRAMS);
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
