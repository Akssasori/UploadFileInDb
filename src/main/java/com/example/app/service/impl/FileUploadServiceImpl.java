package com.example.app.service.impl;

import com.example.app.model.UploadedFile;
import com.example.app.repository.FileUploadRepository;
import com.example.app.service.inter.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Objects;

@Service
public class FileUploadServiceImpl implements FileUploadService {

    public static final String CSV = "text/csv";

    @Autowired
    private FileUploadRepository fileUploadRepository;

    @Override
    public void uploadToDb(MultipartFile file) {

        UploadedFile uploadedFile = new UploadedFile();

        try {

            if (CSV.equals(file.getContentType())) {

                uploadedFile.setFileData(file.getBytes());
                uploadedFile.setFileType(file.getContentType());
                uploadedFile.setFileName(file.getOriginalFilename());
                fileUploadRepository.save(uploadedFile);

            } else {

                System.out.println("E um csv");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
