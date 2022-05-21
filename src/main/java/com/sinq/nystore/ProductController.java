package com.sinq.nystore;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/owner")
    public String getProductOwner() {
        return "Nikhil";
    }
    
    @ExceptionHandler
    public String  PorcessError(){
        return "Something is gadbad";
    }
}
