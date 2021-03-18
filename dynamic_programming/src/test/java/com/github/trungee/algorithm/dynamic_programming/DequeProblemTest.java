package com.github.trungee.algorithm.dynamic_programming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DequeProblemTest {

  @Test
  public void toBalancedAngle_keepAsSourceIfBalanced() {
    assertEquals("<><>", DequeProblem.toBalancedAngles("<><>"));
  }

  @Test
  public void toBalancedAngles_onlyAddFirst() {
    assertEquals("<><><>", DequeProblem.toBalancedAngles("><><>"));
    assertEquals("<<>><><>", DequeProblem.toBalancedAngles(">><><>"));
  }

  @Test
  public void toBalancedAngles_addBothSides() {
    assertEquals("<><><>", DequeProblem.toBalancedAngles("<><><"));
    assertEquals("<<>><><><<>>", DequeProblem.toBalancedAngles(">><><><<"));
  }
}