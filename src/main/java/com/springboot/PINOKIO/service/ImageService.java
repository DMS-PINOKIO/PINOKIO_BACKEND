package com.springboot.PINOKIO.service;

import com.springboot.PINOKIO.dto.BrailleResponse;
import com.springboot.PINOKIO.dto.OcrResponse;
import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

    BrailleResponse brailleUpload(MultipartFile file);
    OcrResponse ocrUpload(MultipartFile file);
}
