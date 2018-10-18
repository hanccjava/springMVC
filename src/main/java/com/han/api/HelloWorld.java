package com.han.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * sprinfMVC测试controller
 * Created by hpy on 2018/10/17.
 */
@RestController
public class HelloWorld {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHelloWorld() {
        try {
            return "Hello World";
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
