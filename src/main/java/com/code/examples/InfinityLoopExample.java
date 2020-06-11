package com.code.examples;

class InfinityLoopExample {
  public long calc(final int timeInterval, final int fromInput) {
    final long start = System.currentTimeMillis();
    long cur = start;
    try {
      while (cur < start + timeInterval) {
        Thread.sleep(10);
        System.out.println("Current tick " + cur);
        cur = System.currentTimeMillis();
      }

      while (cur < start + timeInterval / 2) {
        Thread.sleep(10);
        if (fromInput > 50) {
          cur = System.currentTimeMillis();
        }
        System.out.println("Next tick " + cur);
      }
    } catch (final InterruptedException e) {
      System.out.println(e.toString());
    }
    return cur;
  }

  public int fib(final int a) {
    return fib(a - 1) + fib(a - 2);

  }
}
