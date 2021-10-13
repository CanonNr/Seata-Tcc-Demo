package com.example.web.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("web2")
public interface Web2Service {
    @GetMapping("/test/1")
    String get(@RequestParam Integer id);
}
