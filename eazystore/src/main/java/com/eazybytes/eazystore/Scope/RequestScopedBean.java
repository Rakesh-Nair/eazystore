package com.eazybytes.eazystore.Scope;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
@Getter
@Setter
@Slf4j
public class RequestScopedBean {
    private String userName;

    public RequestScopedBean() {
        log.info("RequestScopedBean created for Username " + this.userName);
    }
}
