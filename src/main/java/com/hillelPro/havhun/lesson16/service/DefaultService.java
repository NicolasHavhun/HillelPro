package com.hillelPro.havhun.lesson16.service;

public interface DefaultService {
    public default String printAndReturnResult(final String stringForPrint) {
        final String result = "RESULT OF PRINT: ".concat(stringForPrint);
        System.out.println(result);
        return result;
    }

    default void someLogic() {
        //some logic...
    }

}

