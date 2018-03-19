package com.su.servicefeign.hystrix;

import com.su.servicefeign.feign.SchedualServiceHi;
import org.springframework.stereotype.Component;


@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return  "sorry "+name;
    }
}
