package com.example.app.service.inter;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {


    public void uploadToDb(MultipartFile file);
}
