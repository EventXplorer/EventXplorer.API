package com.eventxplorer.EventXplorer.API.service.impl;

import com.eventxplorer.EventXplorer.API.model.Event;
import com.eventxplorer.EventXplorer.API.repository.EventRepository;
import com.eventxplorer.EventXplorer.API.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;
    @Override
    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }
    @Override
    public Event updateEvent(Event event) {
        return eventRepository.save(event);
    }
    @Override
    public Event getEventById(String id) {
        return eventRepository.findById(id).get();
    }
    @Override
    public List<Event> getAllEvents() {
        return (List<Event>) eventRepository.findAll();
    }
    @Override
    public void deleteEvent(String id) {
        eventRepository.deleteById(id);
    }
    @Override
    public boolean isEventExist(String id) {
        return eventRepository.existsById(id);
    }

}

