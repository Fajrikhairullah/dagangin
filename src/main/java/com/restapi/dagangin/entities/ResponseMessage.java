package com.restapi.dagangin.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.time.LocalDateTime;

public class ResponseMessage<ENT>{
    
    private int code;
    private String message;
    private ENT data;
    
    @JsonFormat(shape = Shape.STRING, pattern = "dd-MM-yy HH:mm:ss.SSS")
    private LocalDateTime timestamp;

    
    public static <ENT> ResponseMessage<ENT> error(int code, String message) {
        return new ResponseMessage<>(code, message, null);
    }
    
    public static <ENT> ResponseMessage<ENT> ok(int code, ENT data) {
        return new ResponseMessage<>(code, null, data);
    }

    public ResponseMessage() {
    }

    
    public ResponseMessage(int code, String message, ENT data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.timestamp = LocalDateTime.now();
    }
   

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ENT getData() {
        return data;
    }

    public void setData(ENT data) {
        this.data = data;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
    
    
}
