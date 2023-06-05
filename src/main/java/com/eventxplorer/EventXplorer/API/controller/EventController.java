package com.eventxplorer.EventXplorer.API.controller;

import com.eventxplorer.EventXplorer.API.model.Event;
import com.eventxplorer.EventXplorer.API.repository.EventRepository;
import com.eventxplorer.EventXplorer.API.repository.UserRepository;
import com.eventxplorer.EventXplorer.API.service.EventService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EventController {
    @Autowired
    private EventService eventService;


    //EndPoint:http://localhost:4200/event
    //Method: GET
    @RequestMapping(value = "/event", method = RequestMethod.GET)
    public ResponseEntity<Object> getAllEvents() {
        return new ResponseEntity<>(eventService.getAllEvents(), HttpStatus.OK);
    }

    //EndPoint:http://localhost:4200/event
    //Method: POST
    @RequestMapping(value = "/event", method = RequestMethod.POST)
    public ResponseEntity<Object> createEvent(@RequestBody Event event) {
        eventService.createEvent(event);
        return new ResponseEntity<>("Event is created successfully with id = " + event.getId(), HttpStatus.CREATED);
    }

}
