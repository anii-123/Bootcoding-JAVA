package B_MainTopics.Z_COLLEGE;

public class Animal {
    String color;
    int age;
    void initObj(String c,int a)
    {
        color = c;
        age =a;
    }
    void display()
    {
        System.out.println (color + "  " +age );
    }
    public static void main(String [] args)
    {
        Animal bruno = new Animal ();
        bruno.initObj("Black", 8);
        bruno.display();
    }
}
