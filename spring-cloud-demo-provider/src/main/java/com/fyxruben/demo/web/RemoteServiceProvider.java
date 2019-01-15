package com.fyxruben.demo.web;

import com.fyxruben.demo.RemoteResp;
import com.fyxruben.demo.RemoteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;


@RestController
@RequestMapping("/provider")
public class RemoteServiceProvider implements RemoteService {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public RemoteResp findDetail(String name) {
        RemoteResp resp = new RemoteResp();
        resp.setId(UUID.randomUUID().toString());
        resp.setName(name + ":" + LocalDateTime.now().format(formatter));
        return resp;
    }
}
