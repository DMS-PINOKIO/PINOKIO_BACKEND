package com.springboot.PINOKIO.service;

import com.springboot.PINOKIO.dto.BrailleResponse;
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
        return this.aiClient.brailleUpload(file);
    }
}