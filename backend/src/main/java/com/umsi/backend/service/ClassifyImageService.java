//package com.umsi.backend.service;
//
//
//import org.opencv.core.Core;
//import org.opencv.core.Mat;
//import org.opencv.core.MatOfByte;
//import org.opencv.core.Size;
//import org.opencv.imgcodecs.Imgcodecs;
//import org.opencv.imgproc.Imgproc;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
////import org.opencv.core.MatOfByte;
////import org.opencv.core.Core;
////import org.opencv.core.Mat;
////import org.opencv.core.Size;
////import org.opencv.imgcodecs.Imgcodecs;
////import org.opencv.imgproc.Imgproc;
//
//import java.io.IOException;
//import java.util.Base64;
//
//
////import org.tensorflow.SavedModelBundle;
////import org.tensorflow.Session;
////import org.tensorflow.Tensor;
//
//@Service
//public class ClassifyImageService {
//    @Autowired
//    public ClassifyImageService() {
//    }
//
//    public void classify(String images) {
//
//        System.out.println("Received image!");
//        System.out.println(images);
//
//        String encodedImg = images.split(",")[1];
//
//        System.out.println(encodedImg);
//
//        byte[] img = Base64.getDecoder().decode(encodedImg);
//
//        Mat mat = Imgcodecs.imdecode(new MatOfByte(img), Imgcodecs.IMREAD_UNCHANGED);
//
////        String image_location = "/Users/vic/Desktop/SI699/ML/AffectNet-8Labels/val_set/images/1.jpg";
////        Mat src = Imgcodecs.imread(image_location);
//
//
//        // Scaling the Image using Resize function
//        Mat dst = new Mat();
//
//        Imgproc.resize(mat, dst, new Size(224, 224), 0,0, Imgproc.INTER_AREA);
////
//        Imgcodecs.imwrite("/Users/vic/Desktop/SI699/test.jpg", dst);
//
//        System.out.println("Image Processed");
//
//        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
//        System.out.println(System.getProperty("java.library.path"));
//
////        try (SavedModelBundle b = SavedModelBundle.load("test_model.h5", "serve")) {
////            Session s = b.session();
////        }
////        SavedModelBundle model = SavedModelBundle.load("test_model.h5", "serve");
//
////        loadModels();
//
//    }
//
////    public void loadModels() throws IOException, UnsupportedKerasConfigurationException, InvalidKerasConfigurationException {
////        // load machine learning model
////        String simpleMlp = new ClassPathResource(
////                "test_model.h5").getFile().getPath();
////
//////        String mlp = "/Users/vic/Desktop/SI699/test_model.h5";
//////        ComputationGraph model = KerasModelImport.
//////                importKerasModelAndWeights(mlp);
////
////        MultiLayerNetwork model = KerasModelImport.importKerasSequentialModelAndWeights(simpleMlp);
////
////        // make a random sample
////        int inputs = 10;
////        INDArray features = Nd4j.zeros(inputs);
////
////    }
//}
