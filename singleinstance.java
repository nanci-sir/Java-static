package code;

        import javax.swing.*;

public class singleinstance {
    //使用饿汉单例
    //获取对象前已经准备好了
    //定义一个静态变量存储一个对象
    public static singleinstance instance =new singleinstance() ;

    //1.私有构造器
    private  singleinstance(){

    }
}
