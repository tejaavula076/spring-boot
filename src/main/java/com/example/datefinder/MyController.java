package com.example.datefinder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
 
@RestController
public class MyController {
   @GetMapping("/")
    public String getDateFinder(){
       LocalDate a = LocalDate.now();
       DateTimeFormatter b =  DateTimeFormatter.ofPattern("dd-MM-YYYY");
       LocalDate one = a.plusDays(100);
        String c = one.format(b);
       return c;
   }

}
