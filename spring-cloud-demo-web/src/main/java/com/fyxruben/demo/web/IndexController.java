package com.fyxruben.demo.web;

import com.fyxruben.demo.RemoteResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private ProviderRemoteService remoteService;

    @GetMapping("/")
    public Object index() {
        RemoteResp resp = remoteService.findDetail("fyxruben");
        return new ModelMap().addAttribute("id", resp.getId())
                .addAttribute("name", resp.getName());
    }
}
