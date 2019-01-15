package com.fyxruben.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


public interface RemoteService {

    @GetMapping("/find-detail")
    RemoteResp findDetail(@RequestParam("name") String name);
}
