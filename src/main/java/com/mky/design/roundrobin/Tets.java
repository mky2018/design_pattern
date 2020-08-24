package com.mky.design.roundrobin;

/**
 * @author makaiyu
 * @date 2020-08-24 10:55
 */
public class Tets {
    public static void main(String[] args) {
        /**
         * 假设有三个服务器权重配置如下：
         * server A  weight = 4 ;
         * server B  weight = 3 ;
         * server C  weight = 2 ;
         */
        Node serverA = new Node("serverA", 4);
        Node serverB = new Node("serverB", 3);
        Node serverC = new Node("serverC", 2);

        SmoothWeightedRoundRobin smoothWeightedRoundRobin = new SmoothWeightedRoundRobin(serverA, serverB, serverC);
        for (int i = 0; i < 7; i++) {
            Node i1 = smoothWeightedRoundRobin.select();
            System.out.println(i1.getServerName());
        }
    }

}
