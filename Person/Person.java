/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person  
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int speed;
    private String name;
    private boolean canTalk;
    // private GreenfootSound sound;

    /**
     * Constructor for objects of class Person
     */
    public Person()
    {
        x = 10;
        y = 10;
        speed = 10;
        name = "Aiden";
        canTalk = true;
    }
    
    public Person(String namePerson)
    {
        x = 10;
        y = 10;
        speed = 10;
        name = namePerson;
        canTalk = true;
    }
    
    public Person(String namePerson, int sp)
    {
        x = 10;
        y = 10;
        speed = sp;
        name = namePerson;
        canTalk = true;
    }
    
    public String toString()
    {
        String res = "Person name: "+name+"\n Position (x,y): "+x+","+y+"\n Speed: "+speed;
        return res;
    }
    
    public void walk(){
        x+=1;
    }
    
    public static void main(String[] args)
    {
        Person p1 = new Person();
        Person p2 = new Person("Adan");
        Person p3 = new Person("Adin",5);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
