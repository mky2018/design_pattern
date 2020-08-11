package com.mky.design.chain.responsibility.notpure;

/**
 * @author makaiyu
 * @date 2020-08-11 13:59
 * 此示例为不纯的责任链模式 也就是允许某个请求被一个具体处理者部分处理后再向下传递
 * 或者一个具体处理者处理完某请求后其后继处理者可以继续处理该请求
 * 而且一个请求可以最终不被任何处理者对象所接收
 * <p>
 * 多用在过滤器链中 SpringSecurity、Netty、SpringAOP、Tomcat等
 * <p>
 * 纯的责任链：
 * 一个具体处理者对象只能在两个行为中选择一个：要么承担全部责任，要么将责任推给下家，
 * 不允许出现某一个具体处理者对象在承担了一部分或全部责任后 又将责任向下传递的情况；
 * 一个请求必须被某一个处理者对象所接收，不能出现某个请求未被任何一个处理者对象处理的情况
 */
public class Client {

    public static void main(String[] args) {

        BaseHandler zhangsan = new Director("张三");
        BaseHandler lisi = new Manager("李四");
        BaseHandler wangwu = new TopManager("王五");

        // 创建责任链
        zhangsan.setNextBaseHandler(lisi);
        lisi.setNextBaseHandler(wangwu);

        // 发起请假申请
        boolean result1 = zhangsan.process(new LeaveRequest("小旋锋", 1));
        System.out.println("最终结果：" + result1 + "\n");

        boolean result2 = zhangsan.process(new LeaveRequest("小旋锋", 4));
        System.out.println("最终结果：" + result2 + "\n");

        boolean result3 = zhangsan.process(new LeaveRequest("小旋锋", 8));
        System.out.println("最终结果：" + result3 + "\n");
    }
}

