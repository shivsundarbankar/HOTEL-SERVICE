package com.shivsundar.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResultNotFoundException.class)
    public ResponseEntity<Map<String, Object>> handlerResultNotFoundException(ResultNotFoundException exception){
        Map<String,Object> map = new HashMap();
        map.put("message",exception.getMessage());
        map.put("success",true);
        map.put("status", HttpStatus.NOT_FOUND);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
    }
}
