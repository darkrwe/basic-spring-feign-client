package com.myspring.application.controller;

import com.myspring.application.feign.BasicSpringFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author emininal
 * @since 8.02.2020
 */
@Controller
@RequestMapping("/api/v1/feign-test")
public class FeignTestController {

    @Autowired
    BasicSpringFeignClient basicSpringFeignClient;

    @GetMapping("/")
    public ResponseEntity<String> getSimplePageHtml() {
        return new ResponseEntity(basicSpringFeignClient.getData(), HttpStatus.OK);
    }
}
