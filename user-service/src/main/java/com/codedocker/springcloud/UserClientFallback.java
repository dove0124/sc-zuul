package com.codedocker.springcloud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class UserClientFallback implements BookFeignClient {

    @Override
    public List<Book> findByUid(Long id) {
        return new ArrayList<>();
    }
}
