package com.helaoui.springboot2postgresqljpahibernatecrudexample.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author USER
 * @version 1.0
 * @created 07/09/2023 - 23:17
 * @project springboot2-postgresql-jpa-hibernate-crud-example
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String message){
        super(message);
    }
}
