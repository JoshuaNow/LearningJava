package com.company;

public class Main {

    public static void main(String[] args) {
        // these are all primitive date types
        int myValue = 10000;
        //this is how you can determine the range of the code

        int myMinIntValue = Integer.MIN_VALUE; // int is a 32 bit
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue); // -2147483647 min number
        System.out.println("Integer Minimum Value = " + myMaxIntValue); // 2147483647 max number
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1)); // this is calle an over flow
        System.out.println("Busted min value = " + (myMinIntValue + -1)); // this is underflow

        int myMaxIntTest = 2_147_483_647; // this is like using commas, we can do this but it isn't common

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue); // -128
        System.out.println("Byte Minimum Value = " + myMaxByteValue); //  127 it occupies 8 bites

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue); // -32768 // 16 bits
        System.out.println("Short Minimum Value = " + myMaxShortValue); //  32767

        long myLongValue = 100L; // we have to use L at the end of the number to convert it to a long
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue); // -9223372036854775808 64bit
        System.out.println("Long Minimum Value = " + myMaxLongValue); // 9223372036854775807 64bit
//        long bigLongLiteralValue = 2147483111; // but if add and L we will not have and error anymore.


        short bigShortLiteralValue = 32767;

        int myTotal = ( myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2); // casting means to treat or convert a number form one type to another
        System.out.println(myNewByteValue);

        short myNewShortValue = (short) (myMinShortValue / 2);

        System.out.println(myNewShortValue);
        

    }
}
