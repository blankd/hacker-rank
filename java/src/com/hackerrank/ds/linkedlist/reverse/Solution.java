package com.hackerrank.ds.linkedlist.reverse;

import com.hackerrank.main.HackerRankSolution;

import java.io.BufferedReader;
import java.io.IOException;

public class Solution implements HackerRankSolution {
  private DoublyLinkedListNode theHead;
  @Override
  public void prepareData(BufferedReader testFile) {
    final DoublyLinkedList initialList = new DoublyLinkedList();
    try {
      testFile.readLine(); // Read number of test cases
      testFile.readLine(); // read list size
      String line;
      while((line = testFile.readLine()) != null) {
        initialList.insertNode(Integer.parseInt(line));
      }
      this.theHead = initialList.head;
    } catch(IOException io) {
      io.printStackTrace();
    }
  }

  @Override
  public void runSolution() {
    this.theHead = this.letsDoRecursion(this.theHead, 1);
    while(this.theHead != null) {
      this.theHead = this.theHead.next;
    }
  }

  private DoublyLinkedListNode letsDoRecursion(DoublyLinkedListNode someNode, Integer breaker) {
    if(breaker == 50) {
      return someNode;
    }
    DoublyLinkedListNode willRecure = someNode.next;
    someNode.next = someNode.prev;
    someNode.prev = willRecure;
    if(willRecure == null) {
      System.out.println("Broke at " + breaker);
      return someNode;
    }
    return letsDoRecursion(willRecure, breaker + 1);
  }
}
