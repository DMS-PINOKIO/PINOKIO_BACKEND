package com.springboot.PINOKIO.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin
@RestController
@RequestMapping("/image")
public class ImageController {

    @GetMapping
    public String ImageUpload(@ModelAttribute("file") MultipartFile file) {
        //AI 호출
    }
}
