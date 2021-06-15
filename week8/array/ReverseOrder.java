package week8.array;
import java.util.Scanner;

public class ReverseOrder
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.println("The size of the array: " + numbers.length);

        for (int index = 0; index < numbers.length; index++)
        {
            System.out.print("Enter number " + (index+1) + ": ");
            numbers[index] = scan.nextDouble();
        }
        scan.close();
        System.out.println("The numbers in reverse order:");

        for (int index = numbers.length-1; index >= 0; index--)
            System.out.print(numbers[index] + "  ");
    }
}