package code;

public class StaticDemo1 {
    //静态代码块，属于类，优先加载一次，自动触发执行
    //作用，可以初始化静态资源
    public static String name;
    static {
        System.out.println("=====静态代码块被触发执行=====");
        name = "张三";
    }

    public static void main(String[] args) {
        System.out.println("====main方法被执行=====");
    }
}
