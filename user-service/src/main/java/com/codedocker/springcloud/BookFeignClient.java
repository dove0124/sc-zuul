package com.codedocker.springcloud;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "node-sidecar" , fallback=UserClientFallback.class)
public interface BookFeignClient {

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> findByUid(@RequestParam("uid") Long id);
}
