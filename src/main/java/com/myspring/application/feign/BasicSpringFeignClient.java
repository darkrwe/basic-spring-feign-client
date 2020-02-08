package com.myspring.application.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author emininal
 * @since 8.02.2020
 */

@FeignClient(name = "basicFeignClient", url = "https://github.com/darkrwe")
public interface BasicSpringFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    String getData();
}
