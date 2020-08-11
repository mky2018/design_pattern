package com.mky.design.pattern.creational.simplefactory;


import cn.hutool.Hutool;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.digest.MD5;

/**
 * @author makaiyu
 * @date 2020-05-04 13:26
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(null == video){
            return;
        }
        video.produce();

        MD5 md5 = SecureUtil.md5();

    }

}
