package org.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname EchoController
 * @Description TODO
 * @Date 2020/1/16 17:39
 * @Created by luoxz
 */
@RestController
public class EchoController {
    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string) {

        return "provider:Hello Nacos Discovery " + string;
    }
}
