//**
//  RollingDice.java       Author: Lewis/Loftus
//
//  Demonstrates the creation and use of a user-defined class.
//**
package week4.dice;
public class Rollingdice
{
    //-----------------------------------------------------------------
    //  Creates two Die objects and rolls them several times.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        die die1, die2, die0, die3, die4, die5;
        int sum;

        die0 = new die();
        die1 = new die();
        die2 = new die();
        die3 = new die();
        die4 = new die();
        die5 = new die();

        die0.roll();
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);

        die1.roll();
        die2.setFaceValue(4);
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);

        sum = die1.getFaceValue() + die2.getFaceValue();
        System.out.println("Sum: " + sum);

        sum = die1.roll() + die2.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);
        System.out.println("New sum: " + sum);
    }
}