package com.github.trungee.algorithm.dynamic_programming;

public class RoundingProblem {

  public static double[] roundedPrices(double[] prices) {
    double total = 0;
    for (double price : prices) {
      total += price;
    }
    final double roundedTotal = Math.round(total);
    final boolean needCeiling = roundedTotal > total;
    final double[] roundedPrices;
    if (needCeiling) {
      int maxIndex = maxIndexByDecimalPlace(prices, 0, 0);
      System.out.println("max index: " + maxIndex);
      roundedPrices = plusOneByIndex(prices, maxIndex);
    } else {
      roundedPrices = getRoundedPrices(prices);
    }
    return roundedPrices;
  }

  private static double[] plusOneByIndex(double[] prices, int maxIndex) {
    for (int i = 0; i < maxIndex && i < prices.length; i++) {
      prices[i] = Math.floor(prices[i]);
    }
    for (int i = maxIndex + 1; i < prices.length; i++) {
      prices[i] = Math.floor(prices[i]);
    }
    prices[maxIndex] = Math.round(prices[maxIndex]) + 1;
    return prices;
  }

  private static double[] getRoundedPrices(double[] prices) {
    final double[] roundedPrices = new double[prices.length];
    for (int i = 0; i < prices.length; i++) {
      roundedPrices[i] = Math.floor(prices[i]);
    }
    return roundedPrices;
  }

  private static int maxIndexByDecimalPlace(double[] prices, int currentIndex, int currentMaxIndex) {
    if (currentIndex == prices.length - 1) {
      return currentMaxIndex;
    } else {
      int nextIndex = currentIndex + 1;
      if (prices[nextIndex] % 1 > prices[currentMaxIndex] % 1) {
        currentMaxIndex = nextIndex;
      }
      return maxIndexByDecimalPlace(prices, nextIndex, currentMaxIndex);
    }
  }
}
