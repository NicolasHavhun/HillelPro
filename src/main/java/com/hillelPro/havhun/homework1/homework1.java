package com.hillelPro.havhun.homework1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class homework1 {
    public static void main(String[] args) {
        //2.
        byte primitiveOne= -127;
        short primitiveTwo=32766;
        long primitiveThree=9200000000000000000l;
        float primitiveFour= (float) 3.4E+37;
        char primitiveFive= 'A';
        boolean  primitiveSix = false;
        int a = 25,b = 34,c=45;
        double e= Math.E, pi=Math.PI, random=(Math.random()*250);
        String stringExample= "new String";
        String stringExampleSecond= new String(" Second String ") ;


        System.out.println("byte: "+primitiveOne);
        System.out.println("short: "+primitiveTwo);
        System.out.println("long: "+primitiveThree);
        System.out.println("float: "+primitiveFour);
        System.out.println("char: "+primitiveFive);
        System.out.println("boolean: "+primitiveSix);
        System.out.println("int: "+a+" "+b+" "+c);
        System.out.println("double: "+e+" "+pi+" "+random);
        System.out.println("string Example: "+stringExample);
        System.out.println("string Example Second: "+stringExampleSecond);
        System.out.println();

        //3.
        short resultOne= (short) (primitiveOne+primitiveTwo);
        long resultTwo= primitiveOne*primitiveTwo;
        long resultThree= primitiveThree/primitiveTwo;
        long resultFour= primitiveThree%primitiveTwo;
        short resultFive = (short) (128-primitiveOne);
        double resultSix = primitiveFour+e-pi;
        double resultSeven = Math.log10(primitiveFour-pi);
        double resultEight = pi*e;
        double resultNine = random%pi;
        double resultTen= Math.sqrt(e + pi);

        System.out.println("result one: "+resultOne);
        System.out.println("result two: "+resultTwo);
        System.out.println("result three: "+resultThree);
        System.out.println("result four: "+resultFour);
        System.out.println("result five: "+resultFive);
        System.out.println("result six: "+resultSix);
        System.out.println("result seven: "+resultSeven);
        System.out.println("result eight: "+resultEight);
        System.out.println("result nine: "+resultNine);
        System.out.println("result ten: "+resultTen);
        System.out.println();
        //4.
        resultOne+=61;
        resultTwo*=-5;
        resultThree %=28077788;
        resultFour-= 22060;
        resultFive /= 5;
        resultSix += resultOne;
        resultSeven -= resultTwo;
        resultEight *= resultThree;
        resultNine /= resultFour;
        resultTen%= resultFive;
        System.out.println("result one: "+resultOne);
        System.out.println("result two: "+resultTwo);
        System.out.println("result three: "+resultThree);
        System.out.println("result four: "+resultFour);
        System.out.println("result five: "+resultFive);
        System.out.println("result six: "+resultSix);
        System.out.println("result seven: "+resultSeven);
        System.out.println("result eight: "+resultEight);
        System.out.println("result nine: "+resultNine);
        System.out.println("result ten: "+resultTen);
        System.out.println();
        //5.
        boolean booleanTrueOne= resultOne==32700;
        boolean booleanTrueTwo= resultTwo<=20806410;
        boolean booleanTrueThree= resultThree>0;
        boolean booleanFalseOne= resultFour<10;
        boolean booleanFalseTwo= resultFive>=52;
        boolean booleanFalseThree= resultSix!=resultSix+1;

        System.out.println("boolean result one: "+booleanTrueOne);
        System.out.println("boolean result two: "+booleanTrueTwo);
        System.out.println("boolean result three: "+booleanTrueThree);
        System.out.println("boolean result four: "+booleanFalseOne);
        System.out.println("boolean result five: "+booleanFalseTwo);
        System.out.println("boolean result six: "+booleanFalseThree);
        System.out.println();
        //6.
        int exercice =1;
        System.out.println(+exercice);
        exercice=--exercice;
        System.out.println(exercice);
        exercice=++exercice;
        System.out.println(exercice);
        exercice=exercice++;
        System.out.println(exercice);
        exercice=exercice--;
        System.out.println(exercice);
        exercice=++exercice;
        System.out.println(exercice);
        exercice=--exercice;
        System.out.println(exercice);
        exercice=exercice++;
        System.out.println(exercice);
        System.out.println();
        //7.
        double array10[]={resultOne, resultTwo, resultThree, resultFour, resultFive, resultSix, resultSeven,
        resultEight, resultNine, resultTen};

        System.out.println(Arrays.toString(array10));

    }
}
