package com.hillelPro.havhun.lesson16.service;

public interface PrintService extends DefaultService {
      String str = "str text example";

      public static void printHello() {
            System.out.println("Hello from PrintService");
            System.out.println("Hello from PrintService");
            System.out.println("Hello from PrintService");
      }

      public default String printAndReturnResult(final String stringForPrint) {
            final String result = "Result of print: ".concat(stringForPrint);
            System.out.println(result);
            return result;
      }

      default void someLogic() {
            //some NEW logic...
      }


}
