package cainiao_lean.基本数据类型;

// StringBuilder、StringBuffer类用于创建可修改的字符创， 不可修改的使用String创建
// StringBuilder速度高，不是线程安全， StringBuffer相对于StringBuilder速度慢，但是是线程安全
public class StringBuffer {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder(20);
        a.append("nihao");
        a.insert(5,"，");
        a.append("中国！");
        a.delete(0,1);
        System.out.println(a);
    }
}
