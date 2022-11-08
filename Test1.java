package code;

public class Test1 {
    public static void main(String[] args) {
        singleinstance s1 = singleinstance.instance;
        singleinstance s2= singleinstance.instance;
        System.out.println(s1 == s2);//true
    }
}
