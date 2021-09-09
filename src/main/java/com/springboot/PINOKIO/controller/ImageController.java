package com.springboot.PINOKIO.controller;

import com.springboot.PINOKIO.dto.BrailleResponse;
import com.springboot.PINOKIO.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin
@RestController
@RequestMapping("image")
@RequiredArgsConstructor
public class ImageController {

    private final ImageService imageService;

    @GetMapping("braille")
    public ResponseEntity<BrailleResponse> BrailleUpload(@ModelAttribute("file") MultipartFile file) {
        return new ResponseEntity<>(imageService.brailleUpload(file), HttpStatus.OK);
    }
}
