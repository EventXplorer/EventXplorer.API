package com.eventxplorer.EventXplorer.API.repository;

import com.eventxplorer.EventXplorer.API.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, String> {

}
