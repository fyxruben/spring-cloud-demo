package com.fyxruben.demo.web;

import com.fyxruben.demo.RemoteService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "provider", path = "/provider")
public interface ProviderRemoteService extends RemoteService {
}
