package com.hackerrank.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.hackerrank.ds.linkedlist.reverse.Solution;

public class SolutionRunner {
  public static void main(String[] args) {
    HackerRankSolution solution = new Solution();
    BufferedReader testFile = null;
    try {
      testFile = new BufferedReader(new FileReader(new File(args[0])));
      solution.prepareData(testFile);
      solution.runSolution();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      if(testFile != null) {
        try {
          testFile.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
