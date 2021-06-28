package cainiao_lean.dateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String args[]) {
        // 初始化 Date 对象
        Date date = new Date();

        // 使用 toString() 函数显示日期时间 "Mon Jun 28 11:39:54 CST 2021"
        System.out.println(date.toString());
        try {
            //格式化日期    2021-06-28 11:42:14                    优先使用这种方式
            Date dNow = new Date( );
            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            System.out.println("当前时间为: " + ft.format(dNow));

            // 休眠函数, 必须放在try catch里面
            Thread.sleep(1000*2);
            Date time_now = new Date();
            System.out.println("休眠2s后时间为 " + ft.format(time_now));

        } catch (Exception e) {
            System.out.printf("系统异常 %s", e);
        }


    }
}
