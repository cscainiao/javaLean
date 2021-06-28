package cainiao_lean.基本数据类型;

public class String {

    public static void main(java.lang.String[] args) {
        java.lang.String a = " 1231212adasadDDDWEWE ";
        System.out.println(a.isEmpty());
        System.out.println(a.length());
        System.out.println(a.toUpperCase());
        System.out.println(a.trim());
        java.lang.String b = "asdeqe%s, %s";
        System.out.println(java.lang.String.format(b, "23", "qwe"));
        System.out.printf(b, "占位1", "占位2");

    }
}
