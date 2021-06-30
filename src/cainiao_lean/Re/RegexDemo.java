package cainiao_lean.Re;
import java.util.regex.*;

public class RegexDemo {
    public static void main(String[] args) {
        String content = "this is regex test";
        String pattern = ".*re.*?ex.*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("是否匹配上:" + isMatch);

        String line = "This order was placed for QT3000! OK?";
        String pattern2 = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern2);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        } else {
            System.out.println("NO MATCH");
        }
    }
}
