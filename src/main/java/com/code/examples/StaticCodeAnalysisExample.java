package com.code.examples;

public class StaticCodeAnalysisExample {
  public static void main(final String[] args) {
    //
    final InfinityLoopExample infinityLoopExample = new InfinityLoopExample();
    final int ret1 = infinityLoopExample.calc(3);
    System.out.println("infinityLoopExample.div:" + ret1);

    final int ret2 = infinityLoopExample.fib(3);
    System.out.println("infinityLoopExample.fib:" + ret2);

    //
    final CopyPasteError copyPasteError = new CopyPasteError();
    final int ret3 = copyPasteError.specialSum();
    System.out.println("copyPasteError.specialSum:" + ret3);

    //
    final ResourceLeak resourceLeak = new ResourceLeak();
    final String fileContent = resourceLeak.readFromFile("c:\test.txt");
    resourceLeak.openConnection("connection string for test");
    System.out.println("resourceLeak.readFromFile" + fileContent);

    //
    final NullReference nullReference = new NullReference();
    final String cmdString = nullReference.getCmdProperty();
    System.out.println("resourceLeak.getCmdProperty" + cmdString);
    final String empString = nullReference.getEmployeeString(-1, "test");
    System.out.println("resourceLeak.getEmployeeString" + empString);

    //
    final DeserializeUntrustedData deserializeUntrustedData = new DeserializeUntrustedData();
    deserializeUntrustedData.runMakeCommand();
    final String empName = deserializeUntrustedData.getEmployeeName();
    System.out.println("deserializeUntrustedData.getEmployeeName" + empName);

    //
    final IntegerOverflow integerOverflow = new IntegerOverflow();
    final int avg = integerOverflow.calc(5, 9);
    System.out.println("integerOverflow.calc" + avg);
    final int div = integerOverflow.div(-10);
    System.out.println("integerOverflow.div" + div);
  }
}
