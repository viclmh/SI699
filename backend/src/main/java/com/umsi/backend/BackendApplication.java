package com.umsi.backend;

//import org.opencv.core.Core;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
//        OpenCV.loadShared();

//        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
//        System.loadLibrary("opt/homebrew/Cellar/opencv/4.7.0_1/share/java/opencv4/libopencv_java470.dylib");
        System.out.println(System.getProperty("java.library.path"));
//        System.load("/opt/homebrew/Cellar/opencv/4.7.0_1/share/java/opencv4/libopencv_java470.dylib");
//        System.load("libopencv_java470.dylib");


    }

}
