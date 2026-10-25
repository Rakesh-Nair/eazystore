package com.eazybytes.eazystore.Scope;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
@Getter
@Slf4j
public class ApplicationScopedBean {

    private int visitorCount;

    public void incrementVisitorCount() {
        this.visitorCount++;
    }

    public ApplicationScopedBean() {
        log.info("ApplicationScopedBean has count " + this.visitorCount);
    }
}
