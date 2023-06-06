package com.eventxplorer.EventXplorer.API.controller;

import com.eventxplorer.EventXplorer.API.exception.UserNotFoundException;
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
@CrossOrigin(origins = "https://eventxplorer-firebase-au-647bc.web.app")
public class EventController {
    @Autowired
    private EventService eventService;


    //EndPoint:http://localhost:8080/event
    //Method: GET
    @RequestMapping(value = "/event", method = RequestMethod.GET)
    public ResponseEntity<Object> getAllEvents() {
        return new ResponseEntity<>(eventService.getAllEvents(), HttpStatus.OK);
    }

    //EndPoint:http://localhost:8080/event
    //Method: POST
    @RequestMapping(value = "/event", method = RequestMethod.POST)
    public ResponseEntity<Object> createEvent(@RequestBody Event event) {
        eventService.createEvent(event);
        return new ResponseEntity<>("Event is created successfully with id = " + event.getId(), HttpStatus.CREATED);
    }

    //EndPoint:http://localhost:8080/event/{id}
    //Method: GET
    @RequestMapping(value = "/event/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getEventById(@PathVariable("id") String id) {
        boolean  isExist = eventService.isEventExist(id);
        if (!isExist){
            throw  new UserNotFoundException();
        }else{
            Event event = eventService.getEventById(id);
            return new ResponseEntity<>(event, HttpStatus.OK);
        }
    }

}
