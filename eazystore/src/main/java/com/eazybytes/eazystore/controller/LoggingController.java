package com.eazybytes.eazystore.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/logging")
@Slf4j
public class LoggingController {

    //private static final Logger log = LoggerFactory.getLogger(LoggingController.class);

    @GetMapping
    public ResponseEntity<String> testLogging() {
        log.info("Info level log message");
        log.debug("Debug level log message");
        log.error("Error level log message");
        log.warn("Warn level log message");
        log.trace("Trace level log message");
        return ResponseEntity.ok().body("Logging tested successfully");
    }
}
