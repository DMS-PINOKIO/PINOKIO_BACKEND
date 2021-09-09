package com.springboot.PINOKIO.service;

import com.springboot.PINOKIO.dto.BrailleResponse;
import com.springboot.PINOKIO.dto.OcrResponse;
import com.springboot.PINOKIO.util.api.client.AiClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {

    private final AiClient aiClient;

    @Override
    public BrailleResponse brailleUpload(MultipartFile file) {
        System.out.println(file.toString());
        System.out.println(file.getContentType());
        System.out.println(file.getName());
        System.out.println(file.isEmpty());
        System.out.println(file.getSize());
        System.out.println(file.getOriginalFilename());
        return this.aiClient.brailleUpload(file);
    }

    @Override
    public OcrResponse ocrUpload(MultipartFile file) {
        System.out.println(file);
        return this.aiClient.ocrUpload(file);
    }
}
