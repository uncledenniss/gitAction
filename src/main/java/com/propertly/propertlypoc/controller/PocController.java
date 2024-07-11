package com.propertly.propertlypoc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PocController {

    @GetMapping("/test")
    public String welcome(){
        return "Hurray! We are all set for Propertly!";
    }
}
