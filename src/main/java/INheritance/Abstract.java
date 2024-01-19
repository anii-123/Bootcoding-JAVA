package INheritance;

public class Abstract {
    public static void main(String[] args) {
        // A a1= new A();
        I a1;
        J b1=new J();
        b1.showA();
    }
}


// We can't create the object object of Abstract class but we can declare the object of abstract class
abstract class I{
    void showA(){
        System.out.println("I am in A");
    }
}
//if we want to call the method present in abstract class we have to create another class and the inherit them
//  then call the mmethod of abstract class by using the object of child class
class J extends I{
}



