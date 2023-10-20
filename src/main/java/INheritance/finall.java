package INheritance;

public class finall {
    public static void main(String[] args) {
        H b1=new H();
    }
}
class  G{
    void show(){
        System.out.println("I am in A");
    }
}
class H extends G{
    void show(){
        System.out.println("I am in B");

    }
}

