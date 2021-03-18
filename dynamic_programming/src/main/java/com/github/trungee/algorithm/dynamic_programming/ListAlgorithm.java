package com.github.trungee.algorithm.dynamic_programming;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class ListAlgorithm {

  public static String toBalancedAngles(String angles) {
    Deque<Character> deque = new ArrayDeque<>();
    for (char c : angles.toCharArray()) {
      deque.addLast(c);
    }
    int balanceIndex = 0;
    for (int i = 0; i < angles.length(); i++) {
      char c = angles.charAt(i);
      if (balanceIndex == 0) {
        if (c == '<') {
          balanceIndex--;
        } else {
          deque.addFirst('<');
        }
      } else {
        if (balanceIndex < 0) {
          if (c == '>') {
            balanceIndex++;
          } else {
            balanceIndex--;
          }
        }
      }
    }
    while (balanceIndex < 0) {
      deque.addLast('>');
      balanceIndex++;
    }
    return deque.stream().map(String::valueOf).collect(Collectors.joining());
  }

  private static boolean isOpen(int balanceIndex) {
    return balanceIndex < 0;
  }

  private static int getBalanceIndex(int balanceIndex, char c) {
    if (c == '<') {
      balanceIndex--;
    } else {
      balanceIndex++;
    }
    return balanceIndex;
  }

}
