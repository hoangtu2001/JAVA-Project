package week11.lab11;

import java.util.Scanner;

public class Calculator {
	public final Scanner scan = new Scanner(System.in); // Anywhere in class
	private int input1;
	private int input2;
    
	public Calculator()
	{
   	 this.input1 = 0;
   	 this.input2 = 0;
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

	public void Scan_Input1() throws ExceptionMessage {
    	System.out.printf("Enter input 1 : ");
    	int num1 = scan.nextInt();
    	System.out.println("Input 1: " + num1 + "\n");
    	Set_Input1(num1);
    	if ((num1 > 51) || (num1 < 1)) {
   		 ExceptionMessage exception = new ExceptionMessage("Input 1 is out of range from 1 to 50");
   		 throw (exception);
    	}

    	return;
	}

	public void Scan_Input2() throws ExceptionMessage {
    	System.out.printf("Enter input 2: ");
    	int num2 = scan.nextInt();
    	System.out.println("Input 2: " + num2 + "\n");
    	Set_Input2(num2);
    	if (num2 == 0) {
     		 ExceptionMessage exception = new ExceptionMessage("Cannot divide by 0");
     		 throw (exception);
    	}
    	else if (num2 % 2 == 0) {
   		 ExceptionMessage exception = new ExceptionMessage("Input 2 is not odd");
   		 throw (exception);
    	}
    	return;
	}

	public int Addition() {  	 
   	 return (input1+ input2);
	}

	public int Subtraction() {
    	return (input1 - input2);
	}
	public double Division() throws ExceptionMessage{
   	 if (input2 == 0) {
   		 ExceptionMessage exception = new ExceptionMessage("Cannot divide by 0");
   		 throw (exception);
   	 } else {
   		 return (input1 / input2);
   	 	}
	}
	public int Multiplication() {
    	return (input1 * input2);
	}

	public int Remainder() {
    	return (input1 % input2);
	}

	public static void main(String[] args) throws ExceptionMessage{
    	System.out.println("Calculator is running...");
    	Calculator calc = new Calculator();
   	 
    	calc.Scan_Input1();	 
    	calc.Scan_Input2();

    	System.out.println(calc.Get_Input1() + " + " + calc.Get_Input2()+ " = " + calc.Addition());
    	System.out.println(calc.Get_Input1() + " - " + calc.Get_Input2() + " = " + calc.Subtraction());
    	System.out.println(calc.Get_Input1() + " / " + calc.Get_Input2() + " = " + calc.Division());
    	System.out.println(calc.Get_Input1() + " * " + calc.Get_Input2() + " = " + calc.Multiplication());
    	System.out.println(calc.Get_Input1() + " % " + calc.Get_Input2() + " = " + calc.Remainder());
	}
}
