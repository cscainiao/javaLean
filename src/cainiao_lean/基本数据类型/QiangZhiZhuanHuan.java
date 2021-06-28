package cainiao_lean.基本数据类型;

public class QiangZhiZhuanHuan {
    public static void main(String[] args){
        int i1 = 127;
        byte b = (byte) i1;
        float f = 0.11f;
        double d = 0.22112;
        System.out.println("int强制类型转换为byte后的值等于 " + b);
        // 两种字符占位符使用
        System.out.println(String.format("byte 最大值为%s， 最小值为： %s", Byte.MAX_VALUE, Byte.MIN_VALUE));
        System.out.printf("%f, %f", f ,d);
    }
}