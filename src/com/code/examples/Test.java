package com.code.examples;

abstract class Test {
  public static void main(final String[] args) {
    //
    final InfinityLoopExample infinityLoopExample = new InfinityLoopExample();
    final int ret1 = infinityLoopExample.div(3,1);
    System.out.println("infinityLoopExample.div:" + ret1);

    //
    final CopyPasteError copyPasteError = new CopyPasteError();
    final int ret2 = copyPasteError.specialSum();
    System.out.println("copyPasteError.specialSum:" + ret2);
    //
    final ResourceLeak resourceLeak = new ResourceLeak();
    final String fileContent = resourceLeak.readFromFile("c:\test.txt");
    System.out.println("resourceLeak.readFromFile" + fileContent);
  }
}
