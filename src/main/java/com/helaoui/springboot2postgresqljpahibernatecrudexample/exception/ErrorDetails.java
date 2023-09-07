package com.helaoui.springboot2postgresqljpahibernatecrudexample.exception;

import java.util.Date;

/**
 * @author USER
 * @version 1.0
 * @created 07/09/2023 - 23:14
 * @project springboot2-postgresql-jpa-hibernate-crud-example
 */
public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;

    public ErrorDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
