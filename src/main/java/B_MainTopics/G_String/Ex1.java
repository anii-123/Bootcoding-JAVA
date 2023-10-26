package B_MainTopics.G_String;

public class Ex1 {
    public static void main(String[] args) {
        String s= "Bootcoding";
        String s1= new String("Boot coding");
        boolean v=s.equals(s1);
        System.out.println(v);

        String w= s.concat(s1);
        System.out.println(w);
    }
}
