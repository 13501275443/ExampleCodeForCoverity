package com.code.examples;

class InfinityLoopExample {
  public int calc(final int end)  {
    final int min = -100;
    final int max = 100;
    int ret = 0;
    int start = end;
    while (start > min && start < max) {
      if (start > 50) {
        start += 10;
      } else if (start > 10) {
        start++;
      } else if (start < 0) {
        start -= 10;
      } else {
        //Do other complicate stuff
        System.out.println("Do other complicate stuff based on " + end);
      }
      ret++;
    }
    return ret;
  }

  public int fib(final int a) {
    return fib(a - 1) + fib(a - 2);

  }
}
