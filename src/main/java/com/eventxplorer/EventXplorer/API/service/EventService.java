package com.eventxplorer.EventXplorer.API.service;

import com.eventxplorer.EventXplorer.API.model.Event;
import com.eventxplorer.EventXplorer.API.model.Payment;

import java.util.List;

public interface EventService {
    public abstract Event createEvent(Event event);
    public abstract Event updateEvent(Event event);
    public abstract Event getEventById(String id);
    public abstract List<Event> getAllEvents();
    public abstract void deleteEvent(String id);
    public abstract boolean isEventExist(String id);
}
