package com.code.examples;

import java.util.List;

class InfinityLoopExample {
  public int div(final int dividend, final int divisor)  {
    int ret = 0;
    int x = dividend;
    while (x > divisor) {
      x = x - divisor;
      ret++;
    }
    return ret;
  }

  public void whileLoop() {
    while(true) {
    }
  }
  public int fib(int a) {
    return fib(a-1) + fib(a-2);
  }
}
