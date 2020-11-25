package com.study.splunk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SplunkController {

    Logger logger = LoggerFactory.getLogger("splunk.logger");

    @GetMapping
    public String helloWorld() {
        logger.info("This is a test");
        logger.error("This is a error test");
        return "Hello World";
    }
}
