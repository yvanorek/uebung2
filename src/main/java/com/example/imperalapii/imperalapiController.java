package com.example.imperalapii;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class imperalapiController {

    @RequestMapping("/")
    public String defaultwebsite(){
        return "type localhost:8080/inchToCentimeter in order to convert inchToCentimeter" + "<br>"+"type localhost:8080/yardtoMeter in order to convert yardtoMeter";
    }

    @RequestMapping("/inchToCentimeter")
    public double inchToCentimeter(@RequestParam double i){
        return i*2.54;
    }

    @RequestMapping("/yardToMeter")
    public String yardToMeter(@RequestParam double y){
        return String.format("%f yard are %f meter",y, y/1.0936133);
    }




}
