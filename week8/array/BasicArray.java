package week8.array;
public class BasicArray
{

{
    final int LIMIT = 15, MULTIPLE = 10;

    int[] list = new int[LIMIT];

    //  Initialize the array values
    for (int index = 0; index < LIMIT; index++)
        list[index] = index * MULTIPLE;

    list[5] = 999;  // change one array value

    //  Print the array values
    for (int value : list)
        System.out.print(value + "  ");
}
}