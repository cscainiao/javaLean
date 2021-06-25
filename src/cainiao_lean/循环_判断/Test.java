package cainiao_lean.循环_判断;

public class Test {
    private static int A = 1;

    public static void setA(int a) {
        A = a;
    }

    public static int getA() {
        return A;
    }

    public static void main(String[] args) {
//        int [] set;
        for (int i = 0; i < 21; i++) {
            if (i==18) {
                break;
            }
            if (i == 15) {
                continue;
            }
            System.out.println(i);
        }

        int [] arr = {1, 2,3,4,5};
        for (int a:
             arr) {
            if (a<=3) {
                System.out.println("小于3的数为：" + a);
            }else {
                System.out.println("大于3的数为：" + a);
            }

        }

    }

}
