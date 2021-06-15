package week4.dice;
public class die
{
    private final int MAX = 6;  // maximum face value

    private int faceValue;  // current value showing on the die
    public die()
    {
        faceValue = 1;
    }
    public int roll()
    {
        faceValue = (int)(Math.random() * MAX) + 1;
        return faceValue;
    }

    
    public void setFaceValue(int value)
    {
        faceValue = value;
    }
    public int getFaceValue()
    {
        return faceValue;
    }
    public  String toString()
    {
        String result = Integer.toString(faceValue);
        return result;
    }
}