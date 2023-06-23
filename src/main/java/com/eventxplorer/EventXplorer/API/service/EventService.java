package com.eventxplorer.EventXplorer.API.service;

import com.eventxplorer.EventXplorer.API.model.Event;
import com.eventxplorer.EventXplorer.API.model.Payment;

import java.util.List;

public interface EventService {
    public abstract Event createEvent(Event event);
    public abstract Event updateEvent(Event event);
    public abstract Event getEventById(Long id);
    public abstract List<Event> getAllEvents();
    public abstract void deleteEvent(Long id);
    public abstract boolean isEventExist(Long id);
}
