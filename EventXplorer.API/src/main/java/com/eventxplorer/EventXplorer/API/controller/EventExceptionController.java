package com.eventxplorer.EventXplorer.API.controller;

import com.eventxplorer.EventXplorer.API.exception.EventNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EventExceptionController {
    @ExceptionHandler(value= EventNotFoundException.class)
    public ResponseEntity<Object> exception(EventNotFoundException exception) {
        return new ResponseEntity<>("Event not found", HttpStatus.NOT_FOUND);
    }
}
