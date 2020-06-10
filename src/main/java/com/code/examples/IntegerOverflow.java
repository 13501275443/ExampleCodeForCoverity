package com.code.examples;

class IntegerOverflow {
  private boolean isEven(final int a) {
    return a % 2 == 0;
  }

  public int bigNumber(final int a) {
    int ret = a / 2;
    if (isEven(a)) {
      ret = a * a;
    }
    return ret;
  }

  public int div(final int a) {
    final int b = avg(a, 10);
    return 100 / b;
  }

  public int avg(final int a, final int b) {
    return (a + b) / 2;
  }
}
