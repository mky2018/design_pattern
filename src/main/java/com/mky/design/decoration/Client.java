package com.mky.design.decoration;

/**
 * @author makaiyu
 * @date 2020-06-12 09:58
 */
public class Client {

    public static void main(String[] args) {
        // 测试单纯的食物
        Food f1 = new Chicken();
        System.out.println(f1.getDesc());

        Duck duck = new Duck();

        System.out.println("----------------------");
        // 测试单重修饰的食物
        RoastFood rf = new RoastFood(duck);
        System.out.println(rf.getDesc());

        System.out.println("----------------------");
        // 测试多重修饰的食物
        SteamedFood sf = new SteamedFood(rf);
        System.out.println(sf.getDesc());
    }

}
