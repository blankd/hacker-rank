package com.hackerrank.algorithms.impl;

import com.hackerrank.main.HackerRankSolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

// Solution for https://www.hackerrank.com/challenges/apple-and-orange/problem
public class AppleAndOrange implements HackerRankSolution {
  private static final Integer S_AND_APPLE_TREE = 0;
  private static final Integer T_AND_ORANG_TREE = 1;
  private int[] sAndT, trees, apples, oranges;
  @Override
  public void prepareData(BufferedReader testFile) {
    try {
      this.sAndT = Stream.of(testFile.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      this.trees = Stream.of(testFile.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] unused = Stream.of(testFile.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      this.apples = Stream.of(testFile.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      this.oranges = Stream.of(testFile.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    } catch (IOException e) {
      e.printStackTrace();
    }
    //Contains array sizes which are not really needed
  }

  @Override
  public void runSolution() {
    int[] hits = {0, 0};
    Arrays.stream(apples).forEach(apple -> hits[0] += didHit(trees[S_AND_APPLE_TREE] + apple));
    Arrays.stream(oranges).forEach(orange -> hits[1] += didHit(trees[T_AND_ORANG_TREE] + orange));
    Arrays.stream(hits).forEach(System.out::println);
  }

  private Integer didHit(Integer distance) {
    return distance >= this.sAndT[S_AND_APPLE_TREE] && distance <= this.sAndT[T_AND_ORANG_TREE] ? 1 : 0;
  }
}
