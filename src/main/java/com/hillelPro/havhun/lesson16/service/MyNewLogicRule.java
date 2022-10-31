package com.hillelPro.havhun.lesson16.service;

public interface MyNewLogicRule {
    public default String printAndReturnResult(final String stringForPrint) {
        final String result = "RESULT OF printAndReturnResult: ".concat(stringForPrint);
        System.out.println(result);
        return result;
    }

    default void someLogic() {
        //some NEW logic...
    }

}
