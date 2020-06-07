package com.code.examples;

class CopyPasteError {
  private int add10(final int n) {
    return n + 10;
  }

  public int specialSum() {
    int num1 = 10;
    int num2 = 20;
    int ret = 0;
    for (; num1 < 20; num1++) {
      ret += add10(num1);
    }
    for (; num2 < 30; num2++) {
      ret += add10(num1);
    }
    return ret;
  }
}
