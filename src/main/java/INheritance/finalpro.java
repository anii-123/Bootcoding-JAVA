package INheritance;

public class finalpro {

    public static void main(String[] args) {
        F b1=new F();
    }
}

//We can't inherit the final class
/*final*/class E{
    //Final method can't be overriden
    /*final*/void show(){
        System.out.println("I am in A");
    }
}
class F extends E{
    void show(){
        System.out.println("I am in B");
    }
}



