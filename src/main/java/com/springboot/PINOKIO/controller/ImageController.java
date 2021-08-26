package com.springboot.PINOKIO.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/image")
public class ImageController {

    @GetMapping("/")
    public String ImageUpload(@RequestParam("file") MultipartFile file) {
        //AI 호출

    }
}
