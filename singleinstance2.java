package code;

public class singleinstance2 {
    //2.定义一个静态成员变量存储对象
    //私有化防止外部测试出错，
    private   static  singleinstance2 instance;

    //3.提供一个方法，对外返回单例对象
    public static singleinstance2 getInstance(){
        if(instance == null){
            //第一次拿对象创造对象
            instance = new singleinstance2();

        }
        return  instance;
    }
    //1.私有构造器
    private singleinstance2(){

    }
}
