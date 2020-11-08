package com.github.floushee.sbelk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LogController.class);

    @GetMapping("/debugMessage")
    public String getDebug() throws InterruptedException {
        log.debug("A debug log");
        return "A debug log";
    }

    @GetMapping("/infoMessage")
    public String getInfo() throws InterruptedException {
        log.info("An info log");
        return "An info log";
    }

    @GetMapping("/warnMessage")
    public String getWarn() throws InterruptedException {
        log.warn("A warn log");
        return "A warn log";
    }

    @GetMapping("/errorMessage")
    public String getError() throws InterruptedException {
        log.error("An error log");
        return "An error log";
    }

    @GetMapping("/exceptionMessage")
    public String getException() throws InterruptedException {
        log.error("An exception log", new IllegalStateException());
        return "An exception log";
    }
}
