package cainiao_lean.基本数据类型;

public class array {

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    };

    public static void main(String[] args) {
        double[] a = {1.2,2.2,3.0,2.4,112.2};
//        System.out.println(a);
//        System.out.println("数组为：", a);
        // for each 循环
        System.out.println("for each 循环:");
        for (double each_a: a){
            System.out.println(each_a);
        }
        //下标循环
        System.out.println("下标循环:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        array my_arr = new array();
        int[] c = {1,2,3};
        int[] b = my_arr.reverse(c);
        for (int d:
                b) {
            System.out.println(d);
        }
    }
}
