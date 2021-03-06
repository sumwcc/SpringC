package com.su.servicefeign.feign;

import com.su.servicefeign.hystrix.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {


    @GetMapping("/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
