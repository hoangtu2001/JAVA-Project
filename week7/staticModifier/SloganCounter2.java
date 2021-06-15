package week7.staticModifier;//**
//  SloganCounter.java       Author: Lewis/Loftus
//
//  Demonstrates the use of the static modifier.
//**

public class SloganCounter2
{
    //-----------------------------------------------------------------
    //  Creates several Slogan objects and prints the number of
    //  objects that were created.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        //Slogan obj;

        Slogan obj1 = new Slogan("Remember the Alamo.");
        System.out.println(obj1);

        Slogan obj2 = new Slogan("Don't Worry. Be Happy.");
        System.out.println(obj2);

        Slogan obj3 = new Slogan("Live Free or Die.");
        System.out.println(obj3);

        Slogan obj4 = new Slogan("Talk is Cheap.");
        System.out.println(obj4);

        Slogan obj5 = new Slogan("Write Once, Run Anywhere.");
        System.out.println(obj5);

        System.out.println();
        System.out.println("Slogans created: " + Slogan.getCount());
    }
}