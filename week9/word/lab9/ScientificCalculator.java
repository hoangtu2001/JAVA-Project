package week9.word.lab9;

import java.util.Scanner;

public class ScientificCalculator extends Calculator {
    public  final Scanner scan = new Scanner(System.in); 
    public final boolean isScientificCal  = true; 
    
    public ScientificCalculator (int num1, int num2)
    {
    	super(num1, num2);
    }
    public double Pow() {
    	return Math.pow(super.Get_Input1(), super.Get_Input2());
    }
    public double input1_logarit(){
    	return Math.log(super.Get_Input1());
    }
    public double input1_Sqrt() {
    	return Math.sqrt(super.Get_Input1());
    }
    public double input1_Abs() {
    	return Math.abs(super.Get_Input1());
    }
   
}

