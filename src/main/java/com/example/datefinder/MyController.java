package com.example.datefinder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class MyController {
    @GetMapping("/")
    public String getdatefinder(){
        LocalDate a=LocalDate.now();
        LocalDate b=a.plusDays(100);
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String strDate = b.format(format1);

        return strDate;
    }
}

