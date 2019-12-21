package com.kedacom.svms.synms.client;


import com.alibaba.fastjson.JSONObject;
import org.hibernate.service.spi.ServiceException;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "fs")
public interface FsClient {
    @PostMapping("/fs/file/byte")
    JSONObject uploadByteArray(@RequestBody byte[] bytes) throws ServiceException;
}
