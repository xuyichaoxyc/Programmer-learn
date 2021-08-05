package com.example.configtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigGetController
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/8/5 14:08
 * @Version 1.0
 **/
@RestController
public class ConfigGetController {
    @Autowired
    private Environment env;

    @RequestMapping(value = "/getValue", method = RequestMethod.GET)
    public String getValue() {
        // parent-root-config-properties
        return env.getProperty("xyc.name");
    }

    @GetMapping("/getSecond")
    public String getSecond() {
        // parent-root-config-yml-second
        return env.getProperty("xyc.second");
    }

    @GetMapping("/getLocation")
    public String getLocation() {
        return env.getProperty("xyc.location");
    }

    @GetMapping("/getBoot")
    public String getBoot() {
        return env.getProperty("xyc.bootstrap");
    }
}
