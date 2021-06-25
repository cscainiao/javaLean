package cainiao_lean.对象和类;

public class Puppy{
    int puppyAge;
    public Puppy(String name){
        //构造方法
        System.out.println("name is " + name);
    }

    public void setAge(int age){
        puppyAge = age;

    }
    public int getAge(){
        System.out.println("dog's age is " + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args){
        // 实例化类
        int age, age1;
        Puppy puppy = new Puppy("小花");
        puppy.setAge(23);
        age = puppy.getAge();
        age1 = age + 10;
        System.out.println("age1 is " + age1);
    }
}
