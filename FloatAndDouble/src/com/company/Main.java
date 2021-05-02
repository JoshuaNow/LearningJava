package com.company;

public class Main {

    public static void main(String[] args) {
	// floating and double


    float myMinLFloatValue = Float.MIN_VALUE;
    float myMaxFloatValue = Float.MAX_VALUE;

    System.out.println("Float minimum value  " + myMinLFloatValue); // 1.4E-45
    System.out.println("Float Max value  " + myMaxFloatValue); // 3.4028235E38


    double myMinLDoubleValue = Double.MIN_VALUE;
    double myMaxDoubleValue = Double.MAX_VALUE;

    System.out.println("Double minimum value  " + myMinLDoubleValue); // 4.9E-324
    System.out.println("Double Max value  " + myMaxDoubleValue); //  1.7976931348623157E308

    int myIntValue = 5 / 3;
    float myFloatValue = 5f / 3f; // or we can do 5.25f
    double myDoubleValue = 5d / 3d; //double myDoubleValue = 5.00 / 3.00; //use double try not to use float anymore in Java
    System.out.println("MyIntValue " + myIntValue );
    System.out.println("MyFloatValue " + myFloatValue);
    System.out.println("MyDoubleValue " + myDoubleValue );
    // doubles are processed faster one modern computers this is a big reason why we need to use double and not float
    // double is also the default





    }
}
