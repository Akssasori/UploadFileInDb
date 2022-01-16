package com.example.app.service;

import com.example.app.model.Document;
import com.example.app.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    DocumentRepository documentRepository;

    @Override
    public String saveUploadFile(MultipartFile file) {

        String docId = null;

        if (!file.isEmpty()) {
            Document document = new Document();
            document.setDocumentName(file.getOriginalFilename());
            document.setDocumentType(file.getContentType());

            try {
                document.setFile(file.getBytes());
            } catch (Exception e) {
                e.printStackTrace();
            }
            Document doc = documentRepository.save(document);
            docId = doc.getDocumentId();
        }
        return docId;
    }
}
