package code;

        import org.w3c.dom.ls.LSOutput;

public class Test2 {
    public static void main(String[] args) {
        //满汉单例
        singleinstance2 s1 = singleinstance2.getInstance();
        singleinstance2 s2 = singleinstance2.getInstance();
        System.out.println(s1 == s2);//true

    }
}