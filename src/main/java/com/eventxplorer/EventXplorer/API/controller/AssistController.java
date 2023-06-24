package com.eventxplorer.EventXplorer.API.controller;

import com.eventxplorer.EventXplorer.API.exception.UserNotFoundException;
import com.eventxplorer.EventXplorer.API.model.Assist;
import com.eventxplorer.EventXplorer.API.model.Event;
import com.eventxplorer.EventXplorer.API.service.AssistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "https://eventxplorer-firebase-au-647bc.web.app")
public class AssistController {
    @Autowired
    private AssistService assistService;

    //EndPoint:https://eventxplorer-firebase-au-647bc.web.app/assist
    //Method: GET
    @RequestMapping(value = "/assist", method = RequestMethod.GET)
    public ResponseEntity<Object> getAllAssists() {
        return new ResponseEntity<>(assistService.getAllAssists(), HttpStatus.OK);
    }
    //EndPoint:https://eventxplorer-firebase-au-647bc.web.app/assist
    //Method: POST
    @PostMapping("/assist")
    public ResponseEntity<Object> createAssist(@RequestBody Assist assist) {
        assistService.createAssist(assist);
        return new ResponseEntity<>("Assist is created successfully with id = " + assist.getId(), HttpStatus.CREATED);
    }
    //EndPoint:https://eventxplorer-firebase-au-647bc.web.app/assist/{id}
    //Method: GET
    @RequestMapping(value = "/assist/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getAssistById(@PathVariable("id") Long id) {
        boolean  isExist = assistService.isAssistExist(id);
        if (!isExist){
            throw  new UserNotFoundException();
        }else{
            Assist assist = assistService.getAssistById(id);
            return new ResponseEntity<>(assist, HttpStatus.OK);
        }
    }

}
