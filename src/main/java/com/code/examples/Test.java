package com.code.examples;

public class Test {
  public static void main(final String[] args) {
    //
    final InfinityLoopExample infinityLoopExample = new InfinityLoopExample();
    final int ret1 = infinityLoopExample.div(3,0);
    System.out.println("infinityLoopExample.div:" + ret1);

    //
    final CopyPasteError copyPasteError = new CopyPasteError();
    final int ret2 = copyPasteError.specialSum();
    System.out.println("copyPasteError.specialSum:" + ret2);

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
    final String buttonText = deserializeUntrustedData.getButtonText();
    System.out.println("deserializeUntrustedData.getButtonText" + buttonText);
  }
}
