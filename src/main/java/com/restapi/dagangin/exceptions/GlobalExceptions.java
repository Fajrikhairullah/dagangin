package com.restapi.dagangin.exceptions;

import com.restapi.dagangin.entities.ResponseMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class GlobalExceptions extends ResponseEntityExceptionHandler {
    
    @ExceptionHandler(ApplicationExeption.class)
    public ResponseEntity<ResponseMessage<Object>> handleApplicationException(ApplicationExeption e) {
        ResponseMessage<Object> body = ResponseMessage.error(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage());
        return ResponseEntity.ok(body);
    }
    
}
