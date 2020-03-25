package com.hackerrank.algorithms.impl.apple.and.orange;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {
  public static void main(String[] args) {
    BufferedReader readFile = null;
    try {
      readFile = new BufferedReader(new FileReader(new File(args[0])));
      int[] sAndT = Stream.of(readFile.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] trees = Stream.of(readFile.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      //Contains array sizes which are not really needed
      int[] unused = Stream.of(readFile.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] apples = Stream.of(readFile.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] oranges = Stream.of(readFile.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if(readFile != null) {
        try {
          readFile.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
