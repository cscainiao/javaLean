package cainiao_lean.对象和类;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestClass {
    // 类变量
    static String NAME;
    static int AGE;
    // 构造方法, 同python init
    TestClass(String name, int age) {
        NAME = name;
        AGE = age;
    };

    public static void setAge(int age) {
        AGE = age;
    }
    //静态方式(类方法), 调用不需要实例化类
    //void关键字指明改方法不需要返回值, 如果是其他的关键字,比如int,则需要返回一个int型的结果
    //访问权限控制:
    //public（接口访问权限）： Java语言中访问限制最宽的修饰符，一般称之为“公共的”。被其修饰的类、属性以及方法不仅可以跨类访问，而且允许跨包（package）访问。
    //private（你无法访问）: Java语言中对访问权限限制的最窄的修饰符，一般称之为“私有的”。被其修饰的类、属性以及方法只能被该类的对象访问，其子类不能访问，更不能允许跨包访问。
    //protected（继承访问权限）: 介于public 和 private 之间的一种访问修饰符，一般称之为“保护形”。被其修饰的类、属性以及方法只能被类本身的方法及子类访问，即使子类在不同的包中也可以访问。
    //default（包访问权限）：即不加任何访问修饰符，通常称为“默认访问模式“。该模式下，只允许在同一个包中进行访问。
    public static void printInfo() {
        System.out.println("name is " + NAME);
        System.out.println("age is " + AGE);
    }
    public int max(int num1, int num2) {
        if ( num1> num2 ) {
            return num1;
        }else{
            return num2;
        }
    }

    // 方法重载, 根据传值的类型判断调用哪个方法
    public double max(double num1, double num2) {
        if ( num1> num2 ) {
            return num1;
        }else{
            return num2;
        }
    }

    // 不定参数, num为数组形式, 同python的*agrgs
    public void min(double... nums) {

        if (nums.length == 0) {
            System.out.println("无参数");
            return;
        }
        double return_num=nums[0];
        for (double each_num:
             nums) {
            if (each_num<return_num){
                return_num = each_num;
            }
        }
        System.out.println("数组为:" + Arrays.toString(nums) +" min num is: " + return_num);
    }

    // main 方法, 程序执行的方法
    public static void main(String[] args) {
        TestClass.printInfo();
        TestClass tc = new TestClass("张三", 23);
        tc.printInfo();
        tc.setAge(24);
        tc.printInfo();
        int num_test = tc.max(2,3);
        System.out.println(num_test);
        double num_test2 = tc.max(10.2, 10.3);
        System.out.println(num_test2);
        tc.min(1.1, 2.2, 3.1, 0.1);

    }
}
