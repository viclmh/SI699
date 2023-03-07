package com.umsi.backend.controller;

//import com.laioffer.staybooking.model.Stay;
//import com.laioffer.staybooking.model.User;
//import org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException;
//import org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException;
import com.umsi.backend.service.ClassifyImageService4j;
import org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException;
import org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException;
import org.springframework.web.bind.annotation.*;
//import com.laioffer.staybooking.service.StayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
//import com.umsi.backend.service.ClassifyImageService;
//import com.laioffer.staybooking.service.ReservationService;


import java.io.IOException;
import java.security.Principal;
import java.util.List;

import java.util.List;
@RestController
public class ImageController {
//    private ClassifyImageService imageService;
    private ClassifyImageService4j imageService4j;

    @Autowired
    public ImageController(ClassifyImageService4j imageService4j) {
//        this.imageService = imageService;
        this.imageService4j = imageService4j;
    }

    @PostMapping("/image")
    public int classifyImage(@RequestParam("base64") String base64) throws IOException, UnsupportedKerasConfigurationException, InvalidKerasConfigurationException {

//        imageService.classify(base64);

        imageService4j.classify(base64);

        return 111;
    }



}
