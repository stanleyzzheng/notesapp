package com.example.firstspringproject;

import java.util.List;

class TestSolution {

  public static void main(String[] args) {
    int arr[] = new int[] { 100, 200, 0, -200, -100 };
    try {
      for (int i = arr.length; i >= 0; i--) {
        try {
          System.out.println(arr[i] / arr[i - 1]);
        } catch (Exception e) {
          System.out.println("Error found inside loop");
        }
      }
    } catch (Exception e) {
      System.out.println("Error found outside loop");
    } finally {
      System.out.println("Goodbye");
    }
  }
}
