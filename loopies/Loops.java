/**
 * Write a description of class Loops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Loops  
{
    public static void forLoop(int start, int stop, int increase)
    {
        for (int i=start;i<stop;i=i+increase)
        {
            System.out.print(i+" ");
        }
    }
    
    public static void whileLoop(int input)
    {
        int total=0, number=0;
        while(input>1)
        {
            total = total + input%10;
            input = input/10;
            number = number + 1;
        }
        System.out.println(number+" digits totaling "+total);
    }
    
    public static void addHyphen(String uno)
    {
        System.out.println(uno);
        String newString = uno.toUpperCase();
        System.out.println(newString);
        String hyphenString = newString.replace(" ","-");
        System.out.println(hyphenString);
    }

    public static void main(String[] args)
    {
        forLoop(2, 90, 5);
        forLoop(-10, 8, 2);
        forLoop(100, 150, 5);
    }
}
