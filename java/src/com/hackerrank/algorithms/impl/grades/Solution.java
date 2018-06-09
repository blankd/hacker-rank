package com.hackerrank.algorithms.impl.grades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
  private static final Integer MOD = 5;
  private static final Integer MAX_PASSING_GRADE = 40;
  private static final Integer MAX_GRADE_DIFF = 3;

  private int calculateGrade(Integer grade) {
    if(grade < MAX_PASSING_GRADE - MAX_GRADE_DIFF) {
      return grade;
    }
    Integer gradeDiff = (MOD - (grade % MOD));
    return (gradeDiff < MAX_GRADE_DIFF) ? grade + gradeDiff : grade;
  }

  public static void main(String[] args) {
    BufferedReader reader = null;
    BufferedWriter writing = null;
    try {
      reader = new BufferedReader(new InputStreamReader(System.in));
      writing = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      Integer grades = Integer.parseInt(reader.readLine());
      Solution app = new Solution();
      for (Integer grade = 0; grade < grades; grade++) {
        writing.write(Integer.toString(app.calculateGrade(Integer.parseInt(reader.readLine()))));
        writing.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(reader != null)
          reader.close();
        if(writing != null)
          writing.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}