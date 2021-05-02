package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        byte myByte = 50;
        short myShort = 1000;
        int myInt = 30000;

        long myLongTotal =  (50000L + 10L * (myByte + myShort + myInt )); // we don't have to cast here because longs
        // know that any of the other number data types will fit here.


        System.out.println(" Test test " + myLongTotal);

        short shortTotal = (short) (1000 + 10 + (myByte + myShort + myInt ));
        // for this one we have to cast because the short doesn't know if I can accept a number form int since it
        // maybe to large
    }
}
