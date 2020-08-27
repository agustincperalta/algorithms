package com.algorithms.ch1;

import com.algorithms.App;

// 1.1.19
// Develop a better implementation of F(N) that saves
// computed values in an array
public class BetterFibonacci {

  public static void main(String[] args) {

    App.printArray(best_fibonacci(54));

  }

  private static Long[] best_fibonacci(int N) {
    Long[] result = new Long[N + 1];

    result[0] = 0L;
    result[1] = 1L;
    for (int i = 2; i <= N; i++) {
      result[i] = result[i - 1] + result[i - 2];
    }

    return result;
  }

}
