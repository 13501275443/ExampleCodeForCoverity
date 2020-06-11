package com.code.examples;

class IntegerOverflow {
  public int div(final int a) {
    final int b = a - 10;
    final int c = 100 / a;
    if (b == 0) {
      return a / b;
    } else {
      return c;
    }
  }

  public int calc(final int a, final int b) {
    final int sum = a + b;
    final int square = sum * sum;
    return square / 2;
  }
}
