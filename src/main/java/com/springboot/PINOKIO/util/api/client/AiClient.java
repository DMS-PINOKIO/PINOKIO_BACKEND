package com.springboot.PINOKIO.util.api.client;

import com.springboot.PINOKIO.config.FeignSupportConfig;
import com.springboot.PINOKIO.dto.BrailleResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(name = "aiClient", url = "http://18.116.164.96:5000", configuration = FeignSupportConfig.class)
public interface AiClient {

    @GetMapping(value = "/ocr", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    BrailleResponse brailleUpload(@RequestPart(value = "file") MultipartFile file);
}
