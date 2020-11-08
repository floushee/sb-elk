package com.github.floushee.sbelk;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledLog {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ScheduledLog.class);

    @Scheduled(fixedRate = 5000)
    public void logAMessage() {
        log.info("A scheduled log message");
    }
}
