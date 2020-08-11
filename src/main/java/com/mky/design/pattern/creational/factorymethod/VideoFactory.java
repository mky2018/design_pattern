package com.mky.design.pattern.creational.factorymethod;

/**
 * @author makaiyu
 * @date 2020-05-04 13:27
 */
public abstract class VideoFactory {

    public abstract Video getVideo();

//    public Video getVideo(Class c) {
//        Video video = null;
//        try {
//            video = (Video) Class.forName(c.getName()).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return video;
//    }
//
//    public Video getVideo(String type) {
//        if ("java".equals(type)) {
//            return new JavaVideo();
//        }
//
//        if ("python".equals(type)) {
//            return new JavaVideo();
//        }
//
//        return null;
//
//    }

}
