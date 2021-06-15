package week9.word.lab9;

import java.util.Scanner;

public class Calculator {
    public  final Scanner scan = new Scanner(System.in); // Anywhere in class
    private int input1;
    private int input2;
    
    public Calculator(int num1, int num2)
    {
    	input1 = num1;
    	input2 = num2;
    }

    public void Set_Input1(int num1) {
        input1 = num1;

        return;
    }

    public void Set_Input2(int num2) {
        input2 = num2;

        return;
    }

    public int Get_Input1() {
        return input1;
    }

    public int Get_Input2() {
        return input2;
    }

    public void Scan_Input1() {
        System.out.printf("Enter left-hand value: ");
        int num1 = scan.nextInt();
        System.out.println("Input1's value: " + num1 + "\n");
        Set_Input1(num1);

        return;
    }

    public void Scan_Input2() {
        System.out.printf("Enter right-hand value: ");
        int num2 = scan.nextInt();
        System.out.println("Input2's value: " + num2 + "\n");
        Set_Input2(num2);

        return;
    }

    public int Addition() {//       
    	return (Get_Input1() + Get_Input2());
    }

    public int Subtraction() {
        return (input1 - input2);
    }

    public float Division() {
    	return (float)input1/(float)input2;
    }

    public int Multiplication() {
        return (input1 * input2);
    }

    public int Remainder() {
        return (input1 % input2);
    }

    public void main(String[] args) {
        System.out.println("Calculator is running...");
        Scan_Input1();
        Scan_Input2();

        System.out.println(input1 + " + " + input2 + " = " + Addition());
        System.out.println(input1 + " - " + input2 + " = " + Subtraction());
        System.out.println(input1 + " / " + input2 + " = " + String.format("%2f",Division()));
        System.out.println(input1 + " * " + input2 + " = " + Multiplication());
        System.out.println(input1 + " % " + input2 + " = " + Remainder());
    }
}
