package com.github.trungee.algorithm.dynamic_programming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ListAlgorithmTest {

  @Test
  public void toBalancedAngle_keepAsSourceIfBalanced() {
    assertEquals("<><>", ListAlgorithm.toBalancedAngles("<><>"));
  }

  @Test
  public void toBalancedAngles_onlyAddFirst() {
    assertEquals("<><><>", ListAlgorithm.toBalancedAngles("><><>"));
    assertEquals("<<>><><>", ListAlgorithm.toBalancedAngles(">><><>"));
  }

  @Test
  public void toBalancedAngles_addBothSides() {
    assertEquals("<><><>", ListAlgorithm.toBalancedAngles("<><><"));
    assertEquals("<<>><><><<>>", ListAlgorithm.toBalancedAngles(">><><><<"));
  }
}