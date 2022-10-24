package com.hillelPro.havhun.lesson15;

public class CalcService<E, U, Q extends String> {
    private E first;
    private U second;

//    public Q sum(E e, U u) {
//        if (e instanceof Integer && u instanceof Integer) {
//            final Integer var = (int) e + (int) u;
//            return (Q) String.valueOf(var);
//        }

//        if (e instanceof Long && u instanceof Long) {
//            final Long var = (long) e + (long) u;
//            return (Q) String.valueOf(var);
//        }
//
//        throw new UnsupportedOperationException("Данный тип переменной не поддерживается!");
////        return null;
//    }



    public E getFirst() {
        return first;
    }

    public void setFirst(final E first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(final U second) {
        this.second = second;
    }


}
