package com.codurance.bubble_sort;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortShould {
  // 1 iteration O(n)
  // Worst: O(n^2)
  @ParameterizedTest
  @MethodSource("numbers")
  void sorts_the_array(int[] input, int[] output) {
    BubbleSort bubbleSort = new BubbleSort();
    assertArrayEquals(output, bubbleSort.sort(input));
  }

  public static Object[] numbers() {
    return new Object[][] {
            { new int[]{}, new int[]{}},
            { new int[]{3, 2, 1}, new int[]{1, 2, 3} },
            { new int[]{4, 3, 2, 1}, new int[]{1, 2, 3, 4}},
            {new int[]{-70, 300, 10, 20, -10, -50, 400}, new int[]{-70, -50, -10, 10, 20, 300, 400}}
    };
  }
}
