package com.ai.design.pattern.creational.factorymethod;

public abstract class VideoFactory {

//    public Video getVideo(String type) {
//        if ("java".equalsIgnoreCase(type)) {
//            return new JavaVideo();
//        } else {
//            return new PythonVideo();
//        }
//    }

//    public Video getVideo(Class c){
//        Video video = null;
//
//        try {
//            video = (Video) Class.forName(c.getName()).newInstance();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        return video;
//    }

    public abstract Video getVideo();
}
