package com.umsi.backend.service;

//import org.opencv.core.Core;
//import org.opencv.core.Mat;
//import org.opencv.core.MatOfByte;
//import org.opencv.core.Size;
//import org.opencv.imgcodecs.Imgcodecs;
//import org.opencv.imgproc.Imgproc;





//import org.opencv.core.Core;
//import org.opencv.core.Mat;
//import org.opencv.core.MatOfByte;
//import org.opencv.core.Size;
//import org.opencv.imgcodecs.Imgcodecs;
//import org.opencv.imgproc.Imgproc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Base64;

import org.deeplearning4j.nn.graph.ComputationGraph;
import org.deeplearning4j.nn.modelimport.keras.KerasModelImport;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException;
import org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import org.nd4j.common.io.ClassPathResource;


import java.io.IOException;


@Service
public class ClassifyImageService4j {
    @Autowired
    public ClassifyImageService4j() {
    }

    public void classify(String images) throws IOException, UnsupportedKerasConfigurationException, InvalidKerasConfigurationException {
//        System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
        System.out.println("Received image!");
        System.out.println(images);

        String encodedImg = images.split(",")[1];

        System.out.println(encodedImg);

        byte[] img = Base64.getDecoder().decode(encodedImg);

//        Mat mat = Imgcodecs.imdecode(new MatOfByte(img), Imgcodecs.IMREAD_UNCHANGED);
//
//        // Scaling the Image using Resize function
//        Mat dst = new Mat();
//
//        Imgproc.resize(mat, dst, new Size(224, 224), 0,0, Imgproc.INTER_AREA);
////
//        Imgcodecs.imwrite("/Users/vic/Desktop/SI699/test.jpg", dst);

        System.out.println("Image Processed");

//        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.out.println(System.getProperty("java.library.path"));


        loadModels();

    }

    public void loadModels() throws IOException, UnsupportedKerasConfigurationException, InvalidKerasConfigurationException {
        // load machine learning model
        String simpleMlp = new ClassPathResource(
                "test_model.h5").getFile().getPath();

//        String mlp = "/Users/vic/Desktop/SI699/test_model.h5";
//        ComputationGraph model = KerasModelImport.
//                importKerasModelAndWeights(mlp);

        MultiLayerNetwork model = KerasModelImport.importKerasSequentialModelAndWeights(simpleMlp);

        // make a random sample
        int inputs = 10;
        INDArray features = Nd4j.zeros(inputs);

    }
}