package com.example.app.controller;


import com.example.app.service.inter.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("api/v1")
public class FileUploadController {

    @Autowired
    private FileUploadService fileUploadService;


    @PostMapping("/upload/db")
    public void uploadDb(@RequestParam("file")MultipartFile multipartFile) {

        fileUploadService.uploadToDb(multipartFile);

    }
}
