# Java-static
 static应用知识：代码块
## 4 static应用知识：代码块

### 4.1 代码块的分类、作用

代码块概述
代码块是类的5大成分之一（成员变量、构造器，方法，代码块，内部类），定义在类中方法外。
在Java类下，使用 { } 括起来的代码被称为代码块 。

### 4.2 代码块分为

静态代码块: 
格式：static{}
特点：需要通过static关键字修饰，随着类的加载而加载，并且自动触发、只执行一次 优先加载
使用场景：在类加载的时候做一些静态数据初始化的操作，以便后续使用。

```java
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
```

 构造代码块（了解，见的少）：
格式：{}
特点：每次创建对象，调用构造器执行时，都会执行该代码块中的代码，并且在构造器执行前执行
使用场景：初始化实例资源。

```java
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
```

### 4.3 静态代码块的应用案例

斗地主

需求：在启动游戏房间的时候，应该提前准备好54张牌，后续才可以直接使用这些牌数据。

```java
package code;

import java.util.ArrayList;

public class StaticDemo3 {
    //private本类访问 public 全部访问 公开
   public static  ArrayList<String> cards = new ArrayList<>();
   static {
       //正式做牌
       //定义一个数组存储全部参数
       String[] sizes = {"3","4","5","6","7","8","9","J","Q","K","A","2"};
       //花色
       String[] colors = {"♥","♠","♦","♣"};
       //遍历点数
       for (int i = 0; i <sizes.length ; i++) {
           //遍历花色
           for (int j = 0; j < colors.length; j++) {
               String card = sizes[i] + colors[j];
               cards.add(card);
           }
       }
       //加入大小王
       cards.add("小🃏");
       cards.add("大🃏");
   }
    public static void main(String[] args) {
        //模拟初始化54张牌
        System.out.println("新牌：" + cards);
    }
}
```

### 4.4 静态代码块的作用是什么?

如果要在启动系统时对静态资源进行初始化，则建议使用静态代码块完成数据的初始化操作。

# 5 static应用知识：单例设计模式

设计模式、单例模式介绍、



### 5.1 饿汉单例设计模式

在用类获取对象的时候，对象已经提前为你创建好了。

设计步骤：
定义一个类，把构造器私有。
定义一个静态变量存储一个对象。

```java
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
```

```java
package code;

public class Test1 {
    public static void main(String[] args) {
        singleinstance s1 = singleinstance.instance;
        singleinstance s2= singleinstance.instance;
        System.out.println(s1 == s2);//true
    }
}
```

### 5.2 饿汉单例的实现步骤?

定义一个类，把构造器私有。
定义一个静态变量存储一个对象

###  5.3 懒汉单例模式

在真正需要该对象的时候，才去创建一个对象(延迟加载对象)。

设计步骤：
定义一个类，把构造器私有。
定义一个静态变量存储一个对象。
提供一个返回单例对象的方法

```java
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
```

```java
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
```

### 5.4 懒汉单例的实现步骤?

定义一个类，把构造器私有。
定义一个静态变量存储一个对象。
提供一个返回单例对象的方法
