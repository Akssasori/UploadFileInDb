package com.example.app.service;

import org.springframework.web.multipart.MultipartFile;

public interface DocumentService {

    String saveUploadFile(MultipartFile file);
}
