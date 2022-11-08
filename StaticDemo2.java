package code;

public class StaticDemo2 {
    public String name;
    public StaticDemo2(){
        System.out.println("无参构造器被触发执行");
    }
    //实例代码块,无static修饰，属于对象，每次构造对象时都会被触发执行
    {
        name = "张三";
        System.out.println("====实例代码块被执行======");
    }
    public static void main(String[] args) {
        StaticDemo2 s1 = new StaticDemo2();
        System.out.println(s1.name);
        StaticDemo2 s2= new StaticDemo2();
        System.out.println(s2.name);


    }
}
