package com.company;

public class Main {

    public static void main(String[] args) {
	// Your challenge is to create a byte variable and set it to any valid  byte number, it doesn't matter.
        // crate a short variable adn set it to any valid short number.
        // create an int variable and set it to any valid short number.

        // create and int varaibale and set it to any valid int number . Lastly , create a variable of type long
        // and make it equal to 50000 plus 10 times the sum of the byte plus the short plus the integer values.

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
