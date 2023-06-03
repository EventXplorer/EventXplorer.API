package com.eventxplorer.EventXplorer.API.repository;

import com.eventxplorer.EventXplorer.API.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, String> {
}
