package com.hackerrank.algorithms.impl.beautiful.triplets;

//https://www.hackerrank.com/challenges/beautiful-triplets/problem
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Solution {
  private int findTriplets(int d, int[] nums) {
    int count = 0;
    for(int x = 0; x < nums.length; x++) {
      if(foundNumber(nums[x]+d, nums) && foundNumber(nums[x]+(d*2), nums)) {
        count++;
      }
    }
    return count;
  }

  private boolean foundNumber(int number, int[] nums) {
    Boolean ret = Boolean.FALSE;

    for(int num : nums) {
      ret = num == number;
      if(ret) break;
    }

    return ret;
  }

  private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) {
    BufferedWriter writer = null;
    try {
      writer = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
      int[] dAndN = Stream.of(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int d = dAndN[1];
      Solution app = new Solution();
      writer.write(String.valueOf(app.findTriplets(d,
          Stream.of(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray())));
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if(reader != null) {
        try {
          reader.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }

      if(writer != null) {
        try {
          writer.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
}