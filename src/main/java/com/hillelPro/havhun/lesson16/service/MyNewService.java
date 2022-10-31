package com.hillelPro.havhun.lesson16.service;

public class MyNewService implements DefaultService, PrintService, MyNewLogicRule{
    @Override
    public String printAndReturnResult(final String stringForPrint) {
        if (stringForPrint.length() > 10) {
            return PrintService.super.printAndReturnResult(stringForPrint);
        }
        return MyNewLogicRule.super.printAndReturnResult(stringForPrint);
    }

    @Override
    public void someLogic() {
        MyNewLogicRule.super.someLogic();
    }

}
