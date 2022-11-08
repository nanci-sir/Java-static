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
