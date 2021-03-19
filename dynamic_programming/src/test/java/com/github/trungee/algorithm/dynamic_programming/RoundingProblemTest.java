package com.github.trungee.algorithm.dynamic_programming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RoundingProblemTest {

  @Test
  void getRoundedPrices() {
    final double[] prices = new double[] {1.2, 2.3, 3.1, 2.9 };
    assertArrayEquals(new double[] {1, 2, 3, 4}, RoundingProblem.roundedPrices(prices));
  }
}