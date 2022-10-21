package com.example.getmessage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private String html = "<html><head><title>Message</title></head>"
            + "<body><i><p id=\"message\" style=\"color:red;\" >Hello World!</p></i></body></html>";
    @GetMapping("")
    public String getMessage() {
        return this.html;
    }
}
