package com.codurance.bubble_sort;

public class BubbleSort {
  public int[] sort(int[] array) {
    if (array.length == 0) {
      return new int[]{};
    }

    boolean isSorted = false;

    while (!isSorted) {
      isSorted = true;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]){
          int temp = array[i + 1];
          array[i + 1] = array[i];
          array[i] = temp;
          isSorted = false;
        }
      }

    }
    return array;
  }
}
