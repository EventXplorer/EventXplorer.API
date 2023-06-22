package com.eventxplorer.EventXplorer.API.repository;

import com.eventxplorer.EventXplorer.API.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, String> {

}
